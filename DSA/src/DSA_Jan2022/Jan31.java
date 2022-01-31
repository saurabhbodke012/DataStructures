package DSA_Jan2022;

public class Jan31 {

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

    public static int maximumTree(Node root){

        if(root == null){
            return Integer.MIN_VALUE;
        }

        return Math.max(root.key, Math.max(maximumTree(root.left), maximumTree(root.right)));

    }

    public static void main(String[] args) {
        Node root=new Node(20);
        root.left=new Node(8);
        root.right=new Node(12);
        root.left.left=new Node(24);
        root.left.right=new Node(4);
        root.right.right=new Node(12);

        System.out.println(maximumTree(root));

    }
}
