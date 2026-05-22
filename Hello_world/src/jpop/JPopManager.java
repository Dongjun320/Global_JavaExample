package jpop;

public class JPopManager {
    
    // 통계 브리핑
    public static void printLabelReport(Artist artist) {
        int totalLikes = 0;
        for (Song s : artist.album) {
            totalLikes += s.likes;
        }
        System.out.println("[정산 보고서]");
        System.out.println("아티스트: " + artist.name);
        System.out.println("총 누적 좋아요 수: " + totalLikes);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        String[] mrsSongs = {"ケセラセラ", "ア・プリオリ", "コロンブス"};
        Artist mrs = new Artist("Mrs. GREEN APPLE", mrsSongs);

        System.out.println("--- J-POP 레이블 ---");
        
        // 초기 앨범 상태 확인
        mrs.showAlbum();

        // 활동 시작 (메서드 호출)
        System.out.println("\n--- 활동 개시 ---");
        //공연 배열에서 가져와서 하기
        mrs.perform(1); 
        mrs.perform(1); 
        mrs.perform(3); 
        // 활동 후 상태와 리포트 확인
        mrs.showAlbum();
        printLabelReport(mrs);
    }
}