package Deepa.Driver;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import sun.awt.image.ImageWatched;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Test_06
{
    private static final Logger l = LogManager.getLogger(Test_05.class.getName());
    //Java program to append the specified element to the end of a linked list
    public static void   Collection_LinkedList_22_01(LinkedList<String> a1 ){
        a1.addLast("new Exercise 55");
        l.info(a1.toString());

    }
    //Java program to iterate through all elements in a linked list
    public static void Collection_LinkedList_22_02(LinkedList<String> a1){
     for(int i = 0; i< a1.size(); i++){
         l.info(a1.iterator());

     }
    }
    //Java program to iterate through all elements in a linked list starting at the specified position
    public static void Collection_LinkedList_22_03(LinkedList<String>a1){
        Iterator I = a1.listIterator(1);
        while(I.hasNext()){
            l.info(I.next());
        }
    }

    //Java program to iterate a linked list in reverse order
   // public static void Collection_LinkedList_22_04(LinkedList<String>a1){
     // Iterator it = list.descendingIterator(); }

    //Java program to insert the specified element at the specified position in the linked list
    public static void Collection_LinkedList_22_05(LinkedList<String>a1 ){
        a1.add(2,"New Exeercise 11");
        l.info(a1);
        a1.add(2,"New exercise 111");
        l.info(a1);
    }
    // Java program to insert elements into the linked list at the first and last position
    public static void Collection_LinkedList_22_06(LinkedList<String>a1){
        a1.addFirst("testing starts");
        a1.addLast("testing ends");
        l.info(a1);
    }
    //Java program to insert the specified element at the front of a linked list
    //public static void Colllection_LinkedList_22_07(LinkedList<String>a1){
    //    a1.offerFirst("testing Front");
    //}
    //Java program to insert the specified element at the end of a linked list.
    //public static void Colllection_LinkedList_22_08(LinkedList<String>a1){
    //    a1.offerLast("testing last");
    //}
    //Java program to insert some elements at the specified position into a linked list.
    public static void Collection_LinkedList_22_09(LinkedList<String>a1){
        LinkedList<String> a2 = new LinkedList<String>();
        l.info("____________a2________");
        a2.add("11111");
        a2.add("new added Exercise22");
        a2.add("new added Exercise21");
        a2.add("new added Exercise22");
        a2.add("new added Exercise21");
        l.info("new LinkedList" +a1);
        l.info("_____a2 end______");
        a1.addAll(1,a1);
        l.info(a1);

    }
    //Java program to display the elements and their positions in a linked list
    public static void Collection_LinkedList_22_10(LinkedList<String>a1){
        l.info(a1.get(1));
        l.info(a1.element() );
        for(int i = 0; i < a1.size() ; i++){
            l.info(a1.get(i) );
        }
    }
    //Java program to remove a specified element from a linked list
    public static void Collection_LinkedList_22_11(LinkedList<String>a1){
        l.info("before removing " + a1);
        a1.remove("1");
        l.info("after removing 1" + a1);
        a1.remove(2);
        l.info("after removing 2" + a1);
    }
    //Java program to remove all the elements from a linked list.
    public static void Collection_LinkedList_22_12(LinkedList<String>a1){
        a1.clear();
    }
    //Java program of swap two elements in an linked list.
    public static void Collection_LinkedList_22_13(LinkedList<String>a1){
        Collections.swap(a1,0,1);
        l.info(a1);
    }
    //Java program to shuffle the elements in a linked list
    public static void Collection_LinkedList_22_14(LinkedList<String>a1){
        Collections.shuffle(a1);
        l.info(a1);
    }
    //Java program to join two linked lists
    public static void Collection_LinkedList_22_15(LinkedList<String>a1,LinkedList<String>a2){
        LinkedList<String> a3 = new LinkedList<String>();
        a3.addAll(a1);
        a3.addAll(a2);
        l.info(a3);
    }
    //Java program to clone an linked list to another linked list
    public static void Collection_LinkedList_22_16(LinkedList<String>a1){
        a1.clone();
        l.info(a1);
    }
    //Java program to retrieve but does not remove, the first element of a linked list.
   // public static void Collection_LinkedList_22_20(LinkedList<String >a1) {
   //     a1.peekFirst();
   // }
    //Java program to check if a particular element exists in a linked list
    public static void Collection_LinkedList_22_22(LinkedList<String>a1){

        if(a1.contains("1")) {
            l.info("exist");
        }
    }
    //A palindrome is a word or phrase that reads the same forward and backward
    public static void Collection_ListIterator_palin(LinkedList<String>a1){
        ListIterator<String> For_itr = a1.listIterator();
        ListIterator<String> Back_itr = a1 .listIterator(a1.size());
        boolean flag = false;
        while (For_itr.hasNext() && Back_itr.hasPrevious() ) {
            if (For_itr.next() == Back_itr.previous()) {
                flag = true;
                l.info(" Str is palindrome");
            } else{
                l.info("Str is not palindrome");
        }
        }
    }
    //Java program to get the first and last occurrence of the specified elements in a linked list
    public static void main(String[] args){

        LinkedList<String> a1 = new LinkedList<String>();
        a1.add(" 1");
        a1.add("new exercise 2");
        a1.add("new exercise 3");
        a1.add("new exercise 4");
        a1.add("new exercise 5");
        Collection_LinkedList_22_01(a1);
        Collection_LinkedList_22_02(a1);
        Collection_LinkedList_22_03(a1);
        Collection_LinkedList_22_05(a1);
        Collection_LinkedList_22_06(a1);
        LinkedList<String> a11 = new LinkedList<String>();
        a11.add("1");
        a11.add(" 2");
        a11.add(" 3");
        a11.add("4");
        a11.add(" 5");
      Collection_LinkedList_22_09(a11);
      Collection_LinkedList_22_10(a11);
      Collection_LinkedList_22_11(a11);
      Collection_LinkedList_22_12(a11);
      Collection_LinkedList_22_13(a1);
      Collection_LinkedList_22_14(a1);
        LinkedList<String> a12 = new LinkedList<String>();
        a11.add("1oo");
        a11.add(" 200");
        a11.add(" 300");
        a11.add("400");
        a11.add(" 500");
      Collection_LinkedList_22_15(a1,a12);
      Collection_LinkedList_22_16(a1);
      Collection_LinkedList_22_22(a1);
      LinkedList<String> palindrome = new LinkedList<String>();
      palindrome.add("abcba");

      Collection_ListIterator_palin(palindrome);


   }
}
