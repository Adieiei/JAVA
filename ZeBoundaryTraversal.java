import java.util.Scanner;
public class ZeBoundaryTraversal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] a = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               a[i][j] = sc.nextInt();
            }
        }
        if(n==1 && m==1){
            System.out.print(a[0][0]+" ");  
            return;
        }
            for(int j=0;j<m;j++){
                System.out.print(a[0][j]+" ");
            }
            for(int i=1;i<n;i++){
                System.out.print(a[i][m-1]+" ");
            }
            if(n>1){
            for(int j=m-2;j>=0;j--){
                System.out.print(a[n-1][j]+" ");
            }
        }
            if(m>1){
            for(int i=n-2;i>0;i--){
                System.out.print(a[i][0]+" ");
            }
        }
        }
    }
