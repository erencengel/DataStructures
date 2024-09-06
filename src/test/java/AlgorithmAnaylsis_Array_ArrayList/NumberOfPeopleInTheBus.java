package AlgorithmAnaylsis_Array_ArrayList;

import java.util.ArrayList;

public class NumberOfPeopleInTheBus {

    public static int calculatePersonNumber(ArrayList<int[]> passengers) {
        int taking = 0;
        int gettingOff = 0;
        for (int[] passenger : passengers) {
            taking+= passenger[0];
            gettingOff += passenger[1];
        }
        return taking - gettingOff;
    }

    public static void main(String[] args) {
        int[] firstStop = {10,0};
        int[] secondStop = {1,2};
        int[] thirdStop = {3,2};
        ArrayList<int[]> list = new ArrayList<>();
        list.add(firstStop);
        list.add(secondStop);
        list.add(thirdStop);
        System.out.println("calculatePersonNumber(list) = " + calculatePersonNumber(list));
    }

}
