import java.util.*;

public class CheckUpLow{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int lowercase = 0;
        int uppercase = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
        if(ch>=65 && ch<=90){
            uppercase = uppercase + 1;
        }else if(ch>=97 && ch<=122){
            lowercase = lowercase +1;
        }
    }
        System.out.println(uppercase);
        System.out.println(lowercase);
    }
}