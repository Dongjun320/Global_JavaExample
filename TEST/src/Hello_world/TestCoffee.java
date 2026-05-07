package Hello_world;

public class TestCoffee {
	
	public static void main(String[] args) {
		CoffeeShop coffeeshop = new CoffeeShop();
		for (int i = 0; i < 1000; i++) {
			exampleOOP exampleOOP = new exampleOOP();
			coffeeshop.joinMember(exampleOOP);
			System.out.println(exampleOOP.getUserId());
		}
		System.out.println();
	}
}
