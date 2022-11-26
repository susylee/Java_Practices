
public class DeluxeBurger extends Hamburger{

	DeluxeBurger() {
		super();
		breadRollType = "White roll";
		//price = 14.54;
		meat = "Sausage & Bacon";
		System.out.println("Deluxe hamburger on a " + breadRollType + " with " + meat + ", price is " + this.price);
		super.addHamburgerAddition1("Chips", 2.75);
		//System.out.println("Added Chips for an extra 2.75");
		System.out.println("Added Drink for an extra 1.81");
	}

	@Override
	public void addHamburgerAddition1(String addition1Name, double addition1Price) {
		System.out.println("Cannot not add additional items to a deluxe burger");
	}

	@Override
	public void addHamburgerAddition2(String addition2Name, double addition2Price) {
		System.out.println("Cannot not add additional items to a deluxe burger");
	}

	@Override
	public void addHamburgerAddition3(String addition3Name, double addition3Price) {
		System.out.println("Cannot not add additional items to a deluxe burger");
	}

	@Override
	public void addHamburgerAddition4(String addition4Name, double addition4Price) {
		System.out.println("Cannot not add additional items to a deluxe burger");
	}
	
	@Override
	public double itemizehamburger() {
		//double total =((super.price+2.75 + 1.81)*100)/100;
		System.out.println("Price "+super.price);
		double total = (Math.round((super.price+2.75 + 1.81)*100)/100.0);
		return total;
	}

	
	

	
}
