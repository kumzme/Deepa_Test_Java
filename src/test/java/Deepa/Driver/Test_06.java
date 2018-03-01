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

   }
}
