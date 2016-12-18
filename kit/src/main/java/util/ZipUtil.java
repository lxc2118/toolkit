package util;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;

/**
 * zipUtil based on zip4j
 * 
 * @author lxc
 * @date 2016/11/20 13:17:26
 */
public class ZipUtil {
	
	/**
	 * 解压zip到指定目录
	 * 如果指定目录不存在,自动创建
	 * 无密码
	 * @param file
	 * @param destPath
	 * @throws ZipException
	 */
	public static void upzip(File file, String destPath) throws ZipException {
		unzip(file, destPath, null);
	}
	
	/**
	 * 解压zip到指定目录
	 * 如果指定目录不存在,自动创建
	 * 有密码
	 * @param src
	 * @param dest
	 * @param password
	 * @throws ZipException 压缩文件损坏或解压缩失败
	 */
	public static void unzip(String src, String dest, String password) throws ZipException {
		File zip = new File(src);
		unzip(zip, dest, password);
	}

	/**
	 * 解压zip到当前目录
	 * @param file
	 * @param password
	 * @throws ZipException 压缩文件损坏或解压缩失败
	 */
	public static void unzip(String file, String password) throws ZipException {
		File zip = new File(file);
		File parentfile = zip.getParentFile();
		unzip(zip, parentfile.getAbsolutePath(), password);
	}

	/**
	 * 解压文件
	 * @param file
	 * @param destPath
	 * @param password
	 * @throws ZipException
	 */
	public static void unzip(File file, String destPath, String password) throws ZipException {
		ZipFile zipFile = new ZipFile(file);
		doUnzip(zipFile, destPath, password);
	}

	/**
	 * TODO
	 * 解压并获得文件
	 * @param file
	 * @return
	 */
	public static File[] unzipGetFiles(File file, String destPath, String password) throws ZipException  {
		ZipFile zipFile = new ZipFile(file);
		doUnzip(zipFile, destPath, password);
		List<FileHeader> fileHeaderList = zipFile.getFileHeaders();
		List<File> extractedFileList = new ArrayList<File>();
		for (FileHeader fileHeader : fileHeaderList) {
			if (!fileHeader.isDirectory()) {
				extractedFileList.add(new File(destPath, fileHeader.getFileName()));
			}
		}
		File[] extractedFiles = new File[extractedFileList.size()];
		extractedFileList.toArray(extractedFiles);
		return extractedFiles;
	}
	
	/**
	 * 真正的解压操作
	 * @param zipFile
	 * @param destPath
	 * @param password
	 * @throws ZipException
	 */
	private static void doUnzip(ZipFile zipFile, String destPath, String password) throws ZipException{
		zipFile.setFileNameCharset("GBK");
		if (!zipFile.isValidZipFile())
			throw new ZipException("压缩文件不合法,可能已损坏");
		File targetFile = new File(destPath);
		if (targetFile.isDirectory() && !targetFile.exists())
			targetFile.mkdir();
		if (zipFile.isEncrypted() && password != null)
			zipFile.setPassword(password.toCharArray());
		zipFile.extractAll(destPath);
	}

	/**
	 * 压缩文件到当前文件夹
	 * 
	 * @param src
	 *            要压缩的指定文件
	 * @return 最终的压缩文件存放的绝对路径,如果为null则说明压缩失败.
	 */
	public static String zip(String file) {
		return zip(file, null);
	}

	/**
	 * 使用给定密码压缩指定文件或文件夹到当前目录
	 * 
	 * @param src
	 *            要压缩的文件
	 * @param password
	 *            压缩使用的密码
	 * @return 最终的压缩文件存放的绝对路径,如果为null则说明压缩失败.
	 */
	public static String zip(String file, String password) {
		return zip(file, null, password);
	}

	/**
	 * 使用给定密码压缩指定文件或文件夹到当前目录
	 * 
	 * @param src
	 *            要压缩的文件
	 * @param dest
	 *            压缩文件存放路径
	 * @param password
	 *            压缩使用的密码
	 * @return 最终的压缩文件存放的绝对路径,如果为null则说明压缩失败.
	 */
	public static String zip(String src, String dest, String password) {
		return zip(src, dest, true, password);
	}

	/**
	 * 使用给定密码压缩指定文件或文件夹到指定位置.
	 * <p>
	 * dest可传最终压缩文件存放的绝对路径,也可以传存放目录,也可以传null或者"".<br />
	 * 如果传null或者""则将压缩文件存放在当前目录,即跟源文件同目录,压缩文件名取源文件名,以.zip为后缀;<br />
	 * 如果以路径分隔符(File.separator)结尾,则视为目录,压缩文件名取源文件名,以.zip为后缀,否则视为文件名.
	 * 
	 * @param src
	 *            要压缩的文件或文件夹路径
	 * @param dest
	 *            压缩文件存放路径
	 * @param isCreateDir
	 *            是否在压缩文件里创建目录,仅在压缩文件为目录时有效.<br />
	 *            如果为false,将直接压缩目录下文件到压缩文件.
	 * @param password
	 *            压缩使用的密码
	 * @return 最终的压缩文件存放的绝对路径,如果为null则说明压缩失败.
	 */
	public static String zip(String src, String dest, boolean isCreateDir, String password) {
		File srcFile = new File(src);
//		TODO 
//		dest = buildDestinationZipFilePath(srcFile, dest);
		ZipParameters parameters = new ZipParameters();
		// 压缩方式
		parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE); 
		// 压缩级别
		parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
		if (!StringUtils.isEmpty(password)) {
			parameters.setEncryptFiles(true);
			// 加密方式
			parameters.setEncryptionMethod(Zip4jConstants.ENC_METHOD_STANDARD);
			parameters.setPassword(password.toCharArray());
		}
		try {
			ZipFile zipFile = new ZipFile(dest);
			if (srcFile.isDirectory()) {
				// 如果不创建目录的话,将直接把给定目录下的文件压缩到压缩文件,即没有目录结构
				if (!isCreateDir) {
					File[] subFiles = srcFile.listFiles();
					ArrayList<File> temp = new ArrayList<File>();
					Collections.addAll(temp, subFiles);
					zipFile.addFiles(temp, parameters);
					return dest;
				}
				zipFile.addFolder(srcFile, parameters);
			} else {
				zipFile.addFile(srcFile, parameters);
			}
			return dest;
		} catch (ZipException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 构建压缩文件存放路径,如果不存在将会创建 传入的可能是文件名或者目录,也可能不传,此方法用以转换最终压缩文件的存放路径
	 * 
	 * @param srcFile
	 *            源文件
	 * @param destPath
	 *            压缩目标路径
	 * @return 正确的压缩文件存放路径
	 */
	private static void buildDestinationZipFilePath(File file, String destPath) {
		if (StringUtils.isEmpty(destPath)) {
			if (file.isDirectory()) {
				destPath = file.getParent() + File.separator + file.getName() + ".zip";
			} else {
				String fileName = file.getName().substring(0, file.getName().lastIndexOf("."));
				destPath = file.getParent() + File.separator + fileName + ".zip";
			}
		} else {
			createDestDirectory(destPath); // 在指定路径不存在的情况下将其创建出来
			if (destPath.endsWith(File.separator)) {
				String fileName = "";
				if (file.isDirectory()) {
					fileName = file.getName();
				} else {
					fileName = file.getName().substring(0, file.getName().lastIndexOf("."));
				}
				destPath += fileName + ".zip";
			}
		}
	}

	/**
	 * 在必要的情况下创建压缩文件存放目录,比如指定的存放路径并没有被创建
	 * 
	 * @param destParam
	 *            指定的存放路径,有可能该路径并没有被创建
	 */
	private static void createDestDirectory(String destParam) {
		File destDir = null;
		if (destParam.endsWith(File.separator))
			destDir = new File(destParam);
		else
			destDir = new File(destParam.substring(0, destParam.lastIndexOf(File.separator)));
		if (!destDir.exists()) 
			destDir.mkdirs();
	}

}
