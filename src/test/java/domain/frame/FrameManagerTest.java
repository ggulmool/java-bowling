package domain.frame;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FrameManagerTest {

    private FrameManager fm;

    @Before
    public void setUp() throws Exception {
        fm = new FrameManager();
    }

    @Test
    public void 프레임_추가() {
        fm.addFirst();
        assertThat(fm.getCurrent()).isEqualTo(fm.findByFrameNo(1));
        fm.addLast();
        assertThat(fm.getCurrent()).isEqualTo(fm.findByFrameNo(2));
    }
}
