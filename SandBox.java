import java.util.*;
public class SandBox {
    public static void main (String[] args){
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int x=1;x<=n*2-1;x++) { if(x==1||x==n*2-1) for(int y=1;y<=n;y++) System.out.print("* "); else{ for(int y=1;y<=n*2-1;y++) if(x==y||y==n*2-x) System.out.print("*"); else System.out.print(" "); } System.out.println(); } }
    }



