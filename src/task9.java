public class task9 {
    /*
       findCoefficient - finding the Coefficient of two numbers
       @n = first number
       @m = second number
    */
    public static int findCoefficient(int n, int k) {
        if(n==k) return 1;
        if(k==0) return 1; // base case
        return findCoefficient(n-1, k-1) + findCoefficient(n-1, k); // returning the coefficient of two numbers by its formula
    }
}
