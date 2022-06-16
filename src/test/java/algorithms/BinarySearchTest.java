package algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

    private int[] list = {1, 3, 5, 7, 9, 11, 13, 15};

    @Test
    public void shouldFindFirstElement() {
        var index = BinarySearch.findIndex(list, 1);
        assertNotNull(index);
        assertEquals(0, index);
        assertEquals(1, list[index]);
    }

    @Test
    public void shouldFindLastElement() {
        var index = BinarySearch.findIndex(list, 15);
        assertNotNull(index);
        assertEquals(7, index);
        assertEquals(15, list[index]);
    }

    @Test
    public void shouldFindElement() {
        var index = BinarySearch.findIndex(list, 9);
        assertNotNull(index);
        assertEquals(4, index);
        assertEquals(9, list[index]);
    }

    @Test
    public void shouldnotFindElement() {
        assertNull(BinarySearch.findIndex(list, 10));
    }
}