import java.util.HashMap;
import java.util.Scanner;

public class Word_Dictionary {

	public static void main(String[] args) {
		HashMap<String, String> dicc = new HashMap<String, String>();
		dicc.put("sky", "cielo");
		dicc.put("pencil", "lapiz"); 
		dicc.put("water", "agua");
		dicc.put("computer", "computadora");
		dicc.put("grandmother", "abuela");

		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Enter any word in Eng (q to exit) : "); 
			String eng = sc.next();

			if(eng.equals("q")) {
				break;
			}
			if(dicc.get(eng) == null) {
				System.out.println("Incorrect input.");
			}
			else {
				System.out.println("Spanish: " + dicc.get(eng));
			}
		}while(true);
		System.out.println("Program exits...");
	}

	}
