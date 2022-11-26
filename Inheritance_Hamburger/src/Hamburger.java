// August 25th, 2022
public class Hamburger {
	 String name;
	 String meat;
	 String breadRollType;
	 double price;
	
	 String addition1Name,addition2Name,addition3Name,addition4Name;
	 double addition1Price,addition2Price,addition3Price,addition4Price;
	 
	 public Hamburger() {
	 }
	 
	
	public Hamburger(String meat, double price) {
		super();
		this.meat = meat;
		this.price = price;
	}


	public Hamburger(String name, String meat,  double price, String breadRollType) {
		this.name = name;
		this.meat = meat;
		this.breadRollType = breadRollType;
		this.price = price;
		//Basic hamburger on a White roll with Sausage, price is 3.56
		System.out.println("Basic hamburger on a " + breadRollType + " with " + meat + ", price is " + price);
	}
	
	public void addHamburgerAddition1(String addition1Name, double addition1Price) {
		System.out.println("Added " + addition1Name + "for an extra " + addition1Price);
		this.addition1Price = addition1Price;
	}
	
	public void addHamburgerAddition2(String addition2Name, double addition2Price) {
		this.addition2Price  = addition2Price;
		System.out.println("Added " + addition2Name + "for an extra " + addition2Price);
	}
	public void addHamburgerAddition3(String addition3Name, double addition3Price) {
		this.addition3Price  = addition3Price;
		System.out.println("Added " + addition3Name + "for an extra " + addition3Price);
	}
	public void addHamburgerAddition4(String addition4Name, double addition4Price) {
		this.addition4Price  = addition4Price;
		System.out.println("Added " + addition4Name + "for an extra " + addition4Price);
	}
	
	// method for printing out an itemized listing of the final hamburger with addons, and total price
	//Remember that a name and price must be accepted as parameters in the first four methods 
	// so that the price of the hamburger is adjusted accordingly. 
	
	public double itemizehamburger() {
		double total = this.price + addition1Price +  addition2Price +  addition3Price + addition4Price;
		return total;
	}
	
}
