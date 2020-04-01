import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void setUp(){
        engine = new Engine(2.0, 0.95, 80.00);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(2.0, engine.getCapacity(), 0.01);
    }
    @Test
    public void canGetEmissions(){
        assertEquals(0.95, engine.getEmissions(), 0.01);
    }
    @Test
    public void canGetVolume(){
        assertEquals(80.00, engine.getVolume(), 0.01);
    }
}
