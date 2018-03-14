package Deepa.Driver;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Test_09 implements MyInterface{

    private static final Logger l = LogManager.getLogger(Test_09.class.getName());

    public void my_method1() {

     l.info("My frist interface implementing jave class");
    }

    public void my_method2(){
        l.info("tes 2");
    }

    public static void main(String[] args) {

        MyInterface MyInt = new Test_09();
        MyInt.my_method1();
        MyInt.my_method2();
        }
    }


