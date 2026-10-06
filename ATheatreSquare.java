import java.util.*;
public class ATheatreSquare{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();
        long stoneN = (n + a - 1) / a;
        long stoneM = (m + a - 1) / a;
        System.out.println(stoneN*stoneM);
    }
}