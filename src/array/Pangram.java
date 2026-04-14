package array;

import java.util.*;
public class Pangram {
    public static void main(String[] args) {
        String sentence = "leetcode";
        boolean check = checkPangram(sentence);
        System.out.println(check);
    }

    public static boolean checkPangram(String sentence){
        HashSet<Character> set = new HashSet<>();

        for(int i = 0 ; i<sentence.length() ; i++){
            set.add(sentence.charAt(i));
        }
        int count = set.size();
        return count == 26;
    }
}
