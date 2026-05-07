package Example2;

public class Calculator {
    int sum;
    int mul;
    int mulb1;
    void sum(int a, int b) {
        sum = a + b;
    }
    void mul(int c, int d) {
    	mul = c * d;
    }
    void mulb(int g) {
    	for(int i = 1; i < 10; i ++) {
    		mulb1 = g * i ;
    		System.out.println(g+"단 :"+g+"X"+i+"="+mulb1);
    	}
    }
}
