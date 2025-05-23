import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    private Node mainNode;

    public BinaryTree(String content){
        this.mainNode = new Node(content);
    }

    public Node getMainNode() {
        return mainNode;
    }

    public void setMainNode(Node mainNode) {
        this.mainNode = mainNode;
    }

    private Integer checkNodes(Node node){
        Integer count = 0;
        if(node.getLeftNode() != null){
            count += checkNodes(node.getLeftNode());
        }
        if(node.getRightNode() != null){
            count += checkNodes(node.getRightNode());
        }
        count++;
        return count;
    }

    public Integer countNodes(){
        Integer count = 0;

        if(this.mainNode == null){
            return 0;
        }

        count += checkNodes(mainNode);

        return count;
    }

    public void runList(String method, String type){
        if (mainNode == null){
            return;
        }

        if (type.equals("Recursive")){
            switch (method){
                case "PreOrder":
                    runPreOrderR(mainNode);
                case "InOrder":
                    runInOrderR(mainNode);
                case "PostOrder":
                    runPostOrderR(mainNode);
                case "InLevel":
                    runInLevelR(mainNode);
            }
        } else {
            switch (method){
                case "PreOrder":
                    runPreOrder(mainNode);
                case "InOrder":
                    runInOrder(mainNode);
                case "PostOrder":
                    runPostOrder(mainNode);
                case "InLevel":
                    runInLevel(mainNode);
            }
        }
    }

    private void runPreOrderR(Node node){
        if (node != null){
            System.out.println(node.getContent());
            runPreOrderR(node.getLeftNode());
            runPreOrderR(node.getRightNode());
        }
    }

    private void runInOrderR(Node node){
        if (node != null){
            runInOrderR(node.getLeftNode());
            System.out.println(node.getContent());
            runInOrderR(node.getRightNode());
        }
    }

    private void runPostOrderR(Node node){
        if (node != null){
            runPostOrderR(node.getLeftNode());
            runPostOrderR(node.getRightNode());
            System.out.println(node.getContent());
        }
    }

    private void runInLevelR(Node node){
        if (node != null){
            List<Node> branches = new ArrayList<>(countNodes());

            branches.add(node.getLeftNode());
            branches.add(node.getRightNode());
        }
    }

    private void runPreOrder(Node node){
        List<Node> list = new ArrayList<>(countNodes());



    }

    private void runInOrder(Node node){

        do {
            System.out.println(node.getContent());
            node = node.getLeftNode();
        } while (node.getLeftNode() != null);
    }

    private void runPostOrder(Node node){

    }

    private void runInLevel(Node node){

    }
}
