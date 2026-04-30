package Hello_world;

public class example {
	public static void main(String[] args) {
		for(int i=10; i > 1; i--) {
			for(int j=10; j >= i; j--) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
