package com.dragon.warIII.base64;

import java.nio.charset.StandardCharsets;

import org.apache.commons.codec.binary.Base64;

/**
 * @description 功能描述: Base64工具类
 * @author 作 者: L.D
 * @createdate 建立日期：2016-8-30
 * @projectname 项目名称:  Java_001_EncryptionAndDecryption
 * @packageclass 包及类名: com.dragon.warIII.base64  Base64Util.java
 */
public class Base64Util {
		
	/**
	 * <p>1.加密,返回数据为String类型</p>
	 */
	public static String encode(final byte[] bytes) {
		return Base64.encodeBase64String(bytes);
	}
	
	/**
	 * <p>2.解密,返回数据为String类型</p>
	 */
	public static String decode(final byte[] bytes) {
		return new String(Base64.decodeBase64(bytes));
	}
	
	/**
	 * <p>3.加密,返回数据为byte[]类型</p>
	 */
	public static byte[] encodee(final byte[] bytes) {
		return Base64.encodeBase64(bytes);
	}
	
	/**
	 * <p>4.解密,返回数据为byte[]类型</p>
	 */
	public static byte[] decodee(final byte[] bytes) {
		return Base64.decodeBase64(bytes);
	}
	
}





