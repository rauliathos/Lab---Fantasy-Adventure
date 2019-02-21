import Player.Knight;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static weapons.Attack.*;

public class KnightTest {
     Knight knight;

     @Before
    public void before(){
         knight = new Knight("Knight", 100, CLUB);
     }

    @Test
    public void canGetName(){
        assertEquals("Knight", knight.getName());
    }

    @Test
    public void canGetHealthPoint(){
        assertEquals(100, knight.getHelthPoints());
    }

    @Test
    public void canGetWeapon(){
         assertEquals( CLUB , knight.getWeapon());
    }

    @Test
    public void canMakeAttack(){
         assertEquals(10, knight.makeAttack());
    }
}
