# Documentation of the first assignment
Here you can find explanations of all functions that I used to solve these problems.

**Task 1** 

**Description:** Returning the minimum value of an array

**Explanation:** We use recursion in this function to find the minimum element in this array. Base condtion  ``if(n==1)``, we return first element of an array. Otherwise, by function Math.min we return the minimum value.

**Solution:** 

```
public static int findMin(int[] arr, int n) {
        if (n == 1) { 
            return arr[0]; 
        }
        else{
            return Math.min(arr[n-1], findMin(arr, n-1)); 
        }
    }
```
**Task 2** 

**Description:** Returning the average value of an array

**Explanation:** We create a varibale ``sum`` and with the loop ``for`` we add all elements in array. To find average number we need to divide sum of all numbers to its amount. ``n`` means the length of an array, in other words amount of all numbers that we have.

**Solution:** 

```
public static double findAvg(int n, int[] arr) {
        double sum = 0; 
        for(int i = 0; i<n; i++) {
            sum += arr[i]; 
        }
        return sum/n; 
    }
```

**Task 3** 

**Description:** Checking the number for prime

**Explanation:** As you can see in solution to check prime number or not we used loop ``for``. Its logically clear that we need to start from 2, to avoid 0 and 1. We divide our entered number ``n`` to ``i``, if the remainder of division equals to 0 (if the number divides ) we return "Composite", otherwise "Prime". Also you can nptice that our length of loop is ``i<n/2``, to figure out if the number is prime or not, its enough to divide numbers half of itslef.

**Solution:** 

```
public static String findPrime(int n) {
        for(int i = 2; i<n/2; i++) { 
            if(n%i == 0) return "Composite"; 
        }
        return "Prime"; 
    }
```

**Task 4** 

**Description:** Finding the factorial of number

**Explanation:** This problem solved by using recursion. Our condintion ``if(n==1)`` we return 1. Otherwise, multiply this number to the less number by one.

**Solution:** 

```
 public static int findFactorial(int n) {
        if(n==1) return 1;
        return findFactorial(n-1) * n; 
    }
```

**Task 5** 

**Description:** Finding the element of fibonacci sequence

**Explanation:** This problem solved by using recursion. We have two conditions ``if(n==1)`` it returns 1, ``if(n==0)`` it returns 0. Otherwise, we add two numbers before the current number.

**Solution:** 

```
public static int findFib(int n) {
        if(n==0) return 0;
        if(n==1) return 1; 
        return findFib(n-1)+findFib(n-2); 
    }

```

**Task 6** 

**Description:** Returning the power of a number

**Explanation:** This problem solved by using recursion. We have one condition ``if(m==0)``, it returns 1. Otherwise, we multiply this number to itslef.

**Solution:** 

```
public static int findPower(int n, int m) {
        if(m==0) return 1;
        return n * findPower(n, m-1); 
    }
```

**Task 7**   

**Description:** Reverse an array of n elements, without data structure array

**Explanation:** This problem solved by using recursion. This function returns the reversed elements of an array as a string. We use the Scanner 'sc' to read the input and store the data in an integer variable 'a', which will be converted to a string and added to the end of the resulting string, and then call the recursive function again, which will develop the resulting string before the variable 'a'. At the end, we have a basic recursion condition that ends the recursion when the number of array elements reduced to 1.

**Solution:** 

```
public static String findReverse(int n, Scanner sc){
        int a; 
        if(n <= 1){ 
            a = sc.nextInt();
            return String.valueOf(a);
        }
        a = sc.nextInt();
        return findReverse(n - 1, sc) + " " + a;
    }
```

**Task 8** 

**Description:** Checking the String to digits

**Explanation:** This problem solved by using recursion. We have one condition ``if(i<0)``, it returns "YES". Otherwise, we check all ``i`` in our String. In ASCII table digits are between 48 and 58 and it recursively checks it, if one index doesn`t match to our condition, it returns "NO".

**Solution:** 

```
 public static String findDigit(String s, int i) {
        if(i < 0){
            return "YES"; 
        }
        if(s.charAt(i) >=48 && s.charAt(i)<= 58){ 
            return findDigit(s, i - 1); 
        }
        return "NO";
    }
```

**Task 9** 

**Description:** Finding binomial coefficient of numbers by using formula

**Explanation:** This problem solved by using recursion. We have two conditions ``if(n==k)`` and``if(k==0)`` it always returns 1. Otherwise, by using binomial coefficient formula we return sum of functions.

**Solution:** 

```
public static int findCoefficient(int n, int k) {
        if(n==k) return 1;
        if(k==0) return 1;
        return findCoefficient(n-1, k-1) + findCoefficient(n-1, k); 

    }
```

**Task 10** 

**Description:** Finding GCD of two numbers

**Explanation:** This problem solved by using recursion. We have one condition ``if(b==0)``, it returns a. Otherwise, we divide numbers while we have remainder of 0. 

**Solution:** 

```
 public static int findGcd(int a, int b) {
        if(b==0) return a; 
        return findGcd(b, a%b); 

    }
```
