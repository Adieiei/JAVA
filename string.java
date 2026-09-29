import java.util.*;
public class string {
    public static void main(String[] args) {
        String s;
        s = "Hello...!!! How are you??";
        /*
        Uppercase letters :[ A...Z]
        Lowercase letters :[ a...z]
        Numeric Characters :[0...9]
        Special Characters: [@ , # , % , $ , & , *]
        128 characters
        a = 97, z = 122
        A = 65, Z = 90
        0 = 48
        */
        char ch ='a';
        System.out.println(ch);
        System.out.println(s);
        // every character has an uinque ASCII value
        char ch2 = 123;
        System.out.println(ch2);
        int a = 'A';
        a+= 2;
        System.out.println(a);
        char ch3 ='A';
        ch3 = (char)(ch3 + 2);
        System.out.println(ch3);
        char ch4;
        ch4 = 'B';
        if(ch4<=90){
            System.out.println("Greater ch4");
        }else{
            System.out.println("Its lesser");
        }
        String str = "Scaler";
        // S:0 , c:1 , a:2 ...
        System.out.println(str.charAt(5));
        int n = str.length();
        System.out.println(n);
        // Substring "abc" : smaller continious part of string
        // a b c ab bc abc
        //ac ?? : No
        //substring(int start) : start to lst character
        //substring(int start, int end) : 5 : 9 => "Aditya Shaw"
        //a S : [start,end)
        String s2 = "   Hello World   ";
        String trimmedString = str.trim();
        String text = "Hello, World!";
        System.out.println(text.substring(0, 5));
        System.out.println(trimmedString);
        
    }
}
/*
public class Example {

    // 'a' and 'b' are PARAMETERS (placeholders)
    public static int add(int a, int b) { 
        return a + b;
    }

    public static void main(String[] args) {
        int x = 5;
        
        // 5 and 10 are ARGUMENTS (the actual values sent to 'add')
        int result1 = add(5, 10); 

        // 'x' and 20 are ARGUMENTS
        int result2 = add(x, 20); 
    }
}
*/
