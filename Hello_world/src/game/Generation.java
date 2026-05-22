package game;

public class Generation {
	
	// 캐릭터 스테이터스 및 정보값
    String name;
    int age;
    String gender; // 남 또는 여로 입력
    int level = 1;
    int hp = 100;
    
    //여자 남자 헤어 스타일 저장
    String selectedHair = "기본머리";
    String[] Mhair = {"장발","포마드","크롭컷"};
    String[] Fhair = {"포니테일","단발","히피펌"};
    
    //스테이터스
    public Generation(String name, int age, String gender, int level, int hp) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.level = level;
        this.hp = 100;
    }
    
    //캐릭터 생성정보
    void showInfomation() {
        System.out.println("=== 생성정보 ===");
        System.out.println("이름: " + name + " | (Lv." + level + ")");
        System.out.println("나이: " + age + " | 성별: " + gender);
        System.out.println("체력: " + hp);
        System.out.println("선택된 머리 스타일: " + selectedHair);
    }
    //생성됨
    void gameplay() {
        System.out.println(name + "이(가) 생성됨");
    }
    // 헤어 커스터마이징
    void Customizing(int choice) {
        if (gender.equals("남")) {
            // 남자일 때 Mhair 배열 사용
            if (choice >= 1 && choice <= Mhair.length) {
                this.selectedHair = Mhair[choice - 1];
            }
        } else if (gender.equals("여")) {
            // 여자일 때 Fhair 배열 사용
            if (choice >= 1 && choice <= Fhair.length) {
                this.selectedHair = Fhair[choice - 1];
            }
        }
    }
}