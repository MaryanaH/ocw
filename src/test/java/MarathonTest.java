import com.mvelyka.marathon.Marathon;
import com.mvelyka.marathon.Performer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarathonTest {
    Performer[] performerList = new Performer[3];
    private Marathon marathon = new Marathon(performerList);

    @Test
    public void bestPerformerTest() {
        performerList[0] = new Performer("name1", 5);
        performerList[1] = new Performer("name2", 4);
        performerList[2] = new Performer("name3", 6);
        Performer actual = marathon.bestPerformer();
        assertEquals(performerList[2], actual);
    }

    @Test
    public void secondBestPerformerTest() {
//        performerList[0] = new Performer("name1", 5);
//        performerList[1] = new Performer("name2", 4);
//        performerList[2] = new Performer("name3", 6);
        Performer actual = marathon.secondBestPerformer();
        assertEquals(performerList[0], actual);
    }
}
