public class task8 {
    /*
       findDigit - finding the string is digit or not
       @s = our string to check
    */
    public static String findDigit(String s, int i) {
        if(i < 0){
            return "YES"; // base case
        }
        if(s.charAt(i) >=48 && s.charAt(i)<= 58){ // checking each value of s by ASCII table, there are only digits between 48 and 58
            return findDigit(s, i - 1); // returning "Yes" if the first condition passed
        }
        return "NO"; // else returning "NO"
    }
}
