public class task2 {
    /*
       findAvg - finding the average of numbers
       @arr = array
       @n = length of our array
    */
    public static double findAvg(int n, int[] arr) {
        double sum = 0; // @ sum = sum of adding all elements
        for(int i = 0; i<n; i++) {
            sum += arr[i]; // adding all elements to get result
        }
        return sum/n; // returning the average number by dividing sum to length
    }
}

