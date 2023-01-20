package caesars.cipher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarsCipherTest {
	private CaesarsCipher caesarCipher = new CaesarsCipher();

	@Test
	void testCipheredMessagewithoffset12(){
		assertEquals("Zai SdW kag Va[`Y faVSk",caesarCipher.cipher("how are you doing today", 12));
}
	@Test
	void testEmptyString() {
		assertEquals("",caesarCipher.cipher("",12));
	}

	@Test
	void testCipherMessagewithoffsetof11(){
	̄	assertEquals("Zai SdW kag Va[`Y faVSk",caesarCipher.cipher("how are doing",11));
	}
}
