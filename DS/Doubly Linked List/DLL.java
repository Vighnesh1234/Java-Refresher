public class MyClass {
    Node head;
    class Node{
        
        int data;
        Node prev, next;
        Node(int d){
            data=d;
        }
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
        
         System.out.println("test1");
        
        if(prev_Node==null){
            System.out.println("The prev node cannot be null");
            
        }
        //Allocate memory to the data
        Node new_Node=new Node(data);
          System.out.println("test2");
        //Point the next of the new node to the next of the prev node 
          System.out.println("test3");
        new_Node.next=prev_Node.next;
          System.out.println("test4");
        //placing the new node after the given node
          System.out.println("test5");
        prev_Node.next=new_Node;
        new_Node.prev=prev_Node;
          System.out.println("test6");
        //Making the previous nodes next nodes prev to the current node
        if(new_Node.next!=null){
            new_Node.next.prev=new_Node;
            System.out.println("test7");
        }
        
        
    }
    
    
     public void append(int new_data){
          //Allocate memory to the data
         Node new_node=new Node(new_data);
         new_node.next=null;
         
         Node last = head;
         if(head==null)
         {
             new_node.prev=null;
            head=new_node;
            return;
         }
         
         last=head;
         
         //iterating over the list 
         while(last.next!=null)
         {
             last=last.next;
         }
         
         last.next=new_node;
         new_node.prev=last;
         
         
         
     }
     
     //______________________________________________________
   
       
    //
    
      public void insertBefore(Node givenNode,int data){
          //Allocate memory to the data
         Node newNode=new Node(data);
         newNode.prev=givenNode.prev;
         givenNode.prev=newNode;
         newNode.next=givenNode;
         
        
        
         
     }
     
     static public void printlist(Node node) 
    { 
        Node last = null; 
        System.out.println("Traversal in forward Direction"); 
        while (node != null) { 
            System.out.print(node.data + " "); 
            last = node; 
            node = node.next; 
        } 
        System.out.println(); 
        System.out.println("Traversal in reverse direction"); 
        while (last != null) { 
            System.out.print(last.data + " "); 
            last = last.prev; 
        } 
    } 
     
     
    static public void print(Node node){
        Node last=null;
         while (node!=null){
             System.out.println(node.data);
             last=node;
             node=node.next;
             
             
         }
         
     }
     
     public static void main(String args[])
     {
         MyClass dll=new MyClass();
        
          dll.push(7);
       dll.append(4); 
          dll.insertAfter(dll.head,0);

        print(dll.head);
     }
    
}
