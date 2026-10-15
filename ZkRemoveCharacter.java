import java.util.Scanner;
public class ZkRemoveCharacter{ 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.next().charAt(0);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=ch){
                System.out.print(s.charAt(i));
            }
        }

    }
}