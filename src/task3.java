public class task3 {
    /*
       findPrime - finding the prime element or not
       @n = checking number
    */
    public static String findPrime(int n) {
        for(int i = 2; i<n/2; i++) { // checking for prime by dividing numbers two times lesser than n
            if(n%i == 0) return "Composite"; // if n is divisible by any number in this loop returning Composite
        }
        return "Prime"; // else returning "Prime"
    }
}