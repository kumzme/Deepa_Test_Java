package Deepa.Driver;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Test_01 {
//Number of spaces in a given string
    private static final Logger l = LogManager.getLogger(Test_01.class);


    public static void main(String args[]) {

        int m = spacecount("Hello Java String functions");
        System.out.println("number of space in string " + m);
        charAtIndex(1);
        codepointAt(2);
        codepointbefore(3);
        codepointSpecInd(1, 2);
        compareTwoStr("This is good exercise", "this IS Good Exercise 2");
        concatStr("hello String 1", "String 2");
        containsStr("Hello String1", "String");
        containsCompareStr("Hello string1 2", "String3");
        compareStrBuffer("String12345", "String");
        compareStrBuffer("String 123346", "123456");
        endStrwith("Java Exercise", "Ex");
        endStrwith("Java Exercise", "se");
        endStrwith("Java Exercise", "12");
        endStrwith("Java Exercise", "Ci");
        sameStr("Exercise 1", "Noncise1");
        compareIgnore("exercise java string", " Exercise JAVA STRING");

        byteArray("String Exercise");
        charArray("This is new String");
        indexAlp("The Lazy dog");
        canconical("Java Exercise");
        lastindexAlp("The Lazy dog ");
        length("The Exercise on String Length");
        regionmatchStr("The String is ", "The String");
        replaceStr("The dog all exadaaaaaadd");
        replaceStrExp("The quick brown fox", "fox", "dog");
        contentString("Red is favorite color", "Organge is next favorite color", "Red");
        subStringa("Next lesson");
        charCon("Good Exercise on Java String Functions");
        lowercasea("THE GOOD Exercise on String FUNCTIONS");
        uppercasea("The gOOD exercise ON String FUNCTIONS");
        trimStr("The Case String Trimming");
        countCharStr("Java Exercise to count character");


    }


    //Number of character in a given String
    public static void countCharStr(String a1)
    {
        int charcount = 0;

        int size = a1.trim().length();
        l.info(size);

    }


    public static int spacecount(String S) {
        int a = 0;
        char ch[] = new char[S.length()];
        for (int i = 0; i < S.length(); i++) {
            ch[i] = S.charAt(i);
            if (ch[i] == ' ') {
                a++;
            }

        }
        return a;
    }

    //Get character at the given index within the String.
    public static void charAtIndex(int i) {
        String S1 = " Hello java";
        int a_ch = S1.charAt(i);
        System.out.println("character at  " + a_ch);
    }

    //get the character (Unicode code point) at the given index within the String
    public static void codepointAt(int i) {
        String S2 = "Hello wo rld String";
        int a_ch_1 = S2.codePointAt(i);
        System.out.println("codepoint at  " + a_ch_1);
    }

    // get the character (Unicode code point) before the specified index within the String
    public static void codepointbefore(int i) {
        String S2 = "Hello wo rld String";
        int a_ch_1 = S2.codePointBefore(i);
        System.out.println("codepoint before  " + a_ch_1);
    }

    //count a number of Unicode code points in the specified text range of a String.
    public static void codepointSpecInd(int i, int j) {
        String S2 = "Hello wo rld String";
        int a_ch_1 = S2.codePointCount(i, j);
        System.out.println("codepoint   " + a_ch_1);
    }

    //compare two strings lexicographically, ignoring case differences.
    public static void compareTwoStr(String S1, String S2) {
        int result = S1.compareToIgnoreCase(S2);
        if (result < 0) {
            System.out.println("/" + S1 + "/" + "is less than " + "/" + "S2" + "/");
        } else if (result == 0) {
            System.out.println("/" + S1 + "/" + "is equal to" + "/" + S2 + "/");
        } else if (result > 0) {
            System.out.println("/" + S1 + "/" + " is greater than " + "/" + S2 + "/");
        }
    }

    //concatenate a given string to the end of another string
    public static void concatStr(String a1, String a2) {
        String result = a1 + a2;
        String result1 = a1.concat(a2);
        System.out.println("ressult   " + result);
        System.out.println("result1" + result1);
    }
//test if a given string contains the specified sequence of char values.

    public static void containsStr(String a1, String a2) {
        System.out.println("ressult   " + a1.contains(a2));
    }

    //compare a given string to the specified character sequence
    public static void containsCompareStr(String a1, String a2) {
        System.out.println("ressult----   " + a1.contentEquals(a2));
    }

    //compare a given string to the specified string buffer.
    public static void compareStrBuffer(String a1, String a2) {
        StringBuffer a2buff = new StringBuffer(a2);
        System.out.println("ressult-+++---   " + a1.contentEquals(a2));
        System.out.println("result+++++++    " + a2.contentEquals(a2buff));
    }

    //create a new String object with the contents of a character array
//    public static void array_Str(String[] a1)
//    {
//        String str = String.copyValueOf(a1,1,3);
//
//    }
//check whether a given string ends with the contents of another string

    public static void endStrwith(String a1, String a2) {
        System.out.println("endwith-+++---   " + a1.endsWith(a2));
        System.out.println("endwith+++++++    " + a1.endsWith(a2));
    }
    //check whether two String objects contain the same data

    public static void sameStr(String a1, String a2) {
        System.out.println("boolean contains-+++---   " + a1.equals(a2));
    }


    //    compare a given string to another string, ignoring case considerations
    public static void compareIgnore(String a1, String a2) {
        System.out.println("compare contains-+++---   " + a1.compareToIgnoreCase(a2));
        System.out.println("equal contain contains-+++---   " + a1.equalsIgnoreCase(a2));
    }
// print current date and time in the specified format
//public static void  dateAndTime()
//{
//    Calendar c = Calendar.getInstance();
//    System.out.println("Current date-+++---   "       +c);
//    System.out.format("Current date -%tB %te, %tY%n+++---   " +c,c,c);
//
//}
//get the contents of a given string as a byte array


    public static void byteArray(String a) {
        byte[] byte_arr = a.getBytes();
        String new_str = new String(byte_arr);
        System.out.println("new String-+++---   " + new_str);
    }
//get the contents of a given string as a character array


    public static void charArray(String a) {
        char[] char_arr = new char[]{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',};
        a.getChars(2, 5, char_arr, 1);
        System.out.println("new String-+++---   " + char_arr);
    }
// get the index of all the characters of the alphabet


    public static void indexAlp(String a1) {
        int a = a1.indexOf("a", 0);
        int b = a1.indexOf("b", 0);
        int c = a1.indexOf("c", 0);
        System.out.println("index of char-+++---   " + a);
        System.out.println("index of char-+++---   " + b);
        System.out.println("index of char-+++---   " + c);
    }
//get the canonical representation of the string object


    public static void canconical(String a1) {
        String a2 = new StringBuffer("Java").append("Exercise").toString();
        System.out.println("check-+++---   " + a1 == a2);
    }
//get the last index of a string within a string.


    public static void lastindexAlp(String a1) {
        int a = a1.lastIndexOf("a", a1.length() - 1);
        int b = a1.indexOf("b", a1.length() - 1);
        int c = a1.indexOf("c", a1.length() - 1);
        System.out.println("index of char-+++---   " + a);
        System.out.println("index of char-+++---   " + b);
        System.out.println("index of char-+++---   " + c);
    }
//get the length of a given string

    public static void length(String a1) {
        System.out.println("Length-+++---   " + a1.length());

    }
//find whether a region in the current string matches a region in another string

    public static void regionmatchStr(String a1, String a2) {

        boolean match = a1.regionMatches(0, a2, 2, 4);
        System.out.println("regionMatch-+++---   " + match);
    }
//replace all the 'd' characters with 'f' characters

    public static void replaceStr(String a) {

        System.out.println("replace-+++---   " + a.replace("a", "d"));
        System.out.println("replaceStr-+++---   " + a.replaceAll("a", "d"));

    }
//replace each substring of a given string that matches the given regular expression with the given replacement.

    public static void replaceStrExp(String a1, String a2, String a3) {

        System.out.println("replaceStrall-+++---   " + a1.replaceAll(a2, a3));
    }
//check whether a given string starts with the contents of another string

    public static void contentString(String a1, String a2, String a3) {
        boolean start1 = a1.startsWith(a3);
        boolean start2 = a2.startsWith(a3);
        System.out.println("Startwith1-+++---   " + start1);
        System.out.println("Startwith2-+++---   " + start2);
    }
//get a substring of a given string between two specified positions

    public static void subStringa(String a1) {
        System.out.println("Sub new String-+++---   " + a1.substring(1, 5));
    }
// create a character array containing the contents of a string

    public static void charCon(String a1) {
        char[] arr_a1 = a1.toCharArray();
        System.out.println("new char String-+++---   " + arr_a1);
    }
//convert all the characters in a string to lowercase

    public static void lowercasea(String a1) {
        System.out.println("Lowercase String-+++---   " + a1.toLowerCase());
    }
// convert all the characters in a string to uppercase

    public static void uppercasea(String a1) {
        System.out.println("UpperCase String-+++---   " + a1.toUpperCase());
    }
//trim any leading or trailing whitespace from a given string

    public static void trimStr(String a1) {
        System.out.println("Trim String-+++---   " + a1.trim());
    }


}
