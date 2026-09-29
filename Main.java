
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int [n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int s = 0;
        for(int i=0;i<a.length;i++){
            s = s + a[i];
        }
        System.out.println(s);
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
    }
}