package Deepa.Driver;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class EncapTest {
    private static final Logger l = LogManager.getLogger(Test_09.class.getName());

    public static void main(String[] args){
        Encapsulation Enobj = new Encapsulation();
        Enobj.setESsn(121121121);
        Enobj.getESsn();
        Enobj.setEName("Orange");
        Enobj.getEName();
        Enobj.setEAge(11);
        l.info( "SSn : " + "\n" + Enobj.getESsn() +"\n" + "Name :"  + Enobj.getEName()+"\n"+ "Age : " + Enobj.getEAge());
        Enobj.setESsn(121121122);
        Enobj.getESsn();
        Enobj.setEName("Apple");
        Enobj.getEName();
        Enobj.setEAge(12);
       // Enobj.getEAge(11);
        l.info( "SSn "  + "\n" + Enobj.getESsn() +"\n" + "Name :"  + Enobj.getEName()+"\n"+ "Age : " + Enobj.getEAge());

    }
}
