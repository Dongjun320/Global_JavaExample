package jpop;

public class Artist {
    String name;
    Song[] album;

    public Artist(String name, String[] songTitles) {
        this.name = name;
        this.album = new Song[songTitles.length];
        for (int i = 0; i < songTitles.length; i++) {
            this.album[i] = new Song(songTitles[i]);
        }
    }

    // 라이브 공연
    void perform(int trackNum) {
        if (trackNum > 0 && trackNum <= album.length) {
            Song targetSong = album[trackNum - 1];
            System.out.println(name + "가 라이브로 '" + targetSong.title + "'를 부르겠습니다.");
            targetSong.like(); // 공연을 하게되면 좋아요 증가하기
        } else {
            System.out.println("존재하지 않는 노래입니다.");
        }
    }
    // 플레이 리스트 상태
    void showAlbum() {
        System.out.println("\n[" + name + "]의 플레이리스트 상태");
        for (Song s : album) {
            s.printStatus(); 
        }
    }
}