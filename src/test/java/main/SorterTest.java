package main;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SorterTest {

    @Test
    void sortIntegerTest() {
        List<Integer> list = Arrays.asList(10, 3, 1);

        Sorter<Integer> sorter = new Sorter<>();
        List<Integer> sortedList = sorter.sort(list);

        assertEquals(Arrays.asList(10, 3, 1), list); // wasn't modified
        assertEquals(Arrays.asList(1, 3, 10), sortedList); // sorted
    }

    @Test
    void sortDoubleTest() {
        List<Double> list = Arrays.asList(10.5, 3.5, 1.5);

        Sorter<Double> sorter = new Sorter<>();
        List<Double> sortedList = sorter.sort(list);

        assertEquals(Arrays.asList(10.5, 3.5, 1.5), list); // wasn't modified
        assertEquals(Arrays.asList(1.5, 3.5, 10.5), sortedList); // sorted
    }
}
