public class NodeAVL {
    private Integer content;
    private NodeAVL rightNode;
    private NodeAVL leftNode;
    private Integer height;

    public Integer getContent() {
        return content;
    }

    public void setContent(Integer content) {
        this.content = content;
    }

    public NodeAVL getRightNode() {
        return rightNode;
    }

    public void setRightNode(NodeAVL node) {
        this.rightNode = node;
    }

    public NodeAVL getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(NodeAVL node) {
        this.leftNode = node;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public NodeAVL(Integer content){
        this.content = content;
    }
}
