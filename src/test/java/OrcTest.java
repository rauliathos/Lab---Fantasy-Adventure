import Enemy.Orc;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class OrcTest {

    Orc orc;

    @Before
    public void before(){
        orc = new Orc(100, 5);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, orc.getHealthPoints());

    }

    @Test
    public void hasDamegeValue(){
        assertEquals(5, orc.getDamageValue());
    }

    @Test
    public void canSetDamageValue(){
        orc.setDamageValue(10);
        assertEquals(10, orc.getDamageValue());

    }
}
