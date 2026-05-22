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
            GamePanel       singlePanel = new GamePanel();
            TwoPlayerPanel  twoPanel    = new TwoPlayerPanel();
            LobbyPanel      lobbyPanel  = new LobbyPanel();
            NetworkPanel    netPanel    = new NetworkPanel();

            // HomePanel 생성 (1P / 2P / ONLINE 버튼)
            HomePanel homePanel = new HomePanel(
                // 1 PLAYER
                () -> switchPanel(frame, container, cards, singlePanel, "single",
                                  singlePanel::startGame),
                // 2 PLAYER
                () -> switchPanel(frame, container, cards, twoPanel, "two",
                                  twoPanel::startGame),
                // ONLINE
                () -> {
                    lobbyPanel.resetState();
                    switchPanel(frame, container, cards, lobbyPanel, "lobby", null);
                }
            );

            // ── 게임 → 홈 콜백 ──
            singlePanel.setBackCallback(
                () -> switchPanel(frame, container, cards, homePanel, "home", null)
            );
            twoPanel.setBackCallback(
                () -> switchPanel(frame, container, cards, homePanel, "home", null)
            );
            netPanel.setBackCallback(
                () -> switchPanel(frame, container, cards, homePanel, "home", null)
            );

            // ── 로비 콜백 ──
            lobbyPanel.setOnBack(
                () -> switchPanel(frame, container, cards, homePanel, "home", null)
            );
            lobbyPanel.setOnConnected((network, isHost) -> {
                netPanel.setupConnection(network, isHost);
                switchPanel(frame, container, cards, netPanel, "online",
                            netPanel::startGame);
            });

            // 컨테이너에 패널 등록
            container.add(homePanel,   "home");
            container.add(singlePanel, "single");
            container.add(twoPanel,    "two");
            container.add(lobbyPanel,  "lobby");
            container.add(netPanel,    "online");

            frame.setContentPane(container);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);

            // 초기: 홈 화면
            switchPanel(frame, container, cards, homePanel, "home", null);
            frame.setVisible(true);
        });
    }

    /**
     * 패널 전환 헬퍼.
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
