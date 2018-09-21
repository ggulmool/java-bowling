import domain.player.Player;
import view.BowlingCLI;
import view.BowlingUI;

public class BowlingGameMain {

    public static void main(String[] args) {
        String name = BowlingCLI.inputPlayerName();

        BowlingGameWorker gameWorker = new BowlingGameWorker();
        Player player = gameWorker.createBowlGame(name);
        BowlingUI.printResult(player);
        gameWorker.gameStart(player);

        /*BowlingWorker worker = new BowlingWorker();
        Player player = worker.createBowlGame(name);
        BowlingUI.printResult(player);
        int round = 1;
        while (round <= 10) {
            int pins = BowlingCLI.inputFrameRoll(round);
            FrameResult result = worker.roll(round, pins);
            player.setResult(round, result);
            BowlingUI.printResult(player);
            if (!worker.isFrameEnd(round)) {
                continue;
            }
            round++;
        }*/
    }
}
