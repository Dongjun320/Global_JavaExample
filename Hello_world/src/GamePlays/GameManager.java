package GamePlays;

import java.util.ArrayList;
import java.util.List;

public class GameManager {
    private static GameManager instance;
    private List<Character> party = new ArrayList<>();

    private GameManager() {}

    public static GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }

    public void addCharacter(Character c) {
        party.add(c);
    }

    public void printAll() {
        for (Character c : party) {
            c.printInfo();
            System.out.println();
        }
    }
}
