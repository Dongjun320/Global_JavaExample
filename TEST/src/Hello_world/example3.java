package Hello_world;

public class example3 {
	
	/* 다이아몬드 */
	public static void main(String[] args) {
		for(int i=1; i<=5; i++){
			for(int k=0; k<=5-i; k++){
				System.out.printf(" ");
			}
			for(int j=0; j< i*2-1; j++){
				System.out.printf("*");
			}
			System.out.println();
		}
		for(int i=5; i>=1; i--){
			for(int k=0; k<=5-i; k++){
				System.out.printf(" ");
			}
			for(int j=0; j < i*2-1; j++){
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
