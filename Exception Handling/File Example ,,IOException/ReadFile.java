
import java.io.*;
import java.util.*;

// example of Read File 
class ReadFile{

	static void readFile(String fileName) throws IOException{

		FileReader file=new FileReader(fileName);

		//int file.read()-1
		// we have to conver int --> char

		int value=file.read();

		while (value!=-1) {

			System.out.print((char)value);

			value=file.read();
			
		}

	}
	
	static String takeFileName() throws IOException{

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter File Name With Path :");

		return scanner.nextLine();
	}

public static void main(String[] args)  {
 try {
            String fileName = takeFileName();
            readFile(fileName);
            System.out.println("File Read Successfully");
        } catch (IOException e) {
            System.out.println("message: " + e.getMessage());
        }
	
}

}