package practice.tree.binaryTree;

//class Node{
//    int data;
//    Node left,right;
//
//    public Node(int x){
//        data =x;
//        left= right = null;
//    }
//}

public class MaxHeight {

    public static int depth(Node root){
        if(root == null)
            return 0;
        int lh =  depth(root.left);
        int rh =  depth(root.right);

        return 1 + Math.max(lh,rh);
    }


    public static void main(String[] args) {
        Node root =  new Node(1);
        root.left =  new Node(2);
        root.right =  new Node(3);
        root.left.left =  new Node(4);
        root.left.right =  new Node(5);
        root.right.left =  new Node(6);
        root.right.right =  new Node(7);
        root.right.right.right =  new Node(8);

        int height = depth(root);
        System.out.println("Height is : " + height);
    }
}
