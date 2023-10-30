import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class bstTest {
    private BinarySearchTree<Integer> bst;

    @BeforeEach
    public void setUp() {
        bst = new BinarySearchTree<>();
    }

    @Test
    public void testAdd() {
        bst.add(5);
        bst.add(3);
        bst.add(7);
        bst.add(2);
        bst.add(4);

        List<Integer> expected = Arrays.asList(2, 3, 4, 5, 7);
        List<Integer> actual = bst.inOrderTraversal();

        // Use assertIterableEquals to compare collections
        assertIterableEquals(expected, actual);
    }

    @Test
    public void testRemove() {
        bst.add(5);
        bst.add(3);
        bst.add(7);
        bst.add(2);
        bst.add(4);

        bst.remove(3);

        List<Integer> expected = Arrays.asList(2, 4, 5, 7);
        List<Integer> actual = bst.inOrderTraversal();

        assertIterableEquals(expected, actual);
    }

    @Test
    public void testRebalance() {
        bst.add(5);
        bst.add(3);
        bst.add(7);
        bst.add(2);
        bst.add(4);

        bst.rebalance();

        List<Integer> expected = Arrays.asList(2, 3, 4, 5, 7);
        List<Integer> actual = bst.inOrderTraversal();

        assertIterableEquals(expected, actual);
    }
}