import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myTask;
        do {
            System.out.println("Hey, please choose the task that you want to run: ");
            for (int i = 1; i <= 10; i++) System.out.println(i + ") Task " + i);
            System.out.println("Also you can exit from code, by choosing 0");
            myTask = sc.nextInt();
            switch (myTask) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("Please, write the length of your array: ");
                    int n = sc.nextInt();
                    System.out.println("Please, input the numbers of your array:");
                    int[] arr = new int[n];
                    for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }
                    System.out.println("The minimum number in your array is: " + task1.findMin(arr, n));
                    break;
                case 2:
                    System.out.println("Please, write the length of your array: ");
                    n = sc.nextInt();
                    System.out.println("Please, input the numbers of your array:");
                    arr = new int[n];
                    for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }
                    System.out.println("The average number of your array is: " + task2.findAvg(n, arr));
                    break;
                case 3:
                    System.out.println("Please, input the number that you want to check: ");
                    n = sc.nextInt();
                    System.out.println("This number is " + task3.findPrime(n));
                    break;
                case 4:
                    System.out.println("Please, enter your number: ");
                    n = sc.nextInt();
                    System.out.println("Factorial of your number is: " + task4.findFactorial(n));
                    break;
                case 5:
                    System.out.println("Please, enter your number: ");
                    n = sc.nextInt();
                    System.out.println("The fibonacci of your number is: " + task5.findFib(n));
                    break;
                case 6:
                    System.out.println("Please, enter your number: ");
                    n = sc.nextInt();
                    System.out.println("Please, enter power of your number: ");
                    int m = sc.nextInt();
                    System.out.println(m + " to the power of " + n + " is: " + task6.findPower(n, m));
                    break;
                case 7:
                    System.out.print("Please, input the amount of numbers: ");
                    n = sc.nextInt();
                    System.out.print("Please, enter your numbers: ");
                    System.out.println(task7.findReverse(n, sc));
                    break;
                case 8:
                    System.out.println("Please, input any string to check for digits: ");
                    String s = sc.next();
                    System.out.println(task8.findDigit(s, s.length() - 1));
                    break;
                case 9:
                    System.out.println("Please, enter the first number: ");
                    n = sc.nextInt();
                    System.out.println("Please, enter the second number: ");
                    int k = sc.nextInt();
                    System.out.println("Binomial coefficient of numbers " + n + " and " + k + " is: " + task9.findCoefficient(n, k));
                    break;
                case 10:
                    System.out.println("Please, enter the first number: ");
                    int a = sc.nextInt();
                    System.out.println("Please, enter the second number: ");
                    int b = sc.nextInt();
                    System.out.println("The GCD of numbers " + a + " and " + b + " is: " + task10.findGcd(a,b));
                    break;
                default:
                    System.out.println("Out of range!");
                    break;
            }
        }
        while(myTask != 0);
    }
}
