public class Driver {
  public static void main(String[] args){
    MyLinkedList list = new MyLinkedList(); //creates empty list
    System.out.println(list);
    int[] origlist = {10, -23, 83, 7, 0, -75, 56, 43, -1, 12};
    for (int x = 0; x < 10; x++) {
      list.add(origlist[x]);
      //list.add((int)(Math.random() * 100)); //adds in random numbers
      System.out.println(list);
    }
    int[] list3 = {92, 12, -2, 53, -32};
    MyLinkedList newlist3 = new MyLinkedList();
    for (int x = 0; x < 5; x++) {
      newlist3.add(list3[x]);
      System.out.println(newlist3);
    }
    System.out.println("Should print -75: " + list.get(5));
    System.out.println("Should print 7: " + list.set(3,28));
    System.out.println("The value at index 3 is now 28: " + list);
    System.out.println("Testing if the list contains 83, should print true: " + list.contains(83));
    System.out.println("Should print 2, the index of 83: " + list.indexOf(83));
    System.out.println("Testing if the list contains -2, should print false: " + list.contains(-2));
    System.out.println("Should print -1, because the list doesn't contain -2: " + list.indexOf(-2));
    list.add(2,-9);
    System.out.println("-9 should be at index 2: " + list);
    list.add(3,17);
    System.out.println("17 should be at index 3: " + list);
    list.add(0,1);
    System.out.println("1 should be at index 0: " + list);
    list.add(0,0);
    System.out.println("0 should be at index 0: " + list);
    System.out.println("Removing index 4, should print -9: " + list.remove(4));
    System.out.println(list);
    System.out.println("Finding indexOf of 0: " + list.indexOf(new Integer (0)));
    System.out.println("Removing value 0, should print true: " + list.remove(new Integer (0)));
    System.out.println(list);
    System.out.println("Removing value 12, should print true: " + list.remove(new Integer (12)));
    System.out.println(list);

    System.out.println("\n" + "Testing special cases");
    MyLinkedList list2 = new MyLinkedList();
    list2.add(40);
    System.out.print(list2);
    System.out.println("Prints out 40: " + list2.get(0));
    System.out.println("Testing if the list contains 40, should print true: " + list2.contains(40));
    System.out.println("Should print 0, the index of 40: " + list2.indexOf(40));
    list.extend(newlist3);
    System.out.println("list extends list3: " + list);
    System.out.println("size of list3, should be 0: " + newlist3.size());
    System.out.println("size of list, should be 16: " + list.size());
    System.out.println("start of list, should be 1: " + list.get(0));
    System.out.println("end of list, should be -32: " + list.get(list.size() - 1));
    list.extend(list2);
    System.out.print(list);
  }
}
