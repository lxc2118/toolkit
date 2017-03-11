package util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.function.Function;

public class FileUtil {

	/**
	 * 删除该目录下所有文件 仅保留目录
	 */
	public static void clear(File file) {
		if (!file.exists())
			file.mkdirs();
		else
			for (File child : file.listFiles())
				del(child);
	}

	/**
	 * 删除文件和目录
	 */
	public static void del(File file) {
		if (!file.exists())
			return;
		if (file.isDirectory())
			for (File child : file.listFiles())
				del(child);
		file.delete();
	}

	/**
	 * 遍历文件进行处理
	 * 
	 * @param file
	 * @param fun
	 *            //返回
	 */
	public static Boolean runEveryFile(File file, Function<File, Boolean> fun) {
		if (file == null || !file.exists() || fun == null)
			return true;
		if (file.isDirectory()) {
			for (File child : file.listFiles()) {
				Boolean ret = runEveryFile(child, fun);
				if (ret != null && ret)
					return true;
			}
		}
		return fun.apply(file);
	}
	
//	public static File toFile(byte[] bytes){
//		BufferedOutputStream bos = null;  
//        FileOutputStream fos = null;  
//        File file = null;  
//        try {  
//            File dir = new File(filePath);  
//            if(!dir.exists()&&dir.isDirectory()){
//                dir.mkdirs();  
//            }  
//            file = new File(filePath+"\\"+fileName);  
//            fos = new FileOutputStream(file);  
//            bos = new BufferedOutputStream(fos);  
//            bos.write(bfile);  
//        } catch (Exception e) {  
//            e.printStackTrace();  
//        } finally {  
//            if (bos != null) {  
//                try {  
//                    bos.close();  
//                } catch (IOException e1) {  
//                   e1.printStackTrace();  
//                }  
//            }  
//            if (fos != null) {  
//                try {  
//                    fos.close();  
//                } catch (IOException e1) {  
//                    e1.printStackTrace();  
//                }  
//            }  
//        }  
//		return null;
//	}

	/**
	 * 将文件转成二进制流
	 * 
	 * @param file
	 * @return
	 */
	public static byte[] file2bytes(File file) {
		if (file == null || file.isDirectory())
			return null;
		FileInputStream in;
		try {
			in = new FileInputStream(file);
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			byte[] bytes = new byte[1024];
			int len = 0;
			while ((len = in.read(bytes)) > 0) {
				out.write(bytes, 0, len);
			}
			out.close();
			in.close();
			return out.toByteArray();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 往文件中写东西
	 * 
	 * @param file
	 * @param str
	 */
	public static void write(File file, String str) {
		if (str == null)
			return;
		write(file, str.getBytes());
	}

	/**
	 * 往文件中写东西
	 * 
	 * @param file
	 * @param bytes
	 */
	public static void write(File file, InputStream in) {
		if (file == null || in == null)
			return;
		File parent = file.getParentFile();
		if (!parent.exists())
			parent.mkdirs();
		try {
			FileOutputStream out = new FileOutputStream(file);
			byte[] bs = new byte[1024 * 1024];
			int i = 0;
			while ((i = in.read(bs)) > 0) {
				out.write(bs, 0, i);
			}
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 往文件中写东西
	 * 
	 * @param file
	 * @param bytes
	 */
	public static void write(File file, byte[] bytes) {
		if (file == null || bytes == null)
			return;
		File parent = file.getParentFile();
		if (!parent.exists())
			parent.mkdirs();
		try {
			FileOutputStream out = new FileOutputStream(file);
			out.write(bytes);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据多个目录名构建一个目录
	 * 
	 * @param paths
	 * @return
	 */
	public static String buildPath(String... paths) {
		StringBuffer sb = new StringBuffer();
		if (paths != null) {
			for (String path : paths) {
				sb.append(path);
				if (!path.endsWith("/")) {
					sb.append("/");
				}
			}
		}
		return sb.toString();
	}

	/**
	 * 根据目录和文件名构建完整文件名
	 * 
	 * @param path
	 * @param fileName
	 * @return
	 */
	public static String buildFileName(String path, String fileName) {
		StringBuffer sb = new StringBuffer();
		sb.append(path);
		if (!path.endsWith("/")) {
			sb.append("/");
		}
		sb.append(fileName);
		return sb.toString();
	}

	/**
	 * 构建文件全路径，最后一个是文件名
	 * 
	 * @param paths
	 * @return
	 */
	public static String buildFullName(String... paths) {
		StringBuffer sb = new StringBuffer();
		if (paths != null) {
			int i = 0;
			for (String path : paths) {
				sb.append(path);
				i++;
				if (i < paths.length) {
					if (!path.endsWith("/")) {
						sb.append("/");
					}
				}
			}
		}
		return sb.toString();
	}

	/**
	 * 拷贝目录
	 * 
	 * @param src
	 * @param target
	 */
	public static void copy(String src, String target) {
		if (src == null || target == null)
			return;
		File srcFile = new File(src);
		copy(srcFile, target);
	}

	/**
	 * 拷贝目录
	 * 
	 * @param srcFile
	 * @param target
	 */
	public static void copy(File srcFile, String target) {
		if (srcFile == null || !srcFile.exists() || srcFile.isFile())
			return;
		if (!target.endsWith("/"))
			target = target + "/";
		File file = new File(target);
		if (!file.exists())
			file.mkdirs();
		if (srcFile.isDirectory()) {
			for (File f : srcFile.listFiles()) {
				if (f.isDirectory()) {
					String next = buildPath(target, f.getName());
					copy(f, next);
				} else {
					String fileName = buildFullName(target, f.getName());
					try {
						FileInputStream in = new FileInputStream(f);
						write(new File(fileName), getBytes(f));
						in.close();
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}

				}
			}
		}
	}

	/**
	 * 返回一个文件的字节码
	 * 
	 * @param f
	 * @return
	 */
	public static byte[] getBytes(File f) {
		if (f == null || f.isDirectory() || !f.exists())
			return null;
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
			FileInputStream is = new FileInputStream(f);
			byte[] bs = new byte[1024 * 1024];
			int i = 0;
			while ((i = is.read(bs)) > 0) {
				out.write(bs, 0, i);
			}
			is.close();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return out.toByteArray();
	}

	public static File buildFile(String path, String fileName) {
		return new File(buildFileName(path, fileName));
	}

	/**
	 * 查询文件的编码
	 */
	public static String getCharSet(String fileName) {
		try {
			return EncodeUtil.getCharset(new FileInputStream(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

}
