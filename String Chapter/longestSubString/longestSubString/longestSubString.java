import java.util.HashSet;
import java.util.Set;

class LongestSubString {
    public static int longestSubString(String str) {
        int left = 0;
        int right = 0;
        int max = 0;
        Set<Character> seen = new HashSet<>();
        
        while (right < str.length()) {
            char ch = str.charAt(right);
            
            if (seen.add(ch)) {
                max = Math.max(max, right - left + 1);
                right++;
            } else {
                while (str.charAt(left) != ch) {
                    seen.remove(str.charAt(left));
                    left++;
                }
                // Move the left pointer one step forward to skip the duplicate character
                left++;
                right++;
            }
        }
        
        return max;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(longestSubString(str)); // Output should be 3
    }
}
