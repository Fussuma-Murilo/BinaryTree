public class AVLTree {
    NodeAVL mainNode;

    public AVLTree() {
        this.mainNode = null;
    }

    Integer height(NodeAVL node){
        if (node == null) return 0;
        return node.getHeight();
    }

    Integer BalanceFactor(NodeAVL node){
        if (node == null) return 0;
        return height(node.getLeftNode()) - height(node.getRightNode());
    }

    NodeAVL RightRotation (NodeAVL x) {
        NodeAVL y = x.getLeftNode();
        NodeAVL z = y.getRightNode();

        y.setRightNode(x);
        x.setLeftNode(z);

        x.setHeight(Math.max(height(x.getLeftNode()), height(x.getRightNode())));
        y.setHeight(Math.max(height(y.getLeftNode()), height(y.getRightNode())));

        return y;
    }

    NodeAVL LeftRotation (NodeAVL x) {
        NodeAVL y = x.getRightNode();
        NodeAVL z = y.getLeftNode();

        y.setLeftNode(x);
        x.setRightNode(z);

        x.setHeight(Math.max(height(x.getLeftNode()), height(x.getRightNode())));
        y.setHeight(Math.max(height(y.getLeftNode()), height(y.getRightNode())));

        return y;
    }

    public NodeAVL InsertNode(Integer content, NodeAVL node) {
        if (node == null) return new NodeAVL (content);

        if (content < node.getContent()) {
            node.setLeftNode(InsertNode(content, node.getLeftNode()));
        }
        else if (content > node.getContent()) {
            node.setRightNode(InsertNode(content, node.getRightNode()));
        } else {
            return node;
        }

        node.setHeight(1 + Math.max(height(node.getLeftNode()), height(node.getRightNode())));

        Integer balance = BalanceFactor(node);

        if (balance > 1 && content < node.getLeftNode().getContent()) {
            return RightRotation(node);
        }

        if (balance < -1 && content > node.getRightNode().getContent()) {
            return LeftRotation(node);
        }

        if (balance > 1 && content > node.getLeftNode().getContent()) {
            node.setLeftNode(LeftRotation(node.getLeftNode()));
            return RightRotation(node);
        }

        if (balance < -1 && content < node.getRightNode().getContent()){
            node.setRightNode(RightRotation(node.getRightNode()));
            return LeftRotation(node);
        }

        return node;
    }

    public void runPreOrderR(NodeAVL node) {
        if (node != null) {
            System.out.println(node.getContent());
            runPreOrderR(node.getLeftNode());
            runPreOrderR(node.getRightNode());
        }
    }
}
