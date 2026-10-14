import java.util.Scanner;
public class StringReverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        StringBuilder reverse = new StringBuilder();

        for(int i=original.length()-1;i>=0;i--){
            reverse.append(original.charAt(i));
        }
        System.out.println(reverse);
    }
    
}
