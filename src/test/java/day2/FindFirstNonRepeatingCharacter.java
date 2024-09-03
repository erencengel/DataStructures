package day2;

import java.util.*;

public class FindFirstNonRepeatingCharacter {

    public static void main(String[] args) {

        System.out.println(getFirstNonRepeatingCharacter("Java DeveJloper"));
        System.out.println(findFirstNonRepeating("JJavaDDeveloper"));

    }

    public static String getFirstNonRepeatingCharacter(String str) {
        String se = str.replace(" ", "");
        String[] split = se.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(split));
        for (String s : list) {
            if(se.indexOf(s) == se.lastIndexOf(s)) return s;
        }
        return null;
    }

    public static Character findFirstNonRepeating(String str) {

        //create a map; it will cost me space complexity
        Map<Character, Integer> map = new HashMap<>();
        int count;

        //count the frequency of chars
        for (Character ch : str.toCharArray()) {
            if(map.containsKey(ch)) {
                count = map.get(ch);
                map.put(ch, count+1);
            }else {
                map.put(ch,1);
            }
        }

        //start from the beginning and check if there is char with frequency 1
        for (char ch : str.toCharArray()) {
            if(map.get(ch) == 1) return ch;
        }

        return null;
    }

}
