import java.util.Scanner;

public class Person {
	private String name;
	private String id;
	private String pw;

	String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	String getId() {
		return id;
	}

	String getPw() {
		return pw;
	}

	public Person(String name, String id, String pw) {
		this.name = name;
		this.id = id;
		this.pw= pw;
	}

	public Person(String name2, String id2, int i) {
		// TODO Auto-generated constructor stub
	}

	void show() {
		System.out.println(name + "," + id + "," + pw);
	}

	public static void main(String[] args) {

		Person p[] = {
				new Person("Imaan","imaandeep", "1234"),
				new Person ("Naman", "gandha", "5678"),
				new Person("Fer", "zuniga", "9999")
		};

		//		for(int i=0; i<p.length; i++) {
		//			p[i].show();
		//		}

		Scanner sc = new Scanner(System.in);

		String id, pw, retry;
		boolean flag; // if ID/PW are valid
		boolean pwMatch = false;

		do {
			flag = false;
			System.out.print("Input ID: ");
			id = sc.next();
			if(id.length() < 3 || id.length() > 8) {
				System.out.println("ID should be 3~8 letters.");
				continue;
			}

			do {
				pwMatch = false;
				System.out.print("Input PW: ");
				pw = sc.next();
				
				for(int i=0; i<p.length; i++) {
					if(p[i].getId().equals(id)) {
						if(p[i].getPw().equals(pw)) {
							System.out.println("Hello " + p[i].getName());
							flag = true;
						} 
						else { 
							System.out.println("Invalid PW");
							flag = true;
							pwMatch = true;
						} 
	
				} 

				//				else {
				//					System.out.println("Invalid ID");
				//				}

			} // for
				
				if(pwMatch == false) {
					break;
				}
			} while(true);
			
			if(flag == false) {
				System.out.println("Invalid ID");
			}

			System.out.print("Do you want to continue?(Y/N)");
			retry = sc.next();
			if(retry.equalsIgnoreCase("n")) {
				break;
			}

		}while(true);
		System.out.println("Program ends.");

	}


}
