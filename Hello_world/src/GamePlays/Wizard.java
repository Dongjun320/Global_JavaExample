package GamePlays;

public class Wizard extends Character{
	public Wizard() {
		super("마법사", 80, 150);
	}
	
	@Override
    public void useSkill() {
        System.out.println("스킬: 익스플로전");
    }
}
