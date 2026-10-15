import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class JAntiDiagonalSum{
    public static void main(String args[]) throws IOException{
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(reader.readLine());
        int[][] a = new int [n][n];
        for(int i=0;i<n;i++){
            String str = reader.readLine();
            StringTokenizer st = new StringTokenizer(str);
            for(int j=0;j<n;j++){
                a[i][j] = Integer.parseInt(st.nextToken());
            }      
        }
        int  s = 0;
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j == n-1){
                    s += a[i][j];
                }
            }
         }
         System.out.print(s);

    }
}