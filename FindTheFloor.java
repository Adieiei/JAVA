public class FindTheFloor {
    public int solve(int A) {
        // If A is negative and there is a remainder, standard division 
        // truncates towards zero. We need to subtract 1 to get the floor.
        if (A < 0 && A % 200 != 0) {
            return (A / 200) - 1;
        }
        
        // For positive numbers or exact multiples, standard division is exactly the floor.
        return A / 200;
    }
}

//  Another way 

/*
public class Solution {
    public int solve(int A) {
        // Divide by a double (200.0) to get the exact real number, then floor it.
        return (int) Math.floor(A / 200.0);
    }
}
                 Ceil value

return (int) Math.ceil(A / 200.0);

or

if(A>0 && A%200 != 200){
            return (A/200) + 1;
                    }
                    return A/200;



*/