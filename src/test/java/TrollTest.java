import Enemy.Orc;
import Enemy.Troll;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TrollTest {

    Troll troll;

    @Before
    public void before(){
        troll = new Troll(100, 5);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, troll.getHealthPoints());

    }

    @Test
    public void hasDamegeValue(){
        assertEquals(5, troll.getDamageValue());
    }
}
