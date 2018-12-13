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
 }

 public String toString() {
   return "";
 }

}
