package Deepa.Driver;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Test_1_Interface implements MyInterface2  {
    private static final Logger l = LogManager.getLogger(Test_04.class.getName());
    public void my_method3() {

        l.info("Testing interface and inheritance");
    }

    public void my_method1() {
       l.info("call inteface 1 methods");
    }

    public void my_method2() {
        l.info("call another method in interface 1");
    }

    public static void main(String[] args){
        MyInterface2 MyObj = new Test_1_Interface();
        MyObj.my_method2();
        //MyObj.my_method2();
       // MyObj.my_method3();

    }
}
