package Stack_4.Review4;

public class PowerOfTwo {

    /**
     * Leetcode problem
     * Problem No: 231
     * return if a given number is power of 2
     */

    public static boolean isPowerOfTwo(int n) {
        //Base Condition
        if(n == 1) return true;
        if(n%2 != 0 || n <= 0) return false;
        return isPowerOfTwo(n/2);
    }

}
