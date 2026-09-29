public class Jewels {
    public int solve(String A, String B) {
        int count = 0;
        for (int i = 0; i < B.length(); i++) {
            for (int j = 0; j < A.length(); j++) {
                if (B.charAt(i) == A.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}