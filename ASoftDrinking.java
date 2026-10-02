
import java.util.Scanner;
public class ASoftDrinking{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int k = sc.nextInt();
       int l = sc.nextInt();
       int c = sc.nextInt();
       int d = sc.nextInt();
       int p = sc.nextInt();
       int nl = sc.nextInt();
       int np = sc.nextInt();
        int toasts = ((l*k)/nl)/n;
        int limes = (d*c)/n;
        int salt = (p/np)/n;
        int ans = (Math.min(Math.min(toasts,limes),salt));
        System.out.println(ans);
    }
}