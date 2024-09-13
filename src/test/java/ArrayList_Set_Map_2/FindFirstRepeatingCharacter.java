package ArrayList_Set_Map_2;

import java.util.*;

public class FindFirstRepeatingCharacter {

    public static void main(String[] args) {

        System.out.println("findFirstRepeatingChar(\"Java Developer\") = " + findFirstRepeatingChar("Java Developer"));
        System.out.println("findFirstRepeatingCharSolution2(\"Java Developer\") = " + findFirstRepeatingCharSolution2("Java Developer"));
        System.out.println("findFirstRepeatingCharSolution2(\"Alperen\") = " + findFirstRepeatingCharSolution2("Alperen"));

    }

    public static String findFirstRepeatingChar(String str) {

        String[] split = str.split("");
        List<String> arrayList = new ArrayList<>(Arrays.asList(split));
        for (String s : arrayList) {
            if(arrayList.indexOf(s) != arrayList.lastIndexOf(s)) return s;
        }

        return "";
    }

    public static Character findFirstRepeatingCharSolution2(String str) {
        Set<Character> set = new HashSet<>();
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if(!set.add(c)) return c;
        }
        return ' ';
    }

    public static Character findFirstRepeatingCharSbyInstructor(String str) {

        //What is the time complexity of the following code? --> O(n)

        //create a hashset
        Set<Character> set = new HashSet<>(); //in here there is space complexity of O(n) meaning that the size of the Set

        for (char ch : str.toCharArray()) {
            if(!set.add(ch)) return ch;
        }

        return ' ';
    }

}
