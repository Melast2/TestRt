import java.util.Map;

import org.testng.annotations.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElementCounterTest {
    @Test
    public void testCountElements_withUniqueElements() {
        int[] input = {1, 2, 3, 4, 5};
        Map<Integer, Integer> result = ElementCounter.countElements(input);

        assertEquals(1, (int) result.get(1));
        assertEquals(1, (int) result.get(2));
        assertEquals(1, (int) result.get(3));
        assertEquals(1, (int) result.get(4));
        assertEquals(1, (int) result.get(5));
    }

    @Test
    public void testCountElements_withDuplicateElements() {
        int[] input = {1, 3, 4, 5, 1, 5, 4};
        Map<Integer, Integer> result = ElementCounter.countElements(input);

        assertEquals(2, (int) result.get(1));
        assertEquals(1, (int) result.get(3));
        assertEquals(2, (int) result.get(4));
        assertEquals(2, (int) result.get(5));
    }

    @Test
    public void testCountElements_withEmptyArray() {
        int[] input = {};
        Map<Integer, Integer> result = ElementCounter.countElements(input);

        assertEquals(0, result.size());
    }

    @Test
    public void testCountElements_withSingleElementArray() {
        int[] input = {42};
        Map<Integer, Integer> result = ElementCounter.countElements(input);

        assertEquals(1, (int) result.get(42));
        assertEquals(1, result.size());
    }

    @Test
    public void testCountElements_withNegativeNumbers() {
        int[] input = {-1, -2, -3, -1, -2};
        Map<Integer, Integer> result = ElementCounter.countElements(input);

        assertEquals(2, (int) result.get(-1));
        assertEquals(2, (int) result.get(-2));
        assertEquals(1, (int) result.get(-3));
    }
}
