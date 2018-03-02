package Deepa.Driver;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.HashSet;
import java.util.Iterator;

public class Test_07 {
    private static final Logger l = LogManager.getLogger(Test_05.class.getName());
    //Hashset : no duplicate
    public static void Collection_HashSet(HashSet<String>a1){
     l.info(a1);
     l.info(a1.contains("Music") );
     l.info(a1.contains("Musicc") );
     l.info(a1.isEmpty());
     l.info(a1.remove("Vocal"));
        Iterator itr = a1.iterator();
        while (itr.hasNext()){
            l.info(itr.next());
        }

    }
   public static void main(String[] args){
        HashSet<String > a1 = new HashSet<String>();
        a1.add("Music");
        a1.add("Electronic");
        a1.add("Vocal");
        a1.add("Harmonium");
        a1.add("Murdagam");
        a1.add("Kortal");
        Collection_HashSet(a1);
   }
}
