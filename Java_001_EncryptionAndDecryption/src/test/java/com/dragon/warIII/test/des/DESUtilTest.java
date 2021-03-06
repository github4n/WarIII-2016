package com.dragon.warIII.test.des;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import org.junit.Ignore;
import org.junit.Test;

import com.dragon.warIII.base64.Base64Util;
import com.dragon.warIII.des.DESUtil;

public class DESUtilTest {

	@Ignore
	@Test
	public void encryptTest() {
		String str = "REQSERIAL=001&CUSTARGNO=001&MERCHANTNO=N3713585&MOBILE=15068821597";
		String key = "Q5sJtidC";
		System.out.println(key.length());
		byte[] arr = DESUtil.encrypt(str.getBytes(StandardCharsets.UTF_8), key);
		//[-55, -52, 10, -96, -51, -29, -122, -62, -113, -126, -23, 44, -108, -86, -93, 69, 15, -92, -12, 88, 125, 102, -9, 98, -115, -109, 33, 39, -34, -96, -85, -35, 66, -80, 22, 83, -69, 84, 91, 125, 80, 29, -13, -3, -112, -24, -45, 8, 112, -8, -35, -79, -91, -79, -104, 69, 16, 55, 14, 52, 27, -119, 107, 88, 126, 103, 3, 125, 18, 28, -52, 103]
		System.out.println(Arrays.toString(arr));
		System.out.println(Base64Util.encode(arr));
		//ycwKoM3jhsKPgukslKqjRQ+k9Fh9ZvdijZMhJ96gq91CsBZTu1RbfVAd8/2Q6NMIcPjdsaWxmEUQNw40G4lrWH5nA30SHMxn
	}
	
//	@Ignore
	@Test
	public void decryptTest() {
		
		String str = "ycwKoM3jhsKPgukslKqjRQ+k9Fh9ZvdijZMhJ96gq91CsBZTu1RbfVAd8/2Q6NMIcPjdsaWxmEUQNw40G4lrWH5nA30SHMxn";
		String key = "Q5sJtidC";
		byte[] arr =  Base64Util.decodee(str.getBytes());
		//System.out.println(Arrays.toString(src));
		System.out.println(new String(DESUtil.decrypt(arr, key)));
		//REQSERIAL=001&CUSTARGNO=001&MERCHANTNO=N3713585&MOBILE=15068821597
	}
	
	@Test
	public void test() {
		String str = "aaa";
		System.out.println(Arrays.toString(str.getBytes()));
	}
}










