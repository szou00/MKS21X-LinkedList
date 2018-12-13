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
   String ans = "[";
   Node current = start;
   for (int i = 0; i < size; i++) {
     if (current != end) {
       ans += current.getData() + ", ";
       current = current.getNext();
     }
     else {
       ans += current.getData() + "]" + "\n";
     }
   }
   return ans;
 }

 public static void main(String[] args) {
   Node test1 = new Node(5);
   Node test2 = new Node(-3);
   MyLinkedList list = new MyLinkedList(test1, test2);
   System.out.print(list);
   for (int x = 0; x < 10; x++) {
     list.add((int)(Math.random() * 100));
     System.out.print(list);
   }
 }
}
