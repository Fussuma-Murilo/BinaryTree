public class NodeAVL {
    private Integer content;
    private NodeAVL rightNode;
    private NodeAVL leftNode;
    private Integer fator;

    public Integer getContent() {
        return content;
    }

    public void setContent(Integer content) {
        this.content = content;
    }

    public NodeAVL getRightNode() {
        return rightNode;
    }

    public void setRightNode(Integer content) {
        this.rightNode = new NodeAVL(content);
    }

    public NodeAVL getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Integer content) {
        this.leftNode = new NodeAVL(content);
    }

    public NodeAVL(Integer content){
        this.content = content;
    }
}
