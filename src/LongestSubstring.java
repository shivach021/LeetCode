import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public static void main(String[] args) {
        String input = "au";
        System.out.println(lengthOfLongestSubstring(input));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        }
        int max = 0;
        Set<Character> currentSet = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            currentSet.clear();
            for (int j = i; j < s.length(); j++) {
                System.out.println("set has " + currentSet + " j = "+ j);
               char c = s.charAt(j);
               if (!currentSet.contains(c) && j == s.length() - 1) {
                   currentSet.add(c);
                   if (max <= currentSet.size()) {
                       max = currentSet.size();
                   }
                   break;
               }

               if (currentSet.contains(c) || j == s.length() - 1) {
                  System.out.println("current set has " + c + " max is "+ max);
                   if (max <= currentSet.size()) {
                       max = currentSet.size();
                   }
                   break;
               } else {
                   currentSet.add(c);
               }
            }
        }
        return max;
    }
}
