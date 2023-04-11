public class task6 {
    /*
       findPower - finding the power of number
       @n = checking number
       @m = power of number
    */
    public static int findPower(int n, int m) {
        if(m==0) return 1; // base case
        return n * findPower(n, m-1); // returning the power of n by multiplying each value
    }
}
