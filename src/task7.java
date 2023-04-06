import java.util.Scanner;

public class task7 {
    public static String findReverse(int n, Scanner sc){
        int a; // @ a = numbers that we want to reverse
        if(n <= 1){ // base case
            a = sc.nextInt();
            return String.valueOf(a); // returning String, because of adding elements
        }
        a = sc.nextInt();
        return findReverse(n - 1, sc) + " " + a; // returning reverse of numbers by adding first numbers to the end
    }
    public static void main(String[] args) {
        // getting input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // @ n = amount of number

        System.out.println(findReverse(n, sc));

        sc.close();
    }


}