package jpop;

public class Song {
    String title;
    int likes = 0;
    
    public Song(String title) {
        this.title = title;
    }

    // 좋아요 증가
    void like() {
        this.likes++;
    }

    //곡의 현재 상태 출력
    void printStatus() {
        System.out.println("노래 : " + title + " | 좋아요: " + likes);
    }
}