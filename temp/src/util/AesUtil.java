package util;


import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * Created by hawthorn on 15-5-15.
 *
 * I:
 *      pad right to 16*N
 * II:
 *      AES.encrypt
 * III:
 *      Base64
 *
 */
public class AesUtil {

	private static final int blocksize = 16;
    
    private static final String  model ="AES/ECB/NoPadding";

    /**
     * AES + Base64
     * @param key
     * @param plain
     * @return
     * @throws Exception
     */
    public static String encrypt(String key, String plain)  {
    	if(key==null) return null;
    	if(key.length()>16) key = key.substring(0,16);
    	int len = plain.getBytes().length;
        int l = blocksize - ( len % blocksize);
        if(l==blocksize)
        	l = 0;
        byte[] bs = new byte[len+l];
        System.arraycopy(plain.getBytes(), 0, bs, 0, len);
        for(int i=len;i<len+l;i++){
        	bs[i] = ' '; //补空格
        }
        byte[] encrypted = null;
		try {
			encrypted = encrypt(key.getBytes(),bs);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
        return Base64.getEncoder().encodeToString(encrypted);
    }

    private static byte[] encrypt(byte[] key, byte[] src) throws Exception {
        SecretKeySpec sks = new SecretKeySpec(key, "AES");
        Cipher cipher = Cipher.getInstance(model);
        cipher.init(Cipher.ENCRYPT_MODE, sks);
        byte[] encrypted = cipher.doFinal(src);

        return encrypted;
    }

    /**
     * de-AES + de-Base64
     * @param key
     * @param encrypted
     * @return
     * @throws Exception
     */
    public static String decrypt(String key, String encrypted) {
    	if(key==null) return null;
    	if(key.length()>16) key = key.substring(0,16);
        byte[] decrypted = Base64.getDecoder().decode(encrypted);
       
        try {
			return new String(decrypt(key.getBytes(), decrypted));
		} catch (Exception e) {
			
			return "";
		}
    }

    private static byte[] decrypt(byte[] key, byte[] encrypted) throws Exception {
        SecretKeySpec sks = new SecretKeySpec(key, "AES");
        Cipher cipher = Cipher.getInstance(model);
        cipher.init(Cipher.DECRYPT_MODE, sks);
        byte[] decrypted = cipher.doFinal(encrypted);
        return decrypted;
    }

   
    public static void main(String[] args) throws Exception{
    	String pain = "123456789";
    	String code = encrypt("abcdefghabcdefgh",pain);
    	System.out.println(code);
    	
    	code = decrypt("abcdefghabcdefgh", code);
    	System.out.println(code+"#");
    	
    }
}
