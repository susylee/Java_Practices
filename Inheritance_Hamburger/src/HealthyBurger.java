
public class HealthyBurger extends Hamburger{
	 String healthyExtra1Name;
	 double healthyExtra1Price;
	 String healthyExtra2Name;
	 double healthyExtra2Price;
	
	HealthyBurger() {
		
	}
	
	HealthyBurger(String meat, double price) {
		super("Healthy", meat, price,"Brown rye roll");
		System.out.println("Healthy hamburger on a " + breadRollType + " with " + meat + ", price is " + price);
	}
	
	public void addHealthyAddition1 (String healthyExtra1Name, double healthyExtra1Price) {
		this.healthyExtra1Price= healthyExtra1Price;
		System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
	}
	
	public void addHealthyAddition2 (String healthyExtra2Name, double healthyExtra2Price) {
		this.healthyExtra2Price= healthyExtra2Price;
		System.out.println("Added " + healthyExtra2Name + " for an extra " + healthyExtra2Price);
	}

	@Override
	public double itemizehamburger() {
		// TODO Auto-generated method stub
		System.out.println("super:" + super.itemizehamburger());
		System.out.println("healthyextra1: " +  healthyExtra1Price );
		System.out.println(); // Egg price, 5.43 is not adding
		//healthyBurger.addHamburgerAddition1("Egg", 5.43);
		return super.itemizehamburger() + healthyExtra1Price + healthyExtra2Price;
	}

	
}
