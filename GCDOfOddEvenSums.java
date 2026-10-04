class GCDOfOddEvenSums {
    public int gcdOfOddEvenSums(int n) {
        long SumOdd = (long)n*n;
        long SumEven = (long)n*(n+1);
        long a = SumOdd;
        long b = SumEven;
        while(b!=0){
            long temp = b;
            b = a%b;
            a = temp;
        }
        return (int)a;
    }
}
