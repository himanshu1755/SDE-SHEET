package practice.tree.binaryTree;

import java.util.ArrayList;
import java.util.List;

class Node{
    int data;
    Node left,right;

    public Node(int x){
        data =x;
        left= right = null;
    }
}


public class Traversal {

    public static List<Integer> preOrderResult = new ArrayList<>();
    public static List<Integer> postOrderResult = new ArrayList<>();
    public static List<Integer> inOrderResult = new ArrayList<>();

    public static void preOrder(Node root){

        if(root == null)
            return;
        preOrderResult.add(root.data);
        preOrder(root.left);
        preOrder(root.right);

    }
    public static void postOrder(Node root){

        if(root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        postOrderResult.add(root.data);

    }
    public static void inOrder(Node root){

        if(root == null)
            return;

        inOrder(root.left);
        inOrderResult.add(root.data);
        inOrder(root.right);


    }

    public static void main(String[] args) {
        Node root =  new Node(1);
        root.left =  new Node(2);
        root.right =  new Node(3);
        root.left.left =  new Node(4);
        root.left.right =  new Node(5);
        root.right.left =  new Node(6);
        root.right.right =  new Node(7);

        preOrder(root);
        postOrder(root);
        inOrder(root);
        System.out.println("PreOrder Traversal====");

        for(int i=0;i< preOrderResult.size();i++){
            System.out.print( preOrderResult.get(i) +"->");
        }
        System.out.println("");
        System.out.println("PostOrder Traversal====");


        for(int i=0;i< postOrderResult.size();i++){
            System.out.print( postOrderResult.get(i) +"->");
        }

        System.out.println("");
        System.out.println("InOrder Traversal====");


        for(int i=0;i< inOrderResult.size();i++){
            System.out.print( inOrderResult.get(i) +"->");
        }
    }
}
