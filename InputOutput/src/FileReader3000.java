// September 5th 2022

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader3000 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Backslash (\) vs. Forward Slash (/)
		File file = new File("\\Users\\lsy76\\OneDrive\\바탕 화면\\captmidn.txt");
		Scanner scan = new Scanner(file);
		
		//System.out.println(scan.nextLine()); // only first line 
		
		
//		while(scan.hasNextLine()) {
//			System.out.println(scan.nextLine());
//		}
//		
		String fileContent = "This is a new file made by us.";
		while(scan.hasNextLine()) {
		fileContent = fileContent.concat(scan.nextLine() + "\n");
	}
		
		FileWriter writer = new FileWriter("\\Users\\lsy76\\OneDrive\\바탕 화면\\newFile.txt");
		writer.write(fileContent);
		writer.close();
		
		
		
		

		
	}

}
