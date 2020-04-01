import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BatteryTest {

    Battery battery;

    @Before
    public void before(){
        battery = new Battery(540, 300, 60);
    }

    @Test
    public void canGetWeight(){
        assertEquals(540, battery.getWeight(), 0.01);
    }

    @Test
    public void canGetRange(){
        assertEquals(300, battery.getRange(), 0.01);
    }

    @Test
    public void canGetKWh(){
        assertEquals(60, battery.getKWh(), 0.01);
    }


}
