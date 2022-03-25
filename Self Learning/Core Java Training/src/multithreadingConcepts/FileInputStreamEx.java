package multithreadingConcepts;

import java.io.FileInputStream;

public class FileInputStreamEx {
	public static void main(String[] args) {
		try {
			FileInputStream f1 = new FileInputStream("C:\\Users\\lenovo\\Desktop\\testfile.txt");
			int x = 0;
			while ((x = f1.read()) != -1) {
				System.out.print((char) x);
			}
			f1.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
