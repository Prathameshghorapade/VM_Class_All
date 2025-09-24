
import java.io.*;
import java.util.*;

// example of Create File 
class FileExample{

	static void createFile(String fileName) throws IOException{

		File file=new File(fileName);
        file.createNewFile();

	}
	
	static String takeFileName() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter File Name :");

		return scanner.nextLine();
	}

public static void main(String[] args) throws IOException {


	String fileName=takeFileName();
	createFile(fileName);

	System.out.println("File Created");


	
	
}

}