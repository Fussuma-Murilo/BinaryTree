public class Main {
    public static void main(String[] args) {

        AVLTree tree = new AVLTree();

        tree.Insert(5, null);
        tree.Insert(6, null);
        tree.Insert(4, null);
        tree.Insert(7, null);

        tree.runPreOrderR(tree.mainNode);


    }
}