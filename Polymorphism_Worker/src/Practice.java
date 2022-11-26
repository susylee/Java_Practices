class Human {
	private String name;
	private int age;
	
	Human() { 
	}
	
	Human (String name, int age) { 
		this.name = name;  
		this.age = age;
	}
	void display() {
		System.out.println("name:" + name + " ");
		System.out.println("age:" + age + " ");
	}
}
class Worker extends Human {

	private String company;
	private String part;
	Worker (String name, int age, String company, String part){
		super(name,age);
		this.company = company;
		this.part = part;
	}
	void display() {
		super.display();
		System.out.println("company:" + company + " ");
		System.out.println("department:" + part + " ");
	}
}
class Teacher extends Worker { 
	private String subject; 
	Teacher (String name, int age, String company, String part, String subject){
		super(name,age,company,part);
		this.subject = subject;
	}
	void display() {
		super.display();
		System.out.println("subject:" + subject);
	}
}
public class Practice {

	public static void main(String[] args) {

		Human human = new Human("Suyeon", 31);
		human.display();
		
		Human worker = new Worker("YSH", 31, "YG", "Finance");
		worker.display();
		
		Human teacher = new Teacher("IU", 29, "SM", "HR", "English");
		teacher.display();
		
		System.out.println("====== Array =====");
		Human[] hu = {
				new Human("Suyeon", 31),
				new Worker("YSH", 31, "YG", "Finance"),
				new Teacher("IU", 29, "SM", "HR", "English")
		};
		
		for(int i=0; i<hu.length; i++) {
			hu[i].display();
		}
	}

}
