package Deepa.Driver;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Test_04 {

    private static final Logger l = LogManager.getLogger(Test_04.class.getName());

//get a number from the user and print whether it is positive or negative

public static void condition_st(){
    Scanner my_Scan = new Scanner(System.in);
    int input = my_Scan.nextInt();
    if(input > 0)
    {
        l.info("input data is positive");
    }
    else if (input < 0)
    {
        l.info("input data is negative");
    }
    else
    {
        l.info("input data is zero") ;
    }
}
//Java program to solve quadratic equations (use if, else if and else)

  public static void quadratic_math()
  {
    Scanner my_Scan1 = new Scanner(System.in);
    double a = my_Scan1.nextInt();
    double b = my_Scan1.nextInt();
    double c = my_Scan1.nextInt();

    //res = −b ± √(b2 − 4ac) 2a.
    double res =  b*b - 4.0 * a* c;
    if (res > 0.0)
    {
        double r1 = (-b + Math.pow(res,05))/2.0 * a ;
        double r2 = ( -b - Math.pow(res,05))/2.0* a ;
        l.info("Roots are " + r1 + "and" + r2);
    }
     else if (res == 0.0)
    {
        double r1 = -b /(2.0 * a);
        l.info("root is " + r1);
     }
     else
      {
        l.info("no real roots");
       }
    }
//three numbers from the user and print the greatest number
    public static void greatest_Number(int a,int b , int c) {

   // Scanner my_Scan = new Scanner(System.in);
   // int a = my_Scan.nextInt();
   // int b = my_Scan.nextInt();
   // int c = my_Scan.nextInt();

     if((a > b) && (a > c))
     {
       l.info("greatest number is " + a);
     }
     if ((c>a) && (c>b ))
     {
        l.info("greatest number is " + c);
     }
     if ((b>a) && (b>c))
     {
         l.info("greatest number is " +b);
     }
    }
 //reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000
  public static void float_ifcond(double a)
  {
      if (a > 0)
      {
        if(a < 1)
        {
            l.info("smallest positive number");
        }
        else if (a > 10000000)
        {
            l.info("largest positive number");
        }
        else
         {
           l.info("postive number")
          }
      }

      else if (a < 0)
      {
          if (Math.abs(a) < 1)
          {
              l.info("smaillest negative number");
          }
          else if (Math.abs(a) > 100000000)
          {
              l.info("Largest negative number");
          }
          else
          {
              l.info("negative number");
          }
      }
      else
      {
          l.info("number is zero");
      }
  }

public static void main(String args[]){

    condition_st();
    quadratic_math();
    greatest_Number(30,45,100);
    float_ifcond(1211);

}

}
