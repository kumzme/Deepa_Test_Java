package Deepa.Driver;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Test_05 {
    private static final Logger l = LogManager.getLogger(Test_05.class.getName());

    public static void Collections_Exercise_22_1(List<String> a1){
    //create a new array list, add some colors (string)
    a1.add("Red");
    a1.add("Green");
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
        public static void main(String[] args) {
            // String[] a1 = {"Red","Green","Blue" };
            List<String> a1 = new ArrayList<String>();
            Collections_Exercise_22_1( a1);
            Collections_Exercise_22_2(a1);
        }


    }
