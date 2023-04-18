package practice.tree.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static Queue<Node> q = new LinkedList<>();

    public static void printTraversal(Node root){
       q.add(root);
       q.add(null);

        while(!q.isEmpty()){
            Node data = q.remove();
            if(data == null){
                System.out.println("");
                if(q.isEmpty())
                    return;
                q.add(null);
                continue;

            }

            System.out.print(data.data + " ");

            if(data.left != null){
                q.add(data.left);
            }
            if(data.right != null){
                q.add(data.right);
            }

        }
    }

    public static void main(String[] args) {
        Node root =  new Node(1);
        root.left =  new Node(2);
        root.right =  new Node(3);
        root.left.left =  new Node(4);
        root.left.right =  new Node(5);
        root.right.left =  new Node(6);
        root.right.right =  new Node(7);
        printTraversal(root);
    }
}
