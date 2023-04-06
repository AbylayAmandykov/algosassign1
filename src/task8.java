import java.util.Scanner;

public class task8 {
    public static String findDigit(String s, int i) {
        if(i < 0){
            return "YES"; // base case
        }
        if(s.charAt(i) >=48 && s.charAt(i)<= 58){ // checking each value of s by ASCII table, there are only digits between 48 and 58
            return findDigit(s, i - 1); // returning "Yes" if the first condition passed
        }
        return "NO"; // else returning "NO"
    }

    public static void main(String[] args) {
        // getting input
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // @ s = string that we want to check
        String ans = findDigit(s, s.length() - 1); // getting our function
        System.out.println(ans);

        sc.close();

    }
}
