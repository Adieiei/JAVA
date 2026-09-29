
import java.util.*;

public class hef {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long n = sc.nextInt();
        if(n<10){
            System.out.println(n);
        }else{
            while(n>=10){
                long temp = n;      // storing n to a demo variable, and then working with the demo variable.
                int c = 0;
                while(temp>0){
                    c ++;               // Count the number od digits.
                temp = temp/10;        // removing the last digit.
                }
                temp = n;              // again storing the value on n to a demo variable, and doing the work.
                long sum = 0;
                int weigth = c;        // Storinmg the value of count in a demo variable name weigth.
                while(temp > 0){
                    long digit =temp %10;    // Taking out the last digit of n=demo variable.
                    sum = sum + digit*weigth; // Then adding the last digit to sum by multipling with total count.
                    weigth--;     // then decreasing the count.
                    temp = temp/10; //removing the last digit of n= demo variable.
                }
                n=sum; // doing the same processes until we get a digit less then 10.
            }
        }
        System.out.println(n);
    }
}