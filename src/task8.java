import java.util.Scanner;

public class task8 {
    public static String findDigit(String s, int i) {
        if(i < 0){
            return "YES";
        }
        if(s.charAt(i) >=48 && s.charAt(i)<= 58){
            return findDigit(s, i - 1);
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = findDigit(s, s.length() - 1);
        System.out.println(ans);

        sc.close();

    }
}
