package AlgorithmAnaylsis_Array_ArrayList_1;

import java.util.Arrays;

public class Assignment1_TwoSumSolution1 {

    public static void main(String[] args) {
        int[] array = new int[]{2,7,9,11};
        System.out.println(Arrays.toString(twoSumSolution1(array,4)));

    }


    //Bruteforce solution of two sum problem
    public static int[] twoSumSolution1(int[]array, int targetValue) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(i != j) {
                    if(array[i] + array[j] == targetValue) return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

}
