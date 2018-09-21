package domain.frame;

public class FrameManager {

    private LinkedFrame head;
    private LinkedFrame current;

    public FrameManager() {
        head = current = null;
    }



    public LinkedFrame getCurrent() {
        return current;
    }

    public LinkedFrame findByFrameNo(int no) {
        LinkedFrame temp = head;

        while (temp != null) {
            if (temp.isMatchFrame(no)) {
                return temp;
            }
            temp = temp.next();
        }
        return null;
    }

    public void addLast() {
        if (head == null) {
            addFirst();
        } else {
            LinkedFrame temp = head;
            while (temp.isExistNextFrame()) {
                temp = temp.next();
            }

            LinkedFrame frame = new LinkedFrame(temp.nextFrameNo(), null);
            temp.addNext(frame);
            current = frame;
        }
    }

    public void addFirst() {
        head = current = new LinkedFrame(1, null);
    }
}
