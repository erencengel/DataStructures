package Stack_4;

import java.util.Deque;
import java.util.LinkedList;

public class Stack_Assignment {

    /**
     * Given an array of buildings and a direction that all of the buildings face,
     * return an array of the indices of the buildings that can see the sunset.
     * A building can see the sunset if it's strictly taller than all of the buildings that come after it in the direction that it faces.
     * The input array named buildings contains positive, non-zero integers representing the heights of the buildings.
     * A building at index i thus has a height denoted by buildings[i] .
     * All of the buildings face the same direction, and this direction is either east or west,
     * denoted by the input string named direction , which will always be equal to either "EAST" or "WEST" .
     * In relation to the input array, you can interpret these directions as right for east and left for west.
     * Important note: the indices in the output array should be sorted in ascending order.
     * Sample Input buildings = [3, 5, 4, 4, 3, 1, 3, 2] direction = "EAST"
     * Sample Output [1, 3, 6, 7] //
     */

    /**
     * Author Eren Ç.
     * First attempt to solve the problem
     * First Solution will be implemented only for EAST
     * Then it will be improved by adding WEST option as well
     */


    int[] buildingsWhoSeeSun(Integer[] buildings) {
        //create an empty stack
        MyStack<Integer> myStack = new MyStack<>();

        //add first item
        myStack.push(buildings[0]);

        //create a loop that will add the following items
        for (int i = 1; i < buildings.length; i++) {
            //inside the loop, there should be a condition that
            //  1. if the following element is smaller than the previous one, no action needed
            //  2. if the following element is taller than the previous one
            //      2.1. add the index number of the element
            //      2.2. check if the added element is taller than the previous ones, if an element is in the list but shorter than the last one, then remove it
            Integer element = buildings[i];
            if(element < myStack.bottom.value){
                continue;
            } else {
                
            }




        }



        return null;
    }


}
