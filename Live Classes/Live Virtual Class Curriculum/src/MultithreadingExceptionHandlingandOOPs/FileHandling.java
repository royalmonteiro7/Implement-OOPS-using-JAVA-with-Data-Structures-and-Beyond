package MultithreadingExceptionHandlingandOOPs;

import java.io.*;
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

	public void read(String fileName) {
		try {
			BufferedReader buffered_reader = new BufferedReader(new FileReader(fileName));
			String reading = buffered_reader.readLine();
			while (reading != null) {
				System.out.println(reading);
				reading = buffered_reader.readLine();
			}
			buffered_reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void write(String fileName, String data) {
		try {
			PrintWriter print_writer = new PrintWriter(new FileWriter(fileName, true));
			print_writer.print(data);
			print_writer.println();
			print_writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void append(String fileName, String data) {
		try {
			PrintWriter print_writer = new PrintWriter(new FileWriter(fileName, true));
			if (fileName.length() == 0) {
				print_writer.print(data);
			} else {
				print_writer.print("\n" + data);
			}
			print_writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		FileHandling file_handling = new FileHandling();
		Scanner scanner = new Scanner(System.in);
		BufferedReader buffered_reader = new BufferedReader(new InputStreamReader(System.in));
		int action;
		String file_name;

		while (true) {
			System.out.print("1. Create New File" + "\n" + "2. Write in file" + "\n" + "3. Append in file" + "\n"
					+ "4. Read from file");
			System.out.println("\nPlease Enter Your Choice");
			action = scanner.nextInt();
			switch (action) {
			case 1:
				System.out.println("Please enter file name : ");
				file_name = scanner.next();
				scanner.nextLine();
				file_handling.createFile(file_name);
				break;
			case 2:
				System.out.println("Please enter file name : ");
				file_name = scanner.next();
				scanner.nextLine();
				System.out.println("Please enter what you want to write in file : ");
				String data = buffered_reader.readLine();
				file_handling.write(file_name, data);
				while (true) {
					System.out.println("For write more enter Y else N : ");
					char action2 = scanner.next().charAt(0);
					scanner.nextLine();
					if (action2 == 'y' || action2 == 'y') {
						System.out.println("Please enter what you want to insert in file : ");
						data = buffered_reader.readLine();
						file_handling.write(file_name, data);
					} else if (action2 == 'n' || action2 == 'N')
						break;
					else {
						System.out.println("Please enter a valid character (y/n) or (Y/N)");
						action2 = scanner.next().charAt(0);
						scanner.nextLine();
					}
				}
				break;
			case 3:
				System.out.println("Please enter file name : ");
				file_name = scanner.next();
				scanner.nextLine();
				System.out.println("Please enter what you want to write in file : ");
				String data1 = buffered_reader.readLine();
				file_handling.append(file_name, data1);
				while (true) {
					System.out.println("For write more enter Y else N : ");
					char action2 = scanner.next().charAt(0);
					scanner.nextLine();
					if (action2 == 'y' || action2 == 'y') {
						System.out.println("Please enter what you want to insert in file : ");
						data1 = buffered_reader.readLine();
						file_handling.append(file_name, data1);
					} else if (action2 == 'n' || action2 == 'N')
						break;
					else {
						System.out.println("Please enter a valid character (y/n) or (Y/N)");
						action2 = scanner.next().charAt(0);
						scanner.nextLine();
					}
				}
				break;
			case 4:
				System.out.println("Please enter file name : ");
				file_name = scanner.next();
				scanner.nextLine();
				file_handling.read(file_name);
				break;
			default:
				System.out.println("Invalid input please try again !");
			}
			System.out.println("For continue enter y or Y for close enter n or N : ");
			char close = scanner.next().charAt(0);
			scanner.nextLine();
			if (close == 'y' || close == 'Y') {
				continue;
			} else if (close == 'n' || close == 'N')
				break;
			else {
				System.out.println("Please enter a valid character (y/n) or (Y/N) : ");
				close = scanner.next().charAt(0);
				scanner.nextLine();
			}
		}
		scanner.close();
	}
}