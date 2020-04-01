import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    Tyres tyres;

    @Before
    public void before(){
        tyres = new Tyres(4, 18.5);
    }

    @Test
    public void canGetNumberOfTyres(){
        assertEquals(4, tyres.getNumberOfTyres());
    }

    @Test
    public void canGetDiameter(){
        assertEquals(18.5, tyres.getDiameterOfTyres(), 0.01);
    }
}
