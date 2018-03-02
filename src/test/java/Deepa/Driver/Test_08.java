package Deepa.Driver;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.TreeSet;

public class Test_08 {
    private static final Logger l = LogManager.getLogger(Test_05.class.getName());

    public static void Collection_Treeset(TreeSet<Integer > a1){
        l.info(a1);
        l.info(a1.isEmpty() );
        l.info(a1.first());
        l.info(a1.tailSet(2) );
        l.info(a1.headSet(1));
    }
    public static void main(String[] args){
        TreeSet<Integer> a1 = new TreeSet<Integer>();
        a1.add(1);
        a1.add(2);
        a1.add(22);
        a1.add(21);
        a1.add(12);
        Collection_Treeset(a1);
    }
}
