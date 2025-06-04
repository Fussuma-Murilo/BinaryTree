public class AVLTree {
    public NodeAVL mainNode;

    public AVLTree() {
        this.mainNode = null;
    }

    public void Insert(Integer content, NodeAVL node) {
        if (mainNode == null || mainNode.getLeftNode() == null || mainNode.getRightNode() == null) {
            if (mainNode == null) mainNode = new NodeAVL(content);
            if (mainNode.getContent() >= content && mainNode.getLeftNode() == null) mainNode.setLeftNode(content);
            if (mainNode.getRightNode() == null) mainNode.setRightNode(content);
            return;
        } else { //Os nós ligados à raiz não estão disponíveis
             if (node == null) {
                 Insert(content, mainNode.getLeftNode());
                 Insert(content, mainNode.getRightNode());
                 return;
             }

             if (node.getContent() >= content) {
                 if (node.getLeftNode() == null) {
                     node.setLeftNode(content);
                     return;
                 } else {
                     Insert(content, node.getLeftNode());
                     return;
                 }
             } else {
                 if (node.getRightNode() == null) node.setRightNode(content);
             }
            }
        }

//    public void Insert(Integer content, NodeAVL node) {
//        if (mainNode == null) {
//            mainNode = new NodeAVL(content);
//            return;
//        } else {
//            if (mainNode.getContent() >= content && mainNode.getLeftNode() == null) {
//                mainNode.setLeftNode(content);
//                return;
//            } else if (mainNode.getRightNode() == null) {
//                mainNode.setRightNode(content);
//                return;
//            } else { //Os nós ligados à raiz não estão disponíveis
//                if (node == null) {
//                    Insert(content, mainNode);
//                    return;
//                }
//                NodeAVL aux = mainNode;
//                if (true){}
//            }
//        }
//    }

    public void runPreOrderR(NodeAVL node) {
        if (node != null) {
            System.out.println(node.getContent());
            runPreOrderR(node.getLeftNode());
            runPreOrderR(node.getRightNode());
        }
    }
}
