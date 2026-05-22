package game;

public class Gameplay {
    public static void main(String[] args) {
    	
    	//캐릭터 Generation
        Generation player = new Generation("주인공", 24, "남",5,100);
        
        //머리 스타일 지정 가져오기
        player.Customizing(2);     
        // 3. 결과 출력
        player.gameplay();        
        player.showInfomation();   
    }
}