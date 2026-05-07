package Hello_world;

public class TEST {
	
	public static void main(String[] args) {

        shop appleStore = new shop();
        person dongjun = new person("김동준");
        TESTAPPLE redApple = new TESTAPPLE("사과");

        appleStore.sell(dongjun, redApple);

        dongjun.taste();
	}
}
