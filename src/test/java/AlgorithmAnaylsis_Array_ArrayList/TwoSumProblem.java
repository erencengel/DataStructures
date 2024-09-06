package AlgorithmAnaylsis_Array_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSumProblem {

    public static void main(String[] args) {

        int[] numbers = {2,7,11,15,2};
        int num = 9;
        int[] ints = twoSum(numbers, num);
        System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));
        ArrayList<int[]> ints1 = twoSumArrayList(numbers, num);
        for (int[] ints2 : ints1) {
            System.out.println("Arrays.toString(ints2) = " + Arrays.toString(ints2));
        }

    }

    public static int[] twoSum(int[] arr, int number) {
        int i = 0;
        int[] finalSolution = new int[2];
        for (; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == number) {
                    finalSolution[0] = i;
                    finalSolution[1] = j;
                    return finalSolution;
                }
            }
        }
        return finalSolution;
    }

    public static ArrayList<int[]> twoSumArrayList(int[] arr, int number) {
        int i = 0;
        ArrayList<int[]> arrayList = new ArrayList<>();
        for (; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == number) {
                    int[] finalSolution = new int[2];
                    finalSolution[0] = i;
                    finalSolution[1] = j;
                    arrayList.add(finalSolution);
                }
            }
        }
        return arrayList;
    }
}
