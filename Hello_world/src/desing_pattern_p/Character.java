package desing_pattern_p;

public abstract class Character {
    private String name;
    private int hp;
    private int attack;
    private Skill skill;

    public Character(String name, int hp, int attack, Skill skill) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.skill = skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public void useSkill() {
        skill.use();
    };

    // 공통 정보 출력 로직
    public void printInfo() {
        System.out.println("{" + name + "} 체력: " + hp + " / 공격력: " + attack);
        useSkill(); // 자신의 스킬 사용 호출
    }
}