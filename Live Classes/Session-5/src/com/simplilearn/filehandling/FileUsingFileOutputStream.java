package com.simplilearn.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUsingFileOutputStream {

	public static void createFileUsingFileOutputStream() throws IOException {
//		String data="Hello Good Evening..!!!";
//		FileOutputStream out=new FileOutputStream("D:\\hello.txt");
//		
//		out.write(data.getBytes());
//		System.out.println("Data addedd successfully");
//		out.close();

		FileInputStream in = new FileInputStream("D:\\hello.txt");
		int x = 0;

		while ((x = in.read()) != -1) {
			System.out.print((char) x);
		}
	}

	public static void main(String[] args) throws IOException {
		createFileUsingFileOutputStream();
	}
}