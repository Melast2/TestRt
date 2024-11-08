import org.junit.Test


class ElementCounterGroovyTest {

    @Test
    void testCountElements_withUniqueElements() {
        int[] input = [1, 2, 3, 4, 5]
        Map<Integer, Integer> result = ElementCounterGroovy.countElements(input)

        assertEquals(1, result[1])
        assertEquals(1, result[2])
        assertEquals(1, result[3])
        assertEquals(1, result[4])
        assertEquals(1, result[5])
    }

    @Test
    void testCountElements_withDuplicateElements() {
        int[] input = [1, 3, 4, 5, 1, 5, 4]
        Map<Integer, Integer> result = ElementCounterGroovy.countElements(input)

        assertEquals(2, result[1])
        assertEquals(1, result[3])
        assertEquals(2, result[4])
        assertEquals(2, result[5])
    }

    @Test
    void testCountElements_withEmptyArray() {
        int[] input = []
        Map<Integer, Integer> result = ElementCounterGroovy.countElements(input)

        assertTrue(result.isEmpty())
    }

    @Test
    void testCountElements_withSingleElementArray() {
        int[] input = [42]
        Map<Integer, Integer> result = ElementCounterGroovy.countElements(input)

        assertEquals(1, result[42])
        assertEquals(1, result.size())
    }

    @Test
    void testCountElements_withNegativeNumbers() {
        int[] input = [-1, -2, -3, -1, -2]
        Map<Integer, Integer> result = ElementCounterGroovy.countElements(input)

        assertEquals(2, result[-1])
        assertEquals(2, result[-2])
        assertEquals(1, result[-3])
    }
}