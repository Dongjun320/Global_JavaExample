package Example2;

public class TEST {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        
        cal.sum(1, 2);
        cal.mul(6, 3);
        cal.mulb(2);
        
        int sum2 = cal.sum;
        int mul2 = cal.mul;
        int mulb2 = cal.mulb1;
        
        System.out.println(sum2); 
        System.out.println(mul2); 
    }
}
