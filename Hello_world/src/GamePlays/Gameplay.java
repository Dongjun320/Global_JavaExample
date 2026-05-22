package GamePlays;

public class Gameplay {
    public static void main(String[] args) {
        GameManager gm = GameManager.getInstance();

        // Factory로 기본 직업 캐릭터 추가 하나만 
        String[] types = {"warrior", "wizard", "archer"};
        for (String type : types) {
            gm.addCharacter(CharacterFectory.create(type));
        }

        // Builder로 커스텀 캐릭터 추가
        Character custom = new CustomCharacter.Builder("아서 팬드레곤")
            .hp(180)
            .attack(9999)
            .skill("엑스칼리버")
            .build();
        gm.addCharacter(custom);

        // Singleton GameManager로 전체 출력
        gm.printAll();
    }
}
