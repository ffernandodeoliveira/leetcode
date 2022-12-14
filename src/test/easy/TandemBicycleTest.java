package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TandemBicycleTest {

    @Test
    public void TestCase1() {
        int[] redShirtSpeeds = new int[] {5, 5, 3, 9, 2};
        int[] blueShirtSpeeds = new int[] {3, 6, 7, 2, 1};
        boolean fastest = true;
        int expected = 32;
        var actual = TandemBicycle.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest);
        assertTrue(expected == actual);
    }

}