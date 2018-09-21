package domain.frame;

import domain.BowlPin;
import domain.state.NoneState;
import domain.state.State;

public class LinkedFrame implements Frame {

    private static final int FINAL_FRAME_NO = 10;

    private int no;
    private State state;
    private LinkedFrame next;

    public LinkedFrame(int no, LinkedFrame next) {
        this.no = no;
        this.next = next;
        state = new NoneState();
    }

    public boolean isExistNextFrame() {
        return next != null;
    }

    public LinkedFrame next() {
        return next;
    }

    public int nextFrameNo() {
        return no + 1;
    }

    public void addNext(LinkedFrame next) {
        this.next = next;
    }

    public boolean isMatchFrame(int no) {
        return this.no == no;
    }

    @Override
    public void changeState(State state) {
        this.state = state;
    }

    @Override
    public void roll(BowlPin bowlPin) {
        state.roll(this, bowlPin);
    }

    @Override
    public int getScore() {
        return state.getScore();
    }

    @Override
    public boolean isFrameEnd() {
        return state.isEnd(this);
    }

    @Override
    public String getResult() {
        return state.toString();
    }

    @Override
    public boolean isFinalFrame() {
        return no == FINAL_FRAME_NO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LinkedFrame that = (LinkedFrame) o;

        return no == that.no;

    }

    @Override
    public int hashCode() {
        return no;
    }
}
