package Hello_world;

public class STAR2 {


    public static void main(String[] args) {
        
        System.out.println("====== 꽉 찬 리버스 별 ======");
        
        // 1. 별의 윗부분 (머리)
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 15 - i; j++) System.out.print(" ");
            for (int j = 1; j <= (i * 2) - 1; j++) System.out.print("*");
            System.out.println();
        }

        // 2. 별의 중간 부분 (어깨와 몸통)
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i - 1; j++) System.out.print(" ");
            for (int j = 1; j <= 31 - (i * 2); j++) System.out.print("*");
            System.out.println();
        }

        // 3. 별의 아랫부분 (다리)
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j <= 3 - i; j++) System.out.print(" ");
            for (int j = 1; j <=(11-i*2); j++) System.out.print("*");
            // [수정] 다리 사이 공백을 별로 변경
            for (int j = 1; j <= (i * 4)+i; j++) System.out.print("*"); 
            for (int j = 1; j <= (11-i)+1; j++) System.out.print("*");
            System.out.println();
        }
/*
        // 4. 리버스 다리
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 4 - i; j++) System.out.print(" ");
            for (int j = 1; j <= 5; j++) System.out.print("*");
            // [수정] 리버스 다리 사이 공백을 별로 변경
            for (int j = 1; j <= (i * 2) + 11; j++) System.out.print("*"); 
            for (int j = 1; j <= 5; j++) System.out.print("*");
            System.out.println();
        }*/
/*
        // 5. 리버스 몸통
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i - 1; j++) System.out.print(" ");
            for (int j = 1; j <= 31 - (i * 2); j++) System.out.print("*");
            System.out.println();
        }*/

        // 6. 리버스 머리
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= 15 - i; j++) System.out.print(" ");
            for (int j = 1; j <= (i * 2) - 1; j++) System.out.print("*");
            System.out.println();
        }
    }
}


