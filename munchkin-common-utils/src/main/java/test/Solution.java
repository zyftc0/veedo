package test;


import java.util.concurrent.atomic.AtomicReference;

/**
 * ing: 未解决，解决中
 * complete: 已解决
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("ccccc"));
        System.out.println(longestPalindrome("abb"));
        System.out.println(longestPalindrome("aabb"));
    }

    /**
     * 最大长度是1000
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {
        if (s.length() == 1) return s;
        if (s.length() == 2 && s.charAt(0) != s.charAt(1)) return s.substring(0, 1);

        AtomicReference<String> re = new AtomicReference<>("");

        for (int i = 0; i < s.length()-1; i++) {
            int left = i;
            int right = sureRight(s, left);
//            if (re.get().length() < (right - left)) {
//                re.set(s.substring(left, right));
//            }

            shifting(s, left, right-1, re);
        }

        return re.get();
    }

    private static int sureRight(String s, int i) {
        if (i < s.length()-1) {
            if (s.charAt(i) == s.charAt(i+1)) {
                return sureRight(s, i+1);
            } else {
                return i+1;
            }
        } else {
            return s.length();
        }
    }

    private static void shifting(String s, int left, int right, AtomicReference<String> re) {
        if (s.charAt(left) == s.charAt(right)) {
            if (left > 0 && right < s.length()-1) {
                shifting(s, left-1, right+1, re);
            } else if (left > 0 && right >= s.length()-1) {
                shifting(s, left-1, right, re);
            } else if (left <= 0 && right < s.length()-1) {
                shifting(s, left, right+1, re);
            } else {
                re.set(s);
            }
        } else {
            String result = s.substring(left, right+1);
            if (result.length() > re.get().length()) {
                re.set(result);
            }
        }
    }


}
