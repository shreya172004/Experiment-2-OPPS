import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 = "nagaram";

        System.out.println(isAnagram(s1, t1));  // Output: true

        String s2 = "rat";
        String t2 = "car";

        System.out.println(isAnagram(s2, t2));  // Output: false
    }

    // Function to check if two strings are anagrams
    public static boolean isAnagram(String s, String t) {
        // If the lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Convert both strings to character arrays
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        // Sort both character arrays
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Compare the sorted arrays
        return Arrays.equals(sArray, tArray);
    }
}
