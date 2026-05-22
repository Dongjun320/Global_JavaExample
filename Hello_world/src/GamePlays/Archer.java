package GamePlays;

public class Archer extends Character{
	public Archer() {
		super("궁수", 100, 100);
	}
	
	@Override
	public void useSkill() {
		System.out.println("스킬: 정밀 사격");
	}
}
