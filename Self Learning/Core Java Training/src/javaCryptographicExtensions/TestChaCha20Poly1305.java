package javaCryptographicExtensions;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class TestChaCha20Poly1305 {
	public static void main(String[] args) throws Exception {
		String input = "ChaCha20Poly1305 Program Demonstration";

		ChaCha20Poly1305 ciper = new ChaCha20Poly1305();

		//SecretKey key = getkey();

		System.out.println("Input: " + input);
		System.out.println("Input(hex): " + convertBytesToHex(input.getBytes()));
	}

//	private static SecretKey getkey() throws NoSuchAlgorithmException {
//		// TODO Auto-generated method stub
//		KeyGenerator keyGen=KeyGenerator.getInstance("ChaCha20");
//		//keyGen.init(256, SecureRandom.getInstanceString(null));
//	}

	private static String convertBytesToHex(byte[] bytes) {
		// TODO Auto-generated method stub
		return null;
	}
}
