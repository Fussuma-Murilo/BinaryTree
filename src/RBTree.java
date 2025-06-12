public class RBTree {

    private RBNode root;
    private final RBNode NIL;

    public RBTree(Integer content) {
        NIL = new RBNode(-1);
        NIL.setColor(Color.BLACK);
        NIL.setLeftNode(null);
        NIL.setRightNode(null);
        NIL.setParent(null);
        root = NIL;
    }

    private void LeftRotate(RBNode x) {
        RBNode y = x.getRightNode();
        x.setRightNode(y.getLeftNode());
        if (y.getLeftNode() != NIL) {
            y.getLeftNode().setParent(x);
        }

        y.setParent(x.getParent());

        if (x.getParent() == null) root = y;
        else if (x == x.getParent().getLeftNode()) x.getParent().setLeftNode(y);
        else x.getParent().setRightNode(y);

        y.setLeftNode(x);
        x.setParent(y);
    }

    private void RightRotate(RBNode x){
        RBNode y = x.getLeftNode();
        y.setLeftNode(x.getRightNode());
        if (x.getRightNode() != NIL) {
            x.getParent().setRightNode(y);
        }

    }

    public void AddNode(Integer content){
        RBNode node = new RBNode(content);
        node.setLeftNode(NIL);
        node.setRightNode(NIL);
        node.setParent(NIL);

        RBNode y = null;
        RBNode x = root;

        while (x != NIL) {
            y = x;
            if ( node.getContent() < x.getContent()) {
                root = node;
            } else if (node.getContent() < y.getContent()){
                y.setLeftNode(node);
            } else {
                y.setRightNode(node);
            }
        }

        node.setParent(y);
        if (y == null) {
            root = node;
        } else if ( node.getContent() < y.getContent()) {
            y.setLeftNode(node);
        } else {
            y.setRightNode(node);
        }

        node.setLeftNode(NIL);
        node.setRightNode(NIL);
        node.setColor(Color.RED);

        InsertFix(node);
    }

    private void InsertFix(RBNode k){
        while (k.getParent() != null && k.getParent().getColor() == Color.RED{
            if (k.getParent() == k.getParent().getParent().getLeftNode()){
                RBNode u = k.getParent().getParent().getRightNode();
                if(u.getColor() == Color.RED) {
                    k.getParent().setColor(Color.BLACK);
                    u.setColor(Color.BLACK);
                    k.getParent().getParent().setColor(Color.RED);
                    k = k.getParent().getParent();
                } else {
                    if (k == k.getParent().getRightNode()){
                        k = k.getParent();
                        LeftRotate(k);
                    }
                    k.getParent().setColor(Color.BLACK);
                    k.getParent().getParent().setColor(Color.RED);
                    RightRotate(k.getParent().getParent());
                }
            }
        }
    }
}
