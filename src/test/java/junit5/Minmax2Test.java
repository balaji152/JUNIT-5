package junit5;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Minmax2Test {
    @Test
    void findMinMax2() {
        Minmax2 minMax2 = new Minmax2();
        assertAll(
                () -> assertEquals("Min = 1, Max = 4", minMax2.findMinmax2(new int[]{1, 2, 3, 4})),
                () -> assertEquals("Min = -5, Max = 20", minMax2.findMinmax2(new int[]{10,-5,2,20,17,4})),
                () ->assertEquals("Min = 0, Max = 9", minMax2.findMinmax2(new int[]{4,8,0,7,9})),
                () -> assertEquals("Min = -10, Max = 0", minMax2.findMinmax2(new int[]{-1,-10,-4,0}))
        );

    }
}