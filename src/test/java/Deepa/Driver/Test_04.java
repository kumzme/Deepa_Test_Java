package Deepa.Driver;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Test_04 {

    private static final Logger l = LogManager.getLogger(Test_04.class.getName());

//get a number from the user and print whether it is positive or negative

public static void condition_st(int input){
    //Scanner my_Scan = new Scanner(System.in);
    //int input = my_Scan.nextInt();
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

  public static void quadratic_math(double a,double b,double c)
  {
    //Scanner my_Scan1 = new Scanner(System.in);
    //double a = my_Scan1.nextInt();
    //double b = my_Scan1.nextInt();
    //double c = my_Scan1.nextInt();

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
 //takes a year from user and print whether that year is a leap year or not
   public static void  leapYear(int Year){

    Boolean X = (Year  % 4) == 0;
    Boolean Y = (Year % 100 ) != 0;
    Boolean Z = ((Year % 100 == 0) && (Year % 400 == 0));
     if(X && (Y ||Z))
     {
       l.info("Year is leap year");
     }
     else
     {
         l.info("Year is not leap year");
     }
   }
   //program in Java to display the first 10 natural numbers
    public static void  displayNumber()
    {
        for( int i = 1; i <=10; i++)
        {
            l.info(i);
        }
        l.info("/n");
    }
   //display n terms of natural numbers and their sum
   public static void naturalNumbers(int number)
   {
       int sum = 0;
      for ( int i = 1; i< number ; i++)
      {
          l.info(i);
          sum = sum + i;
          //sum+=i;
      }
       l.info(sum);
   }
   // input 5 numbers from keyboard and find their sum and average
    public static void  numbersSumAndAvg(int a,int b,int c,int d,int e){

    int sum = a +b+c+d+e;
    int Avg = sum/5 ;
    l.info("sum of 5 input is" + sum + "Avg of 5 inputs is "+ Avg);
    }
   // display the cube of the number upto given an integer
     public  static void cubeOfNumber(int a) {
     double cube = 0;
    for ( int i = 1 ; i< a;i++)

      l.info(" Number is " + i);
      //cube = i * i * i ;
      //l.info("cube for each input" +i*i*i);
     }

   //  display the multiplication table of a given integer
    public static void multInt(int a){
    for (int i = 0 ; i < a ; i++){

        l.info("number is "+ i + "multiplication table" + i* a);
     }
    }
   //display the n terms of odd natural number and their sum
   public static void oddNatural(int a){
    int sum = 0;
    for (int i = 1; i < a ;i++)
    {
        int odd = i*2-1;
        l.info(odd);
        sum = sum +odd ;
        l.info(sum);
    }
   }
   // display the pattern like right angle triangle with a number.

     public static void rightAngleNum(int a) {

         for (int i = 1; i <= a ; i++){
            for(int j = 1; j <=i; j++){
             l.info( j);
             l.info(" ");
           }
         }
     }
     // make such a pattern like right angle triangle with a number which will repeat a number in a row
    public static void rightAngleTri(int a){

     int i,j;
     for (i =1 ; i <=a ;i++){
         for(j= i+1; j <=i ;j++){
             l.info(j);
             l.info("");
             l.info(j);
         }
     }
    }
//Java to make such a pattern like right angle triangle with number increased by 1
    public static void rightAngTri1(int a){

    int i ,j,k=1;
    for(i = 1; i<=a;i++){
        for(j = 2; j<=i;j++){
            l.info(k++);
            l.info(" ");
            //l.info(j+1);
        }
     }
    }
  // make such a pattern like a pyramid with a number which will repeat the number in the same row
  public static void pyramidNumber(int noofrows){
    int i , j;
    int rowCount = 1;
    for (i = noofrows; i > 0; i--){

        for (j= 1;j<=i;j++){
            l.info(" ");
        }
        for (j = 1; j <= rowCount ;j++){
            l.info(rowCount + " ");
        }
        rowCount++;
    }

  }
//Java to print the Floyd's Triangle
    public static void FloydTri(int a) {

    for (int i = 0 ; i <= a; i++)
    {
        String row_string = " ";
        String Starting_Column = "";
        String Current_Val = " ";
        int Previous_Value = 0;
        if (i == 0) {
            Starting_Column = "0";
            }
            else
            {
            Starting_Column = "1";

            }
        for (int j = 0; j <= i; j++)
        {
            if (j == 0)
            {
                 if (Starting_Column.contains("0"))
                {
                Previous_Value = 0;
                }
                else
                {
                  Previous_Value = 1;
                }
                  row_string = Starting_Column;

             }
              else
              if (Previous_Value == 0)
             {

                Previous_Value = 1;
                Current_Val = "1";

              }
            else
                {
                Previous_Value = 0;
                Current_Val = "0";
               }
        row_string = row_string + Current_Val;
        }

        l.info(row_string);
    }


    }

 //reads an integer and check whether it is negative, zero, or positive
    public static void Cond_Exercise_27(int a){

    if(a > 0)
    {
       l.info("a is positive" +a);
    }
    else if(a == 0)
    {
        l.info("a is zero" +a);
    }
    else
    {
        l.info("a is negative" + a);
    }

    }
//reads a floating-point number. If the number is zero it prints "zero", otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000
    public static void Cond_Exercise_28(double a){
    if (a>0){
       l.info("a is postive" + a);
        if ((Math.abs(a)) > 100000)
        {
            l.info("abs value is more thans 100000" + Math.abs(a));
        }
        if ((Math.abs(a)) < 0)
        {
            l.info("abs is less than 1" + Math.abs(a) );
        }
    }
    else if (a < 0){
        l.info(" a is Negative" + a);
    }
    else
        {
            l.info("a is zero " + a);
        }

    }
//reads an positive integer and count the number of digits the number
public static void Cond_Exercise_29(int a){
    int count = 0;
    for(count = 0 ; a>0;a = a/10){

        count = count + 1;
        }
    l.info(count);

  }
 //accepts three numbers and prints "All numbers are equal" if all three numbers are equal, "All numbers are different" if all three numbers are different and "Neither all are equal or different" otherwise

   public static void Cond_Exercise_30(int a,int b, int c) {

       if ((a == b) && (b == c)) {
           l.info("all are equal");
       } else if ((a == b) || (b == c) || (c == a)) {
           l.info("all are neither equal nor different");
       } else {
           l.info("all are different");
       }
   }
//accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise. Go to the editor

  public static void Cond_Exercise_31(int a, int b, int c){
    if ((a < b) && (b < c))
    {
     l.info("the numbers aew in increasing order");
    }
    else if ( (a> b) && (b < c) )
    {
        l.info( " numbers are neither decreasing not increasing order");
     }
     else{
        l.info(" the numbers are decreasing order");
    }
  }
 //accepts two floating­point numbers and checks whether they are the same up to two decimal places
 public static void Cond_Exercise_32(double a,double b) {
     if (Math.abs(a - b) <= 0.01) {
         l.info("numbers are equal upto two deceimal");
     } else
         l.info("numbers are diff");
 }
public static void main(String args[]){


    //condition_st( 1);
    //quadratic_math(2,3,5);
    //greatest_Number(30,45,100);
    //float_ifcond(1211);
    //String dayName = getDayInt(7);
    //l.info(dayName);
    //floatingNumbers(1234,1235);
    //numberOfDaysMonth(12);
    //alphabetInput("mn");
    //leapYear(2014);
    //displayNumber();
    //naturalNumbers(10);
    //numbersSumAndAvg(15,10,5,-2,-3);
    //cubeOfNumber(4);
    //multInt(5);
    //oddNatural(3);
   // rightAngleNum(6);
   // rightAngleTri(5);
   // rightAngTri1(5);
   // pyramidNumber(5);
   // FloydTri(5);
   //Cond_Exercise_27(0);
   // Cond_Exercise_28(234);
    //Cond_Exercise_29(12345);
   //Cond_Exercise_30(1234,2345,3456);
   //Cond_Exercise_31(1234,15234,5234);
   Cond_Exercise_32(1234,2345) ;
}

}

