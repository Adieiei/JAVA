import java.util.Scanner;
public class ADieRoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        int W = sc.nextInt();
        int max = Math.max(Y,W);
        int chance = (6-max)+1;

        String[] fraction = {"","1/6","1/3","1/2","2/3","5/6","1/1"};
        System.out.println(fraction[chance]);

    }
}