import java.util.Scanner;
public class task7 {
    /*
      findReverse - finding the reverse of numbers
      @n = amount of numbers
      @a = numbers
   */
    public static String findReverse(int n, Scanner sc){
        int a; // @ a = numbers that we want to reverse
        if(n <= 1){ // base case
            a = sc.nextInt();
            return String.valueOf(a); // returning String, because of adding elements
        }
        a = sc.nextInt(); // entering of the number
        return findReverse(n - 1, sc) + " " + a; // returning reverse of numbers by adding first numbers to the end
    }
}