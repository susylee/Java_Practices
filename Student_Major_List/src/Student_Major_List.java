import java.util.ArrayList;
import java.util.Scanner;

class StudentInfo {
	private String name;
	private int stuNumber;
	private String major;

	public StudentInfo(String name, int stuNumber, String major) {
		super();
		this.name = name;
		this.stuNumber = stuNumber;
		this.major = major;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStuNumber() {
		return stuNumber;
	}
	public void setStuNumber(int stuNumber) {
		this.stuNumber = stuNumber;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
}
public class Student_Major_List{

	static Scanner input = new Scanner(System.in);
	static ArrayList<StudentInfo> list = new ArrayList<StudentInfo>();

	public static void main(String[] args) {
		String name, major;
		int stuNumber;

		while(true) {
			System.out.println("This is a Student management program made by Suyeoun.");
			System.out.print("1)Add\t 2)Delete\t 3)Update\t 4)Display\t 5)Exit >> ");	
			int num = input.nextInt();

			switch(num) {
			case 1: 
				addInfo();
				break;
			case 2:
				deleteInfo();
				break;
			case 3:
				updateInfo();
				break;
			case 4:
				displayInfo();
				break;
			case 5: 
				System.out.println("Program exits...");
				System.exit(0);
			default: System.out.println("Input only 1~5.");
			
			} //switch
		} //while

	} //main
	
	static void addInfo() {
		String name, major;
		int stuNumber;
		
		System.out.print("Enter student's name: ");
		name = input.next();
		System.out.print("Student's number: ");
		stuNumber = input.nextInt();
		System.out.print("Student's major: ");
		major = input.next();

		StudentInfo info = new StudentInfo(name, stuNumber, major);
		list.add(info);
	} //addInfo()
	
	static void deleteInfo() {
		String name, major;
		int stuNumber;
		boolean flag = false;
		
		System.out.print("Enter student's name that you want to delete: ");
		name = input.next();
		for(int i=0; i<list.size(); i++) {
			StudentInfo stuInfo = list.get(i);
			if(stuInfo.getName().equals(name)) {
				list.remove(i);
				System.out.println(name + "'s information is deleted successfully.");
				flag = true;
			} //info
		} //for
		if(flag == false) {
			System.out.println("Incorrect name entered.");
		}
	} //deleteInfo()
	
	static void updateInfo() {
		String name, major;
		int stuNumber;
		boolean flag = false;
		
		System.out.print("Enter student's name that you want to update: ");
		name = input.next();
		for(int i=0; i<list.size(); i++) {
			StudentInfo update = list.get(i);
			if(update.getName().equals(name)) {
				System.out.print(name + "'s changed major is: ");
				major = input.next();
				update.setMajor(major);
				//StudentInfo newInfo = new StudentInfo(name,stuNumber, major);
				//list.set(i, newInfo);
				System.out.println("Information is updated successfully.");
				flag = true;
			}
		}//for
		if(flag == false) {
			System.out.println("Incorrect name entered.");
		}
	} //updateInfo()
	
	static void displayInfo() {
		System.out.println("Name\tStudent number\tMajor");
		System.out.println("-------------------------------");
		for(int i=0; i<list.size(); i++) {
			StudentInfo student = list.get(i);
			System.out.println(student.getName() + "\t" + student.getStuNumber() + "\t\t" + student.getMajor());
		}
	} //displayInfo()

}
