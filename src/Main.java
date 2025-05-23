public class Main {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree("A");
        tree.getMainNode().setLeftNode("B");
        tree.getMainNode().setRightNode("C");
        tree.getMainNode().getLeftNode().setLeftNode("D");
        tree.getMainNode().getLeftNode().setRightNode("E");
        tree.getMainNode().getRightNode().setRightNode("F");

        System.out.println(tree.countNodes());
        tree.runList("InOrder", "Non");

    }
}