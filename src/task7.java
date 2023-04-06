import java.util.Scanner;

public class task7 {
    public static String findReverse(int n, Scanner sc){
        int a;
        if(n <= 1){
            a = sc.nextInt();
            return String.valueOf(a);
        }
        a = sc.nextInt();
        return findReverse(n - 1, sc) + " " + a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(findReverse(n, sc));

        sc.close();
    }


}