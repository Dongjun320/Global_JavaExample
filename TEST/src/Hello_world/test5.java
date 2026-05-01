package Hello_world;

public class test5 {
	public static void main(String[] args) {

		// {{국,영,수}}
		int[][] 철수 = {{70,89,100},{54,38,80}};
		int sum = 0;
		for(int 학기 = 0; 학기 < 철수.length; 학기++) {
			for(int 과목 = 0; 과목 < 철수[0].length; 과목++) {
				if(과목 == 1) {
					continue;
				}
				sum = sum + 철수[학기][과목];
			}
		}
		System.out.println(sum);
	}
}
