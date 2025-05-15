public class BinaryTree {

    private Node mainNode;

    public BinaryTree(String content){
        this.mainNode = new Node(content);
    }

    public void addRightNode(String content){
        this.mainNode.setRightNode(new Node(content));
    }

    public void addLeftNode(String content){
        this.mainNode.setLeftNode(new Node(content));
    }

    public Node getMainNode() {
        return mainNode;
    }

    public void setMainNode(Node mainNode) {
        this.mainNode = mainNode;
    }
}
