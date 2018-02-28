package Deepa.Driver;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.max;
import static java.util.Collections.shuffle;

public class Test_05 {
    private static final Logger l = LogManager.getLogger(Test_05.class.getName());

    public static void Collections_Exercise_22_1(List<String> a1) {
        //create a new array list, add some colors (string)
        a1.add("Red00007");
        a1.add("Green1");
        a1.add("Blue");
        l.info(a1);
        // l.info(a1.toString());
    }

    //iterate through all elements in a array list
    public static void Collections_Exercise_22_2(List<String> a2) {
        Collections_Exercise_22_1(a2);
        a2.add("1");
        a2.add("12");
        a2.add("4");
        a2.add("9");
        a2.add("0");
        for (int i = 0; i < a2.size(); i++) {
            l.info(a2.get(i));
        }
    }

    //insert an element into the array list at the first position
    public static void Collection_Exercise_22_3(List<String> a2) {
        Collections_Exercise_22_2(a2);
        a2.add(1, "Red");
        a2.add(2, "Green");
        l.info(a2);
    }
    // retrieve an element (at a specified index) from a given array list

    public static void Collections_Exercise_22_4(List<String> a1) {
        Collection_Exercise_22_3(a1);
        a1.get(1);
        a1.get(2).length();
        l.info(a1.get(3));
    }

    // update specific array element by given element
    public static void Collections_Exercise_22_5(List<String> a1) {
        Collection_Exercise_22_3(a1);
        a1.set(2, "My java Arry");
        a1.set(1, "learning");
        l.info(a1.get(19));
        l.info(a1);

    }

    //remove the third element from a array list
    public static void Collection_Exercise_22_6(List<String> a10) {
        a10.remove(2);
        l.info(a10);
    }

    //search an element in a array list.
    public static void Collection_Exercise_22_7(List<String> a11) {
        Collection_Exercise_22_6(a11);
        for (String srhV : a11) {
            if (srhV.startsWith("1")) {
                l.info("String found");
            }
        }

    }

    //sort a given array list
    public static void Collection_Exercise_22_8(List<String> a1) {
        Collection_Exercise_22_7(a1);
        Collections.sort(a1);
        l.info(a1);

    }

    //Java program to copy one array list into another
    public static void Collection_Exercise_22_9(List<String> a1) {
        List<String> a2 = new ArrayList<String>();
        //a2 = a1;
        Collections.copy(a1, a2);
        l.info(a2);
    }

    //shuffle elements in a array list
    public static void Collection_exercise_22_10(ArrayList<String> a2) {

        List<String> list = new ArrayList<String>();
        list.add(new String("H1.txt"));
        list.add(new String("H2.txt"));
        list.add(new String("H3.txt"));
        list.add(new String("H4.txt"));
        l.info(list.toString());
        //l.info(list.toArray());
        Collections.shuffle(list);
        l.info(list);
        l.info(a2.toString());
        Collections.shuffle(a2);
        l.info(a2.toString() );

    }
//Java program to reverse elements in a array list
    public static void Collection_exercise_22_11(ArrayList<String>a1){
      Collections.reverse(a1);
      l.info(a1);
    }
//Java program to extract a portion of a array list
   public static void Collection_exercise_22_12(ArrayList<String>a1) {
       a1.subList(2, 5);
       l.info(a1.subList(2, 5));
       //return a1.subList(2,6);
   }
//Java program to compare two array lists.
   public static boolean Collection_exercise_22_13(ArrayList<String>a1,ArrayList<String> a2){
        int i = a1.size();
        int j = a2.size();
        if(((a1==null) && (a2==null))||(i==j))
        {
           return true;
        }
        if(( i != j)||(a1!= null)||(a2 != null))
        {
            return false;
        }
        Collections.sort(a1);
        Collections.sort(a2);
        return a1.equals(a2);
   }

   //Java program of swap two elements in an array list.
    public static void Collection_exercise_22_14(ArrayList<String>a1){
        l.info(" before swap :" +a1);
        Collections.swap(a1,1,3);
        l.info("after swap:" +a1);
    }
  //Java program to join two array lists.
    public static void Collection_exercise_22_15(ArrayList<String>a1, ArrayList<String> a2){
        ArrayList<String> a3 = new ArrayList<String>();
        a3.addAll(a1);
        a3.addAll(a2);
        l.info("after joining to array lists: " +a3);
    }
   //Java program to clone an array list to another array list
    public static void Collection_exercise_22_16(ArrayList<String>a1){
        ArrayList<String> a2 = new ArrayList<String>();
         a1.clone();
         l.info("clone array list:" +a1.clone());
    }
    //Java program to empty an array list.
    public static void Collection_exercise_22_17(ArrayList<String>a1){
        a1.removeAll(a1);
        l.info(a1);
//        int i = a1.size()-1;
//        for(int j = 0;j < i; j++){
//            a1.remove(j);
//            if(a1 == null){
//                l.info("ArrayList is empty");
//
//            }
//        }
    }
    //Java program to test an array list is empty or not
    public static Boolean Collection_exerise_22_18(ArrayList<String>a1){
      //return a1.isEmpty();
       if (a1.size()> 0){
           return false;
       }
       else {

           return true;
       }
    }
    //Java program to trim the capacity of an array list the current list size
    public static void Collection_exercise_22_19(ArrayList<String> a2){
        l.info("before Trim :"+ a2);
        a2.trimToSize();
        l.info("after Trim :"+ a2);
    }
    //Java program to increase the size of an array list
    public static void Collection_exercise_22_20(ArrayList<String>a1){
        l.info(a1);
        l.info(a1.size() );
        a1.ensureCapacity(10);
        a1.add("15");
        a1.add("17");
        a1.add("18");
        a1.add("20");
        a1.add("21");
        l.info(a1);
        l.info(a1.size());
    }
    //Java program to replace the second element of a ArrayList with the specified element
    public static void Collection_exercise_22_21(ArrayList<String> a1, String xx){
        a1.set(1,xx);
        l.info(a1);
        l.info(a1.size());
    }
    //Java program to print all the elements of a ArrayList using the position of the elements
    public static void Collection_exercise_22_22(ArrayList<String >a1){
        for(int i = 0 ; i < a1.size();i++){
            l.info(a1.get(i));

        }
    }
    public static void main(String[] args) {
        // String[] a1 = {"Red","Green","Blue" };
        ArrayList<String> a1 = new ArrayList<String>();
        Collections_Exercise_22_1(a1);
        Collections_Exercise_22_2(a1);
        Collection_Exercise_22_3(a1);
        Collections_Exercise_22_4(a1);
        List<String> a10 = new ArrayList<String>();
        a10.add("100");
        a10.add("Red1000");
        a10.add("101");
        a10.add("Organe101");
        Collection_Exercise_22_6(a10);
        Collection_Exercise_22_7(a10);
        Collection_Exercise_22_8(a1);
        Collection_Exercise_22_9(a1);
        ArrayList<String> shufa1 = new ArrayList<String>();
        shufa1.add("101");
        shufa1.add("102");
        shufa1.add("Frist String");
        shufa1.add("222");
        Collection_Exercise_22_9(shufa1);
        Collection_exercise_22_10(shufa1);
        ArrayList<String> maxa1 = new ArrayList<String>();
        maxa1.add("1");
        maxa1.add("123");
        maxa1.add("exercise");
        maxa1.add("a1.txt");
        maxa1.add("a2.txt");
        maxa1.add("10.txt");
        maxa1.add("11.txt");
        maxa1.add("12.txt");
        Collection_exercise_22_11(maxa1);
        Collection_exercise_22_12(maxa1);
        Boolean TT = Collection_exercise_22_13(maxa1,a1);
        l.info(TT);
        Collection_exercise_22_14(a1);
        Collection_exercise_22_15(maxa1,a1);
        Collection_exercise_22_16(a1);
        Collection_exercise_22_17(a1);
       // Boolean T1 = Collection_exercise_22_18(maxa1);
        Collection_exercise_22_19(maxa1) ;
        Collection_exercise_22_20(maxa1) ;
        Collection_exercise_22_21(maxa1,"Deepa");
        Collection_exercise_22_22(maxa1);
    }




}
