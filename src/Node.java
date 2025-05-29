public class Node {
    private String content;
    private Node rightNode;
    private Node leftNode;
    private Integer fator;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(String content) {
        this.rightNode = new Node(content);
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(String content) {
        this.leftNode = new Node(content);
    }

    public Node (String content){
        this.content = content;
    }
}
