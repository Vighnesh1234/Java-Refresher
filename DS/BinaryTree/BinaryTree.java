public class Node{
   
   int key;
   Node left,right;
   
   Node(int item){
       key=item;
       left=right=null;
   }
    
    
    
    
    
}





 class BinaryTree {
    
    Node root;
    
    BinaryTree(int key){
        root=new Node(key);
    }
    
    BinaryTree(){
        root=null;
    }
    
    public static void main(String args[]) {
    
    BinaryTree tree= new Node(1);
    tree.root.left=new Node(2);
    tree.root.right=new Node(3);
     tree.root.left=new Node(4);
    }
}
