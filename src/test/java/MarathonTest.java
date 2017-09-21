import com.mvelyka.marathon.Marathon;
import com.mvelyka.marathon.Performer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarathonTest {
    Performer[] performers;
    private Marathon marathon = new Marathon(performers);

    @Test
    public void bestPerformerTest() {
        performers = new Performer[3];
        performers[0] = new Performer("name1", 5);
        performers[1] = new Performer("name2", 4);
        performers[2] = new Performer("name3", 6);
        Performer actual = marathon.bestPerformer();
        assertEquals(performers[2], actual);
    }

    @Test
    public void secondBestPerformerTest() {
        performers = new Performer[3];
        performers[0] = new Performer("name1", 5);
        performers[1] = new Performer("name2", 4);
        performers[2] = new Performer("name3", 6);
        Performer actual = marathon.secondBestPerformer();
        assertEquals(performers[0], actual);
    }
}
