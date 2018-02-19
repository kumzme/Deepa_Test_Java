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
        if (a < 1)
        {
            l.info("smallest positive number");
        }
        else if (a > 10000000)
        {
            l.info("largest positive number");
        }
        else
        {
           l.info("postive number");
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
//keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
    public static String getDayInt(int day){

    String dayName = " " ;
    switch (day)
    {
        case 1:
            dayName = "Monday";
            break;
        case 2:
            dayName = "Tuesday";
            break;
        case 3:
            dayName = "Wednesday";
            break;
        case 4:
            dayName = "Thrusday";
            break;
        case 5:
            dayName = "Friday";
            break;
        case 6:
            dayName = "Saturday";
            break;
        case 7:
            dayName = "Sunday";
            break;
        default:
            dayName = "Invalid day ran";
      }
     return dayName ;
    }
// reads in two floating-point numbers and tests whether they are the same up to three decimal places
    public static void floatingNumbers(double a, double b)
    {

    a = Math.round(a * 1000);
    a = a/1000;
    b = Math.round(b * 1000);
    b = b/1000;

    if ( a == b)
        {
            l.info(" both a and b are same up to three decimal");
        }
    else
        {
            l.info("a and b are not same up to three decimal");
        }

    }
//find the number of days in a month.
  public  static  void numberOfDaysMonth(int number){

    int number_Of_days =  0 ;
    String monthName = "" ;
    switch(number)
    {
        case 1 :
          number_Of_days = 31;
          monthName      =  "January" ;
        break;
        case 2 :
          number_Of_days =  28;
          monthName      =  "Feburary" ;
         break;
        case 3 :
            number_Of_days = 31;
            monthName      =  "March" ;
            break;
        case 4 :
            number_Of_days =  30;
            monthName      =  "April" ;
            break;
        case 5 :
            number_Of_days = 31;
            monthName      =  "May" ;
            break;
        case 6 :
            number_Of_days =  30;
            monthName      =  "June" ;
            break;
        case 7 :
            number_Of_days = 31;
            monthName      =  "July" ;
            break;
        case 8 :
            number_Of_days =  31;
            monthName      =  "August" ;
            break;
        case 9 :
            number_Of_days = 30;
            monthName      =  "September" ;
            break;
        case 10 :
            number_Of_days =  30;
            monthName      =  "October" ;
            break;
        case 11 :
            number_Of_days = 30;
            monthName      =  "November" ;
            break;
        case 12 :
            number_Of_days =  31;
            monthName      =  "December" ;
            break;

     }
     l.info(monthName + "has number of days " + number_Of_days);

  }
  //takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message

    public static void alphabetInput(String alpInput)
    {
        String input = alpInput.toLowerCase() ;
        Boolean vowel = input.equals("a") || input.equals("e")|| input.equals("i")||input.equals("o")||input.equals("u");

        if(input.length() > 0 )
        {
            l.info("input is not single character");
        }
        else if(vowel)
        {
            l.info("input is a vowel");
        }
        else
        {
            l.info("input is a constant");
        }
    }
public static void main(String args[]){

    condition_st();
    quadratic_math();
    greatest_Number(30,45,100);
    float_ifcond(1211);
    String dayName = getDayInt(7);
    l.info(dayName);
    floatingNumbers(1234,1235);
    numberOfDaysMonth(12);
    alphabetInput("mn");
}

}
