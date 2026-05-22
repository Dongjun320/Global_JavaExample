package desing_pattern_p;

public class CharacterFactory {
    public static Character create(String type) {
        switch (type) {
            case "warrior": return new Warrior();
            case "wizard": return new Wizard();
            case "archer": return new Archer();
            default: throw new IllegalArgumentException("존재하지 않는 직업: " + type); //예외처리
        }
    }
}