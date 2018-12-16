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

   private Node getNthNode(int index) {
     Node current = start;
     for (int i = 0; i < size(); i++) {
       if (i < index) {
         current = current.getNext();
       }
     }
     return current;
   }

   public Integer get(int index) {
     if (index < 0 || index > size()) {
       throw new IndexOutOfBoundsException();
     }
     return getNthNode(index).getData();
   }

   public Integer set(int index,Integer value) {
     if (index < 0 || index > size()) {
       throw new IndexOutOfBoundsException();
     }
     Node current = getNthNode(index);
     Integer currentData = current.getData();
     current.setData(value);
     return currentData;
   }

   public boolean contains(Integer value) {
     Node current = start;
     for (int i = 0; i < size; i++) {
       if (current.getData() == value) {
         return true;
       }
       current = current.getNext();
     }
     return false;
   }

   public int indexOf(Integer value) {
     Node current = start;
     for (int i = 0; i < size; i++) {
       if (current.getData() == value) {
         return i;
       }
       current = current.getNext();
     }
     return -1;
   }

   public void add(int index,Integer value) {
     if(index < 0 || index > size()){
      throw new IndexOutOfBoundsException();
    }
     Node newNode = new Node(value); //creates a new node with the value
     size += 1;
     if (index == 0) {
       newNode.setNext(start);
       start.setPrev(newNode);
       start = newNode;
     }
     else {
       if (index == size() - 1) {
         end.setNext(newNode);
         newNode.setPrev(end);
         end = newNode;
       }
       else {
         Node prevNode = getNthNode(index-1);
         Node nextNode = getNthNode(index);
         prevNode.setNext(newNode); //finds the node before this index in the list
         newNode.setPrev(prevNode); //sets the prev and next for the new node
         newNode.setNext(nextNode);
         nextNode.setPrev(newNode);
       }
     }
   }

   public Integer remove(int index) {
     if(index < 0 || index > size()){
      throw new IndexOutOfBoundsException();
    }
    else {
      Node removed = getNthNode(index);
      if (index == 0) {
        start = getNthNode(index+1);
        start.setPrev(null);
        size -= 1;
      }
      else {
        if (index < size() - 1) {
          getNthNode(index-1).setNext(getNthNode(index+1));
          getNthNode(index+1).setPrev(getNthNode(index-1));
          size -= 1;
        }
        else {
          end = getNthNode(index-1);
          end.setNext(null);
          size -= 1;
        }
      }
      return removed.getData();
    }
   }

   public boolean remove(Integer value) { //a private method to find a node you want could be useful here
     if (contains(value)) {
       System.out.println("yes");
       remove(indexOf(value));
       return true;
     }
     return false;
   }

   public String toString() {
     String ans = "[";
     Node current = start;
     for (int i = 0; i < size; i++) {
       if (i == 0) {
         ans += start.getData();
         current = start.getNext();
       }
       else {
         if (i < size - 1) {
           ans += ", " + current.getData();
           current = current.getNext();
         }
         if (i == size - 1) {
           ans += ", " + current.getData();
         }
       }
     }
     return ans  + "]" + "\n";
   }

  public static void main(String[] args) {
 }
}
