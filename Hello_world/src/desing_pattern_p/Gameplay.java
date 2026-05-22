package desing_pattern_p;

public class Gameplay {
    public static void main(String[] args) {
        //캐릭터 배열 묶기
        String[] types = {"warrior","wizard","archer"};

        for (String type : types) {
            Character c = CharacterFactory.create(type);
            c.printInfo();
            System.out.println();
        }

        System.out.println("==스킬 교체==");
        Character warrior = CharacterFactory.create("warrior");
        warrior.setSkill(new Explosion());
        warrior.printInfo();


        System.out.println("==스킬 조합==");
        Character wizard = CharacterFactory.create("wizard");
        wizard.setSkill(new MultiSkill(new BombShot(), new IceWall()));
        wizard.printInfo();

    }
}