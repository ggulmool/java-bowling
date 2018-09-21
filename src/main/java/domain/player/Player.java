package domain.player;

import domain.FrameResult;
import domain.FrameResults;
import domain.frame.FrameManager;

public class Player {

    private String name;
    private FrameResults results;
    private FrameManager frameManager;

    public Player(String name) {
        this.name = name;
        this.frameManager = new FrameManager();
    }

    public Player(String name, FrameResults results) {
        this.name = name;
        this.results = results;
    }

    public String getName() {
        return name;
    }

    public FrameResults getFrameResults() {
        return results;
    }

    public void setResult(int round, FrameResult result) {
        results.add(round, result);
    }

    public FrameManager getFrameManager() {
        return frameManager;
    }

    public void game() {

    }
}
