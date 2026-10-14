import java.util.Scanner;
public class ZuLuckyDivision{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] luckyNumbers = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};
    for (int i = 0; i < luckyNumbers.length;i++){
        if(n%luckyNumbers[i]==0){
            System.out.println("YES");
            return;
        }
    }
            System.out.println("NO");
            
            
        }
        }

    


