package Deepa.Driver;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

//import Deepa.Driver.Arithmetic1.java;
public class Adder extends Arithmetic1{
    private static final Logger l = LogManager.getLogger(Test_04.class.getName());

    public static void main(String[] args){
        Arithmetic1 newAdd = new Arithmetic1() ;
        newAdd.summation(12,13);
    }
}
