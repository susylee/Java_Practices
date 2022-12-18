import java.util.HashMap;
import java.util.Scanner;

class Sandwich {
	String name;
	int price;
	
	public Sandwich(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return name + "/ " + "$" + price;
	}
}

public class Chicken_Price {

	public static void main(String[] args) {
	
		HashMap<String, Sandwich> sMap = new HashMap<String, Sandwich>();
		
		Sandwich s1 = new Sandwich("Spicy burger", 8);
		Sandwich s2 = new Sandwich ("Mexican burger", 9);
		
		sMap.put("Windys", s1);
		sMap.put("Lotteria", s2);
		sMap.put("KCF", new Sandwich("Habanero burger", 10));
		
		//System.out.println(sMap.size());
		//System.out.println(sMap);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the franchise name for your chicken sandwich: ");
		String name = sc.next();
		
		if(sMap.get(name)==null) {
			System.out.println("Wrong input");
		}
		else {
			System.out.println(name+ " has " + sMap.get(name));
		}
	}

}
