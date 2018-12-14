public class MyLinkedList {
  private int size;
  private Node start,end;

  //Node class
  private class Node{
     private int data;
     private Node next,prev;
     public Node(int x) {
       data = x;
     }

     public Node(int x, Node nextN, Node prevN) {
       data = x;
       next = nextN;
       prev = prevN;
     }

     public Integer getData() {
       return data;
     }

     public Node getNext() {
       return next;
     }

     public Node getPrev() {
       return prev;
     }

     public void setData(Integer newData) {
       data = newData;
     }

     public void setPrev(Node newPrev) {
       prev = newPrev;
     }

     public void setNext(Node newNext) {
       next = newNext;
     }

    }
    //end of Node class

   //creates a new, empty list
   public MyLinkedList(){
     size = 0;
   }

   public int size() {
     return size;
   }

   public boolean add(Integer value) {
     Node newVal = new Node(value);
     if (size() == 0) {
       start = newVal;
       size += 1;
       return true;
     }
     if (size() == 1) {
         end = newVal;
         start.setNext(newVal);
         end.setPrev(start);
         size += 1;
         return true;
      }
     else {
         end.setNext(newVal);
         newVal.setPrev(end); //it gets the end as the previous and vice versa
         end = newVal; //the new Node becomes the last node
         size += 1; //size increases by one
         return true;
     }
   }

   public Integer get(int index) {
     Node current = start;
     for (int i = 0; i < size(); i++) {
       if (i == index) {
         return current.getData();
       }
       else {
         current = start.getNext();
       }
     }
     return 0;
   }

   public String toString() {
     String ans = "[";
     Node current = start;
     for (int i = 0; i < size; i++) {
       if (current != end) {
         ans += current.getData() + ", ";
         current = current.getNext();
       }
       else {
         if (current == start) {
           ans += current.getData();
         } //SHARON THIS!! MAKE START EQUAL TO LAST
         if (current == end) {
           ans += current.getData();
         }
       }
     }
     return ans  + "]" + "\n";
   }

  public static void main(String[] args) {
 }
}
