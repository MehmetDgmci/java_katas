package GapInPrimes;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GapInPrimesSolutionTest {
    @Test
    public void test() {
        System.out.println("Fixed Tests");
        assertEquals("[101, 103]", Arrays.toString(GapInPrimesSolution.gap(2,100,110)));
        assertEquals("[103, 107]", Arrays.toString(GapInPrimesSolution.gap(4,100,110)));
        assertEquals(null, GapInPrimesSolution.gap(6,100,110));
        assertEquals("[359, 367]", Arrays.toString(GapInPrimesSolution.gap(8,300,400)));
        assertEquals("[337, 347]", Arrays.toString(GapInPrimesSolution.gap(10,300,400)));
    }

}
