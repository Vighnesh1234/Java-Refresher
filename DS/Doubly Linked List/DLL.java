public class MyClass {
    Node head;
    class Node{
        
        int data;
        Node prev,Node next;
        Node(int d){
            data=d;
        }
    }
    
    
    public static void main(String args[]) {
     
      System.out.println("" );
    }
    
    
    public void push(int new_data){
        //Allocate memory to the data
        //put the data inside the node
        Node new_Node=new Node(new_data);
        new_Node.next=head;
        new_Node.prev=null;
        if(head!=null)
        head.prev=new_Node;
   
        head=new_Node;
    }
}
