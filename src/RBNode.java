public class RBNode {
    private Integer content;
    private RBNode leftNode;
    private RBNode rightNode;
    private RBNode parent;
    private Color color;

    public RBNode(Integer content) {
        this.content = content;
        this.color = Color.RED;
        this.leftNode = null;
        this.rightNode = null;
        this.parent = null;
    }

    public Integer getContent() {
        return content;
    }

    public void setContent(Integer content) {
        this.content = content;
    }

    public RBNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(RBNode leftNode) {
        this.leftNode = leftNode;
    }

    public RBNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(RBNode rightNode) {
        this.rightNode = rightNode;
    }

    public RBNode getParent() {
        return parent;
    }

    public void setParent(RBNode parent) {
        this.parent = parent;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
