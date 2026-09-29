import java.util.Scanner;
/*
Hashset is the actual Java tool that implements that rulebook
using a hash table.
1: HashSet<Character>(Class): The concrete engine working behind the
scenes. It uses mathematical hashing to store elements so checking for dublicate
happens instatly(O(1)time complexity).
*/
import java.util.HashSet;
/*
Set is an interface (a standard rulebook)that defines a collection
that never ALLOWS DUBLICATES.
1: Set<Character>(Interface): Acts as the abstract concept. It promises:"Whatever
object you create under this, it will only store unique characters."
*/
import java.util.Set;
public class  CF443A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        Set<Character> set = new HashSet<>();
        
        // Scan each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            // Collect only lowercase letters
            if (ch >= 'a' && ch <= 'z') {
                set.add(ch);
            }
        }
        
        // The size of the set represents distinct letters
        System.out.println(set.size());
    }
}