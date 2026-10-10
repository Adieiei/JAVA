import java.util.Scanner;
public class ADivision{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int r = sc.nextInt();
            if(r>=1900){
                System.out.println("Division 1");
            }else if(r>=1600 && r<=1899){
                System.out.println("Division 2");
            }else if(r>=1400 && r<=1599){
                System.out.println("Division 3");
            }else {
                System.out.println("Division 4");
            }
        }
        }
}