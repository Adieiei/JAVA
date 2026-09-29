import java.util.ArrayList;
public class VowelsConsonants {
    public ArrayList<Integer> solve(String A) {
        int v = 0;
        int c = 0;
        for(int i=0;i<A.length();i++){
            char ch = A.charAt(i);
            if(ch=='a' || ch == 'e' || ch == 'i' || ch =='o' || ch=='u'){
                v +=1;
            }else{
                c += 1;
            }
        }
    
    
    ArrayList<Integer> result = new ArrayList<>();
    result.add(v);
    result.add(c);
    return result;
}
}
