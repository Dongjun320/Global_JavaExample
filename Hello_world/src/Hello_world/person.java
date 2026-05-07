package Hello_world;

public class person {
	
	String name;
    TESTAPPLE myApple; 

    public person(String name) {
        this.name = name;
    }

    void Buy(TESTAPPLE apple) {
        this.myApple = apple;
        System.out.println(name + " 손님이 " + apple.Apple + "를 구매함");
    }

    void taste() {
        if (myApple != null) {
            System.out.println(myApple.Apple + "가 맛있네용");
            this.myApple = null;
        } else {
            System.out.println("맛없네요");
        }
    }
}
