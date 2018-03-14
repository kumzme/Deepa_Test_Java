package Deepa.Driver;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Arithmetic1 {
    private static final Logger l = LogManager.getLogger(Test_04.class.getName());

    public static double summation(int A, int B){
        double sum = A +B ;
        l.info(sum);
        return sum;

    }
}
