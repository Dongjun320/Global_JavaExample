package GamePlays;

public class Warrior extends Character{
	public Warrior() {
        super("전사", 250, 100);
    }

    @Override
    public void useSkill() {
        System.out.println("스킬: 횡 배기");
    }
}
