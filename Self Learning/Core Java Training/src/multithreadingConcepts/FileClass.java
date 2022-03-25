package multithreadingConcepts;

import java.io.File;

public class FileClass {
	public static void main(String[] a) {
		String filename = a[0];
		File f1 = new File(filename);
		System.out.println("Name of the file= " + f1.getName());
		System.out.println("Path of the file= " + f1.getPath());
		System.out.println("Absoulte Path of the file= " + f1.getAbsolutePath());
		System.out.println("Parent of the file= " + f1.getParent());
		System.out.println("Is file exists= " + f1.exists());
		if (f1.exists()) {
			System.out.println("Is it writeable= " + f1.canWrite());
			System.out.println("Is it readable= " + f1.canRead());
			System.out.println("Is it a directory= " + f1.isDirectory());
			System.out.println("file size in bytes= " + f1.length());
		}

	}
}
