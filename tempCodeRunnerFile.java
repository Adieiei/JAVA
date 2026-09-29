import java.util.Scanner;
public class tempCodeRunnerFile{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.length()<8){
            System.out.println("Invalid");
        }else{
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                if(((ch>='0' && ch<='9') && (ch>='A' && ch<='Z') && (ch>='a' && ch<='z'))){
                    System.out.println("Valid");
                    break;
                }else{
                    System.out.println("Invalid");
                    break;
                }
            }
        }
        sc.close();
    }
}