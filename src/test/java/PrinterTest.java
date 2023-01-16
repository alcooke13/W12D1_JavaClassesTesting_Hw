import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(50, 50);
    }

    @Test
    public void hasSheets(){
        assertEquals(50, printer.getSheets());
    }
    @Test
    public void hasToner(){
        assertEquals(50, printer.getToner());
    }

    @Test
    public  void enoughSheetsToPrint(){
        printer.print(5, 5);
        assertEquals(25, printer.getSheets());
    }

    @Test
    public void tonerDecreasesWithPrint(){
        printer.print(10, 3);
        assertEquals(20, printer.getToner());
    }
}
