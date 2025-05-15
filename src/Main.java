public class Main {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree("First Content");

        tree.addLeftNode("Left node");
        tree.addRightNode("Right node");

        System.out.println(
            tree.getMainNode().getContent() + "\n" +
            tree.getMainNode().getLeftNode().getContent() + "\n" +
            tree.getMainNode().getRightNode().getContent()
            );

    }
}