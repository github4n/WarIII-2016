package com.dragon.warIII.test.certificate;

import org.junit.Ignore;
import org.junit.Test;

import com.dragon.warIII.certificate.CertificateUtil;

public class CertificateUtilTest {
	
	@Ignore
	@Test
	public void testEncode() {
		String source = "真他妈的日了狗了!!!";
		String sourceEncoded = CertificateUtil.encode(source);
		System.err.println("密文：" + sourceEncoded);
		System.err.println("长度：" + sourceEncoded.length());
		
		/*		
		 * 密文：ihACBw2n/LUxf0FefsUwACGFnLGvKcOkP7vVj5zM+vXZLa+wO9Z+QQ3ZmXuep4VBCmNZuxCLYcXTqrLYtd/n6b8ax/nNnyrCwvwrTLTVtD4dUUdZG4NIsbaFrwhCfsca04F15n7zrxGcSq5Vl5K2sZpQ3RwZ8Q+rZ1w9l7iik36wc6bTcjQgwFVhYX9/MVsmnVG4oLTXJq/hYU9cmM3AKDWa7db3lf+Ohlnl1CzkscwnVJwBCiaFAA6PkNUS8r+krEbT4FKwsWQiqn3aQJs+zIfOBSKf4YrexT0HXcUpZn/NJ7reGSlxFbtooHxe5kODg7BGtsucYFlHITs4ojiZ7w==
		 * 长度：344
		 */
		
	}
	
	@Ignore
	@Test
	public void testDecrypt() {
		String source = "ihACBw2n/LUxf0FefsUwACGFnLGvKcOkP7vVj5zM+vXZLa+wO9Z+QQ3ZmXuep4VBCmNZuxCLYcXTqrLYtd/n6b8ax/nNnyrCwvwrTLTVtD4dUUdZG4NIsbaFrwhCfsca04F15n7zrxGcSq5Vl5K2sZpQ3RwZ8Q+rZ1w9l7iik36wc6bTcjQgwFVhYX9/MVsmnVG4oLTXJq/hYU9cmM3AKDWa7db3lf+Ohlnl1CzkscwnVJwBCiaFAA6PkNUS8r+krEbT4FKwsWQiqn3aQJs+zIfOBSKf4YrexT0HXcUpZn/NJ7reGSlxFbtooHxe5kODg7BGtsucYFlHITs4ojiZ7w==";
		String sourceDecrypted = CertificateUtil.decrypt(source);
		System.out.println("解密后的明文：" + sourceDecrypted);
		/*
         * 解密后的明文：真他妈的日了狗了!!!
		 */
	}
}
