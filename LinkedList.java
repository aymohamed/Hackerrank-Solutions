/*
Node is defined as
class Node {
   int data;
   Node next;
}
*/



/*These methods shown below are "method-only" submission.
You only need to complete these methods.
In order to test these methods, I would recommend that
you create your own main method and comment out the other
methods that are not in use!
*/




/*
  Insert Node at the beginning of a linked list
  head pointer input could be NULL as well for empty list

*/

Node Insert(Node head,int x) {

    Node mynode = new Node();
    mynode.data = x;
    mynode.next = head;
    return mynode;
}





/*
  Insert Node at the end of a linked list
  head pointer input could be NULL as well for empty list

*/
Node Insert(Node head,int data) {

    if(head==null){
        head = new Node();
        head.data = data;

    } else{
        Node current = head;
        while(current.next!=null){
        current = current.next;
    }
    current.next = new Node();
    current.next.data = data;
    }
    return head;




}


/*
  Prints elements of a linked list
  head pointer input could be NULL as well for empty list

*/


void Print(Node head) {
    if(head==null){
        return;
    }
    Node temp = head;
    while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
    }


}
