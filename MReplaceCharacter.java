import java.util.Scanner;
public class MReplaceCharacter{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        for(int i=0;i<s.length();i++){
            s.charAt(i).replace(c1,c2);
            }
        
        System.out.println(s);
    }
}
