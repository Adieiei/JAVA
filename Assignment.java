import java.util.Scanner;

public class Assignment {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
/*
Sep 23,2026
QUESTION NUMBER 4
import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {
        int left = B;
        int right = C;
        
        // Swap elements from the outside moving inward
        while (left < right) {
            // Step 1: Store value at left index temporarily
            int temp = A.get(left);
            
            // Step 2: Move right value to left position
            A.set(left, A.get(right));
            
            // Step 3: Move stored temp value to right position
            A.set(right, temp);
            
            // Step 4: Move pointers closer to each other
            left++;
            right--;
        }
        
        return A;
    }
}
QUESTION NUMBER 3
public class Solution {
public int solve(ArrayList<Integer> A, int B) {
    int freq = 0;
    for(int i=0;i<=A.size()-1;i++){
        if(A.get(i)==B){
            freq += 1;
        }
    }
    return freq;
}
}
*/
/*
QUESTION NUMBER 2
        int n = sc.nextInt();
        int A[] = new int[n];
        
        // Step 1: Read all inputs into the array
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        
        // Step 2: Reverse the array after reading all elements
        int f = 0;
        int l = n - 1;
        while(f < l) {
            int temp = A[f];
            A[f] = A[l];
            A[l] = temp;
            f++;
            l--;
        }
        
        // Step 3: Print all elements of the reversed array
        for(int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }
}

same but down one is better.



        // Read the size of the array
        int N = sc.nextInt();
        int[] A = new int[N];
        
        // Read N elements into the array
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        
        // Print elements in reverse order starting from the last index
        for (int i = N - 1; i >= 0; i--) {
            System.out.print(A[i] + " ");
        }
    
    }
}
    */
/*
import java.util.*;
public class isAlphaNumeric{
public static void main(String args[]);{
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextLine())
        String A = sc.nextLine();
        int isAlphanumeric = 1;
        for(int i=0;i<A.length();i++){
        char ch = A.charAt(i);

            if(!((ch >='0' && ch <= '9') || (ch >= 'A' && ch <= 'Z') || (ch >='a' && ch <= 'z'))){
            isAlphanumeric = 0;
            break;
            }
            System.out.println(isAlphanumeric);
    }
            sc.close();
    }}
*/
    }
}