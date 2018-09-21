import domain.player.Player;

import java.util.ArrayList;
import java.util.List;

public class BowlingGameWorker {

    private List<Player> players;

    public BowlingGameWorker() {
        this.players = new ArrayList<>();
    }

    public Player createBowlGame(String name) {
        Player player = new Player(name);
        players.add(player);
        return player;
    }

    public void gameStart(Player player) {
        player.game();
    }
}
