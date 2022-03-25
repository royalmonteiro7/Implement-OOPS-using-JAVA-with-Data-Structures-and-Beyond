package multithreadingConcepts;

import java.io.FileOutputStream;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		try {
			FileOutputStream f1 = new FileOutputStream("C:\\Users\\lenovo\\Desktop\\testfile.txt");
			String s1 = "welcome to learn IO Stream";
			byte b1[] = s1.getBytes();
			f1.write(b1);
			f1.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
