package Game;

public class Player {
	String name = "김동준";
    Weapon myWeapon; //참조변수 선언 (무기를 빈 슬롯, null 초기화) attack의 맨손펀치 출력을 위해
    
    void enter(field f) {
    	System.out.println(name+" 플레이어가 "+f.fieldname + "에 입장하였습니다.");
    }
    // 원하는 무기를 줍기
    void pickUp(Weapon w) {
        myWeapon = w; 
        System.out.println(name + "가 " + myWeapon.name + " 을(를) 주웠다!");
    }
    
    //만약 무기가 없다면?
    void attack() {
        if (myWeapon == null) {
            System.out.println("맨손 펀치!! (데미지 5)");
        } else {
            System.out.println(myWeapon.name + " 휘두르기!! (데미지 " + myWeapon.dmg + ")");
        }
    }
    //오버로딩 실험
    void attack(String skill) {
    	if(myWeapon == null) {
    		System.out.println("무기가 없어서 "+skill+"를 사용할 수 없습니다.");
    	}
    	else {
    		System.out.println("エクスかリバー!!");
    	}
    }
}
