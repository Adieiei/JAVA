import java.util.Scanner;
public class Pa{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int[] a = new int [n];
    for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
    }
    
    boolean p = true;
    for(int i=0;i<n/2;i++){
        
    if(a[i] != a[n-i-1]){
        p = false;
    }
}
    if(p){
        System.out.println("Palindrom");

    }else{
    System.out.println("NOT a palindrom");
    }
}
}


