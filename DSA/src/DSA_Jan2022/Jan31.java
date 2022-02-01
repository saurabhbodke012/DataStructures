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

    private static int maxLevel=0;

    public static int maximumTree(Node root){

        if(root == null){
            return Integer.MIN_VALUE;
        }

        return Math.max(root.key, Math.max(maximumTree(root.left), maximumTree(root.right)));

    }

    public static void leftView(Node root, int level){

        if(root ==  null){
            return;
        }

        if(maxLevel< level){
            System.out.print(root.key + " ");
            maxLevel= level;
        }
        leftView(root.left, level+1);
        leftView(root.right, level+1);
    }

    public static void main(String[] args) {
        Node root=new Node(20);
        root.left=new Node(8);
        root.right=new Node(12);
        root.left.left=new Node(24);
        root.left.right=new Node(4);
        root.right.right=new Node(12);
        root.right.left= new Node(30);

//        System.out.println(maximumTree(root));
        leftView(root,1);
    }
}
