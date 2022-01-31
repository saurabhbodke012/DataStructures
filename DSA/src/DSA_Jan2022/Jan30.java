package DSA_Jan2022;

import java.util.ArrayList;

public class Jan30 {

    static class Node
    {
        int key;
        Node left;
        Node right;
        Node(int k){
            key=k;
            left=right=null;
        }
    }


    public static int heightTree(Node root){
        if(root ==  null){
            return 0;
        }else{
            return Math.max(heightTree(root.left), heightTree(root.right)) + 1;
        }
    }

//    private static ArrayList<Integer> list= new ArrayList<>();
    public static int sizeTree(Node root){
        if(root==null){
            return 0;
        }
        return 1+ sizeTree(root.left)+ sizeTree(root.right);
    }


    public static boolean childrenSum(Node root){

        if (root == null){
            return true;
        }

        if(root.left == null && root.right== null){
            return true;
        }

        int sum=0;
        if(root.left != null){
            sum = sum+root.left.key;
        }

        if(root.right!= null){
            sum = sum +root.right.key;
        }

        return (root.key == sum && childrenSum(root.left) && childrenSum(root.right));

    }


    public static void main(String args[])
    {
        Node root=new Node(20);
        root.left=new Node(8);
        root.right=new Node(12);
        root.left.left=new Node(4);
        root.left.right=new Node(4);
        root.right.right=new Node(12);

        System.out.print(childrenSum(root));
    }
}
