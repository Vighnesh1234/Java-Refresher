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
    
    public void insertAfter(Node prev_Node,int data){
        //Checking if the previous Node is not null
        if(prev_node==Null){
            System.out.println("The prev node cannot be null");
            
        }
        //Allocate memory to the data
        Node new_Node=new Node(data);
        
        //Point the next of the new node to the next of the prev node 
        
        new_Node.next=prev_Node.next;
        
        //placing the new node after the given node
        
        prev_Node.next=new_Node;
        new_Node.prev=prev_Node;
        
        //Making the previous nodes next nodes prev to the current node
        if(new_Node.next!=Null){
            new_Node.next.prev=new_Node;
        }
        
        
    }
}
