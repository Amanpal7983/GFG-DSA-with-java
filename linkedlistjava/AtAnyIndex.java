package linkedlistjava;


// insert value at any given index

// isme list ko traverse karne ya element ko print karne ka bhi code hai at any given index

class ThisList {
    Node head;
    Node tail;
    int size;
 
    // Insert element at head
    void addHead(int val) {

        Node temp = new Node(val);

        if (head == null) { // LL is empty
            head = tail = temp;
        }

        else { // not empty
            temp.next = head;
            head = temp;
        }
        size++;

    }
  
    //Insert element at the End
    void InsertAtEnd(int val) {
        Node temp = new Node(val);

        if (head == null) { // means list is empty both head and tail point at null
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
  

    // print all elements of LL
    void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;

        }
    }
    
    //print the size of LL
    void size() {
        System.out.println("The size of the Linked list is:" + size);
    }

    // get the value of any index
    int getValue(int idx){
        if(idx == size-1){
            return tail.val;
        }
        if(idx >=size || idx <0){
            System.out.println("invalid index:");
            return -1;
        }

        Node temp = head;
        for(int i = 1;i<=idx;i++){
            temp = temp.next;

        }
        return temp.val;
    }

    void addInList(int idx, int val) {
        // for base case 1
        if(idx == 0){
            addHead(val);
            return;

        }
        // for base case 2
        if(idx==size){
            InsertAtEnd(val);
            return;
        }
        // for base case 3
        if(idx>size){
            System.out.println("Invalid Index:");
            return;
        }
        Node temp = new Node(val);

        Node x =head;

        // x me idx se ek kam node ko save kar denge
        for(int i= 1; i<=idx-1; i++){
            x = x.next;
        }

        // main insertion part
        temp.next = x.next;
        x.next = temp;
        size++;

    }

    // for set the element at any index

    void setAtIndex(int idx,int val){
        if(idx == size-1){
            tail.val = val;
        }
        if(idx >=size){
            System.out.println("Invalid Index:");
        }

        Node temp = head;
        for(int i = 1; i<=idx;i++){
            temp = temp.next;
        }
        temp.val=val;
    }
   
    //delete the element at head
    void deleteAtHead(){
        if(head == null){
            System.out.println("LL is empty");
        }

        head = head.next;
        size--;
    }
   //delete the tail element
   void deleteAtTail(){
    if(head==null){
        System.out.println("error");
    }
    Node temp = head;
    for(int i=1;i<=size-2;i++){
        temp = temp.next;

    }
    temp.next = null;
    tail = temp;
    size--;
   }
   //delete at any index .. also apply for tail
   void deleteAtAnyIndex(int idx){
    if(head == null){
        System.out.println("error");
    }
    Node temp = head;
    for(int i =1;i<=idx-1;i++){
        temp = temp.next;
    }
    if(temp.next == tail){
        tail = temp;
    }
    temp.next = temp.next.next;
    size--;
   }





}

public class AtAnyIndex {
    public static void main(String[] args) {
        ThisList list = new ThisList();

        list.addHead(23);
        list.addHead(15);
        list.InsertAtEnd(56);
        list.InsertAtEnd(99);
        list.InsertAtEnd(10);
        list.InsertAtEnd(50);

        list.print();

        list.addInList(2, 44);
        System.out.println("After value add:");

        list.print();
        list.size();

        System.out.println(list.getValue(4));
        list.deleteAtHead();
        list.size();
        list.print();
        list.deleteAtTail();
        list.size();
        list.print();
        list.deleteAtAnyIndex(2);
        list.size();
        list.print();
        System.out.println(list.tail.val);
        list.addInList(3, 10);
        list.print();
        

    }
}
