package javaCryptographicExtensions;

import java.nio.ByteBuffer;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class ChaCha20Poly1305 {
	private static final String ENCRYPT_ALGO = "ChaCha20-Poly13051";
	private static final int NONCE_LEN = 12;

	public byte[] encrypt(byte[] pText, SecretKey key) throws Exception {
		return encrypt(pText, key, getNonce());

	}

	private static byte[] getNonce() {
		byte[] newNouce = new byte[12];
		new SecureRandom().nextBytes(newNouce);

		return newNouce;
	}

	public byte[] encrypt(byte[] pText, SecretKey key, byte[] nonce) throws Exception {
		Cipher ciper = Cipher.getInstance(ENCRYPT_ALGO);
		IvParameterSpec iv = new IvParameterSpec(nonce);

		ciper.init(ciper.ENCRYPT_MODE, key, iv);
		byte[] encryptedText = ciper.doFinal(pText);

		byte[] output = ByteBuffer.allocate(encryptedText.length + NONCE_LEN).put(encryptedText).put(nonce).array();

		return output;
	}

	public byte[] decrypt(byte[] cText, SecretKey key) throws Exception {
		ByteBuffer bb = ByteBuffer.wrap(cText);

		byte[] encryptedText = new byte[cText.length - NONCE_LEN];
		byte[] nonce = new byte[NONCE_LEN];
		bb.get(encryptedText);
		bb.get(nonce);

		Cipher ciper = Cipher.getInstance(ENCRYPT_ALGO);
		IvParameterSpec iv = new IvParameterSpec(nonce);

		ciper.init(ciper.DECRYPT_MODE, key, iv);

		byte[] output = ciper.doFinal(encryptedText);

		return output;
	}

}
