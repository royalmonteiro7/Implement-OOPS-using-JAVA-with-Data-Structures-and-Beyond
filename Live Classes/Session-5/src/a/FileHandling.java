package a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
	public void createFile(String fileName) {
		File new_file = new File(fileName);
		if (new_file.exists()) {
			System.out.println("Another file with this name is already exists please try with another name !");
		} else {
			try {
				new_file.createNewFile();
				System.out.println("File created successfully with name : " + new_file.getName());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		FileHandling file_handling = new FileHandling();
		Scanner scanner = new Scanner(System.in);
		int action;
		String file_name;
		System.out.print("1. Create New File" + "\n" + "2. Write in file" + "\n" + "3. Append in file" + "\n"
				+ "4. Read from file");
		System.out.println("\nPlease Enter Your Choice");
		action = scanner.nextInt();
		switch (action) {
		case 1:
			System.out.println("Please enter file name : ");
			file_name = scanner.next();

			file_handling.createFile(file_name);
			break;
		}
		
	}
}
