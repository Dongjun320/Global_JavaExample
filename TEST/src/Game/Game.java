package Game;

public class Game {
	public static void main(String[] args) {
        Player player = new Player(); // 첫번째. 플레이어를 접속시킵니다.
        field f = new field("지구본");
        player.enter(f);// 생성된 필드 입장 필드 클래스 맵 생성문 출력이 먼저 나오고 player syso의 입장 코드 나중에 출력
        
        player .attack(); // 2. if문 걸었던 맨손일때 주먹이 나가게한다. 플레이어의 attack을 먼저 출력시켜서 맨손펀치가 나가는지 확인하는 절차 검증문
        player.attack("エクスかリバー"); //오버로딩 실험
        Weapon sword = new Weapon("엑스칼리버", 1000000); // 3. 웨폰 클래스를 받아와 무기랑 데미지를 넣고 정확히 출력되는지 확인
        
        player .pickUp(sword); // 4. 플레이어가 무기를 줍는다
        player .attack();      // 5. 무기를 줍고 공격 텍스트 해당 데미지도 출력
        player.attack("エクスかリバー"); // 오버로딩 실험
        
    }
}
