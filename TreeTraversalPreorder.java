public class TreeTraversalPreorder {
   
    public static  class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
       
    }

    // size calculation
    public static int Size(Node root){
        if(root==null){
            return 0 ;
        }
         return 1+Size(root.left)+Size(root.right);
    }

    // tree Traversal
    public static void  PreOrderTraversal(Node root){
        if(root==null){
            return;
        }
       
        System.out.print(root.val+" ");
        //recurse
        PreOrderTraversal(root.left);
        PreOrderTraversal(root.right);
    }
    public static void main(String[] args) {
        Node root= new  Node(10);
        Node a= new Node(1);
        Node b= new Node(3);
        Node c = new Node(2);
        Node d  = new Node(5);
        root.left=a;
        root.right=b;
        a.left=c;
        a.right=d;
        PreOrderTraversal(root);
         System.out.println();
        // System.out.println(size);

        System.out.println(Size(root));

    }
}
