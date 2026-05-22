package GamePlays;

public abstract class Character {
    private String name;
    private int hp;
    private int attack;

    public Character(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public String getName() { return name; }
    public int getHp() { return hp; }
    public int getAttack() { return attack; }

    public abstract void useSkill();

    // 공통 정보 출력 로직
    public void printInfo() {
        System.out.println("{" + name + "} 체력: " + hp + " / 공격력: " + attack);
        useSkill(); // 자신의 스킬 사용 호출
    }
}
