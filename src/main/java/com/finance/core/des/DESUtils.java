package com.finance.core.des;


import java.security.Key;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class DESUtils {
	private static Key key;
	private static String KEY_STR = "ffms";
	static {
		try {
			KeyGenerator generator = KeyGenerator.getInstance("DES");
			generator.init(new SecureRandom(KEY_STR.getBytes()));
			key = generator.generateKey();
			generator = null;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 瀵箂tr杩涜DES鍔犲瘑
	 * 
	 * @param str
	 * @return
	 */
	public static String getEncryptString(String str) {
		BASE64Encoder base64en = new BASE64Encoder();
		try {
			byte[] strBytes = str.getBytes("UTF8");
			Cipher cipher = Cipher.getInstance("DES");
			cipher.init(Cipher.ENCRYPT_MODE, key);
			byte[] encryptStrBytes = cipher.doFinal(strBytes);
			return base64en.encode(encryptStrBytes);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 瀵箂tr杩涜DES瑙ｅ瘑
	 * 
	 * @param str
	 * @return
	 */
	public static String getDecryptString(String str) {
		BASE64Decoder base64De = new BASE64Decoder();
		try {
			byte[] strBytes = base64De.decodeBuffer(str);
			Cipher cipher = Cipher.getInstance("DES");
			cipher.init(Cipher.DECRYPT_MODE, key);
			byte[] decryptStrBytes = cipher.doFinal(strBytes);
			return new String(decryptStrBytes, "UTF8");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	public static void main(String[] args) throws Exception {
//		if (args == null || args.length < 1) {
//			System.out.println("璇疯緭鍏ヨ鍔犲瘑鐨勫瓧绗︼紝鐢ㄧ┖鏍煎垎锟�");
//		} else {
//			for (String arg : args) {
//				System.out.println(arg + ":" + getEncryptString(arg));
//			}
//		}
		
		try {
			System.out.println(getEncryptString("root"));
			System.out.println(getEncryptString("123456"));
			System.out.println(getDecryptString("M4uyVNmTp8I="));
			System.out.println(getDecryptString("3Vtg/56BiWY="));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
