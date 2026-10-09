import java.util.*;
public class AGames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[n];
        int[] k = new int[n];
            for(int i=0;i<n;i++){
                 m[i] = sc.nextInt();
                 k[i] = sc.nextInt();
            }
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                 
                
                if(i!=j){
                    if(m[i]==k[j]){
                        count++;
                    }
         }
        
        }
    }
        System.out.println(count);
    
    
}
}