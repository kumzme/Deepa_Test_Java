package Deepa.Driver;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Test_05 {
    private static final Logger l = LogManager.getLogger(Test_05.class.getName());

    public static void Collections_Exercise_22_1(List<String> a1){
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

        public static void Collections_Exercise_22_4(List<String> a1){
        Collection_Exercise_22_3(a1);
        a1.get(1);
        a1.get(2).length();
        l.info(a1.get(3));
        }
        // update specific array element by given element
    public static void Collections_Exercise_22_5(List<String> a1){
        Collection_Exercise_22_3(a1);
        a1.set(2,"My java Arry");
        a1.set(1 ,"learning");
        l.info(a1.get(19));
        l.info(a1);

    }
    //remove the third element from a array list
    public static void Collection_Exercise_22_6(List<String> a10){
        a10.remove(2);
        l.info(a10);
    }
    //search an element in a array list.
    public static void Collection_Exercise_22_7(List<String> a11){
        Collection_Exercise_22_6(a11);
        for(String srhV : a11){
            if(srhV.startsWith("1") ){
                l.info("String found");
            }
        }

    }
        public static void main(String[] args) {
            // String[] a1 = {"Red","Green","Blue" };
            List<String> a1 = new ArrayList<String>();
            Collections_Exercise_22_1( a1);
            Collections_Exercise_22_2(a1);
            Collection_Exercise_22_3(a1);
            Collections_Exercise_22_4(a1);
            List<String> a10 = new ArrayList<String>();
            a10.add("100");
            a10.add("Red1000");
            a10.add("101");
            a10.add("Organe101");
            Collection_Exercise_22_6(a10);
            Collection_Exercise_22_7(a10 );
        }


    }
