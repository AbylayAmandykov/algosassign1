public class task1 {
    /*
       findMin - finding the minimum element
       @arr = array
       @n = length of our array
    */
    public static int findMin(int[] arr, int n) {
        if (n == 1) { // base case
            return arr[0]; // returning the first element of our array
        }
        else{
            return Math.min(arr[n-1], findMin(arr, n-1)); // returning the minimum number by using function
        }
    }
}




