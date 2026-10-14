import java.util.Scanner;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int i = 0;
        int j = str.length()-1;

        while(i<j){
            str = str.toLowerCase();
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println("False");
                return;
            }
            i++;
            j--;
        }
        System.out.println("True");
    }
    
}
