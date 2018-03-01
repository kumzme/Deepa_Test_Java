package Deepa.Driver;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Iterator;
import java.util.LinkedList;

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
    //Java program to get the first and last occurrence of the specified elements in a linked list
    public static void main(String[] args){

        LinkedList<String> a1 = new LinkedList<String>();
        a1.add("new Exercise 1");
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

   }
}
