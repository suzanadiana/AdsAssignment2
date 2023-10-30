public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        // Test adding elements
        bst.add(5);
        bst.add(3);
        bst.add(7);
        bst.add(2);
        bst.add(4);

        // Test in-order traversal
        System.out.println("In-order traversal: " + bst.inOrderTraversal());

        // Test removing elements
        bst.remove(3);
        System.out.println("After removing 3: " + bst.inOrderTraversal());

        // Test rebalancing
        bst.rebalance();
        System.out.println("After removing, rebalanced the tree: " + bst.inOrderTraversal());
    }
}
