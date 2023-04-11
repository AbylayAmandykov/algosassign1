public class task10 {
    /*
       findCoefficient - finding the Coefficient of two numbers
       @n = first number
       @m = second number
    */
    public static int findGcd(int a, int b) {
        if(b==0) return a; // base case
        return findGcd(b, a%b); // returning the greatest common divisor by taking mod of two elements

    }
}
