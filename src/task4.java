public class task4 {
    /*
       findFactorial - finding the factorial of numbers
       @n = checking number
    */
    public static int findFactorial(int n) {
        if(n==1) return 1; // base case
        return findFactorial(n-1) * n; // returning factorized number by multiplying previous numbers
    }
}
