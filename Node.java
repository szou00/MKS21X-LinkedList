public class Node{
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

 public int getData() {
   return data;
 }

 public Node getNext() {
   return next;
 }

 public Node getPrev() {
   return prev;
 }

 public void setData(int newData) {
   data = newData;
 }

 public void setPrev(Node newPrev) {
   prev = newPrev;
 }

 public void setNext(Node newNext) {
   next = newNext;
 }
 
}
