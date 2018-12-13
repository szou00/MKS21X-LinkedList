public class MyLinkedList {
  private int size;
  private Node start,end;

  public MyLinkedList(Node newStart, Node newEnd){
   start = newStart;
   end = newEnd;
   start.setNext(end);
   end.setPrev(start);
   size = 2; //those two nodes
 }

 public int size() {
   return size;
 }

 public boolean add(int value) {
   Node newVal = new Node(value);
   end.setNext(newVal);
   end = newVal; //the new Node becomes the last node
   newVal.setPrev(end); //it gets the end as the previous and vice versa
   size += 1; //size increases by one
   return true;
 }

 public String toString() {
   return "";
 }

}
