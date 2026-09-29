import java.util.Scanner;
public class Tribonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        int n = sc.nextInt();

        long[] sequence = new long[n];
        sequence[0]=a;
        sequence[1]=b;
        sequence[2]=c;

        for(int i=3;i<n;i++){
            sequence[i]=sequence[i-1]+sequence[i-2]+sequence[i-3];      
        }
        for(int i=0;i<n;i++){
            System.out.print(sequence[i]);
            if(i<n-1){
                System.out.print(" ");
            }
        }
    }
}
