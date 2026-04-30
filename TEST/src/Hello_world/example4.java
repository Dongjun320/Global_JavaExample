package Hello_world;

public class example4 {
	/*피보나치 수열 */
	public static void main(String[] args) {
		int i=1; 
		int j =1;
		int ct= 10;
		for(int k=1; k<=ct; k++) {
			int index = i+j;
			System.out.printf(k+"번째 횟수"+"(%d, %d),(%d, %d)\n",i,j,j,index);
			i = j;
			j = index;
		}
	}
}
