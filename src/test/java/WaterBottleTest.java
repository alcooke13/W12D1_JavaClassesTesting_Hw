import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void volumeStartsAt100() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drinkDecreasesBy10() {
        int result = waterBottle.drink();
        assertEquals(90, result);
    }
    @Test
    public void emptiesDrink() {
        waterBottle.emptyWaterBottle();
        assertEquals(0, waterBottle.getVolume());
    }
    @Test
    public void refillsWaterBottleBackTo100() {
        waterBottle.emptyWaterBottle();
        waterBottle.refillWaterBottle();
        assertEquals(100, waterBottle.getVolume());
    }


}
