package com.dragon.warIII.test.rsa;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;

import org.junit.Ignore;
import org.junit.Test;

import com.dragon.warIII.rsa.RSAUtil;

public class RSAUtilTest {

	@Ignore
	@Test
	public void rsaTest() {
		HashMap<String, Object> map = RSAUtil.getKeys();
		//生成公钥和私钥
		RSAPublicKey publicKey = (RSAPublicKey) map.get("public");
		RSAPrivateKey privateKey = (RSAPrivateKey) map.get("private");
		//模
		String modulus = publicKey.getModulus().toString();
		//公钥指数
		String public_exponent = publicKey.getPublicExponent().toString();
		//私钥指数
		String private_exponent = privateKey.getPrivateExponent().toString();
		//明文
		String ming = "你好,接头暗号是什么？";
		//使用模和指数生成公钥和私钥
		RSAPublicKey pubKey = RSAUtil.getPublicKey(modulus, public_exponent);
		System.out.println("公钥：" + pubKey);
		RSAPrivateKey priKey = RSAUtil.getPrivateKey(modulus, private_exponent);
		System.out.println("私钥：" + pubKey);
		
		//加密后的密文
		String mi = RSAUtil.encryptByPublicKey(ming, pubKey);
		System.err.println("密文：" + mi);
		
		//解密后的明文
		ming = RSAUtil.decryptByPrivateKey(mi, priKey);
		System.err.println("明文：" + ming);
		
		/*		
 		私钥：Sun RSA public key, 1024 bits
		  modulus: 139165824049206376458618947619311587113180491601150041758027126218903599897898687887086043584459118461789911804294045546113913266750276305853175116499843336907893861176368474179555118555804570194861216973828381632083809347677692027512975316663790260600231249635295978821917742325549954124752098694214462217251
		  public exponent: 65537
		密文：6A6A8B72165BE3A2504FD7568B3FB8246C4830DDA640963313420ACF429E9923AFE67A97BF68F3A31A1DECEA01BFE7D7ACF87988E5FF82DE1C90F6ADECB010A8467845E6AADB5F60E6901122F655CC74E00E6A11C13A400E5C6AAEFC2BE55AEE070CB6DFD483F70EF9700B462EC90D8685E45ECBB5FBDBBCDF195D4FBEDB477E128
		明文：你好,接头暗号是什么？
		*/
	}
}







