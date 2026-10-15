import java.util.Scanner;
public class ZnRowWithMax1S{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j] = sc.nextInt();
            }
        }
        int maxCount = -1;
        int maxOnes = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int s = 0;
            for(int j=0;j<m;j++){
                s += a[i][j];
            }
            if(s>maxOnes){
                maxOnes = s;
                maxCount = i;
                if(maxOnes == 0){
                    maxCount = -1;
                }
            }
        }
        System.out.println(maxCount);
    }
}