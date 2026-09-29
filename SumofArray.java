import java.util.*;
public class SumofArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double arr[]=new double [10];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextDouble();
        }
        double s=0;
        for(int i=0;i<arr.length;i++){
            s = s + arr[i];
        }
        double avg = s/(double) arr.length;

        System.out.println(s);
        System.out.println(avg);
        }
}