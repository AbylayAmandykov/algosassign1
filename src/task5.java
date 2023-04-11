public class task5 {
    /*
       findFib - finding the fibonacci sequence
       @n = length of sequence
    */
    public static int findFib(int n) {
        if(n==0) return 0;
        if(n==1) return 1; // base cases
        return findFib(n-1)+findFib(n-2); // returning the fibonacci of number by its formula
    }
}
