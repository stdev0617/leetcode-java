package javaTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compare {
    public List<Player> comparePlayers() {
        List<Player> players = new ArrayList<>();
        players.add(new Player("Alice", 899));
        players.add(new Player("Bob", 982));
        players.add(new Player("Chloe", 1090));
        players.add(new Player("Dale", 982));
        players.add(new Player("Eric", 1018));

        Comparator<Player> comparator = new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return o1.getScore() - o2.getScore();
            }
        };

        Collections.sort(players, comparator);
        players.stream().forEach(o -> {
            System.out.println(o.getName());
        });
        return players;
    }
}
