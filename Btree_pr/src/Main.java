import java.util.List;

public class Main {
    private static int t = 2;

    // B-tree visualization
//    public static void main(String[] args) {
//        BTree system = new BTree();
//        Pair val = system.search(2);
//        if (val == null) {
//            System.out.println("There is no value");
//        }
//        for (int i = 1; i <= 10; ++i) {
//            system.insert(new Pair(i, "data" + i));
//        }
//
//        system.printBTree();
//
//        system.remove(7);
//
//        system.printBTree();
//
//        if (system.search(10) != null) {
//            System.out.println("Yeap, we found it");
//        } else System.out.println("There is a bug");
//    }

    public int getT() {
        return this.t;
    }
//    public static void main(String[] args) {
//        BTree bTree = new BTree();
//
//        // insert some key-value pairs
//        bTree.insert(new Pair(5, "Five"));
//        bTree.insert(new Pair(3, "Three"));
//        bTree.insert(new Pair(7, "Seven"));
//        bTree.insert(new Pair(1, "One"));
//        bTree.insert(new Pair(9, "Nine"));
//        bTree.insert(new Pair(4, "Four"));
//        bTree.insert(new Pair(6, "Six"));
//        bTree.insert(new Pair(8, "Eight"));
//        bTree.insert(new Pair(2, "Two"));
//
//        // perform range query
//        List<Pair> result = bTree.rangeQuery(4, 8);
//
//        // print results
//        for (Pair pair : result) {
//            System.out.println("Key: " + pair.getKey() + ", Data: " + pair.getData());
//        }
//    }

    public static void main(String[] args) {

        BTree tree = new BTree();

        tree.insert(new Pair(10));
        tree.insert(new Pair(20));
        tree.insert(new Pair(30));
        tree.insert(new Pair(40));
        tree.insert(new Pair(50));
        tree.insert(new Pair(60));

        Pair result = tree.findKey(40);
        if (result != null) {
            System.out.println("Key found: " + result.getKey());
        } else {
            System.out.println("Key not found");
        }

    }

}