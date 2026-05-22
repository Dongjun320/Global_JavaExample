package TETRIS;

import javax.swing.*;
import java.awt.*;

public class TetrisMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("TETRIS");
            CardLayout cards = new CardLayout();
            JPanel container = new JPanel(cards);

            // 각 패널 생성
            GamePanel singlePanel = new GamePanel();
            TwoPlayerPanel twoPanel = new TwoPlayerPanel();

            // HomePanel 생성 (버튼 클릭 시 화면 전환)
            HomePanel homePanel = new HomePanel(
                // 1 PLAYER 버튼
                () -> switchPanel(frame, container, cards, singlePanel, "single",
                                  singlePanel::startGame),
                // 2 PLAYER 버튼
                () -> switchPanel(frame, container, cards, twoPanel, "two",
                                  twoPanel::startGame)
            );

            // 게임에서 홈으로 돌아가는 콜백 설정
            singlePanel.setBackCallback(
                () -> switchPanel(frame, container, cards, homePanel, "home", null)
            );
            twoPanel.setBackCallback(
                () -> switchPanel(frame, container, cards, homePanel, "home", null)
            );

            // 컨테이너에 패널 등록
            container.add(homePanel, "home");
            container.add(singlePanel, "single");
            container.add(twoPanel, "two");

            frame.setContentPane(container);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);

            // 초기: 홈 화면 표시
            switchPanel(frame, container, cards, homePanel, "home", null);
            frame.setVisible(true);
        });
    }

    /**
     * 패널 전환 헬퍼 함수
     * @param frame JFrame
     * @param container CardLayout이 적용된 JPanel
     * @param cards CardLayout
     * @param targetPanel 전환할 패널
     * @param cardName 카드 이름
     * @param onSwitch 전환 후 실행할 동작 (null 가능)
     */
    private static void switchPanel(JFrame frame, JPanel container, CardLayout cards,
                                     JPanel targetPanel, String cardName, Runnable onSwitch) {
        cards.show(container, cardName);
        container.setPreferredSize(targetPanel.getPreferredSize());
        frame.pack();
        frame.setLocationRelativeTo(null);
        if (onSwitch != null) {
            onSwitch.run();
        }
    }
}
