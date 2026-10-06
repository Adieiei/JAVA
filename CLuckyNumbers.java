import java.util.Scanner;

public class CLuckyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long total = (long) Math.pow(2, n + 1) - 2;
        System.out.println(total);
    }
}