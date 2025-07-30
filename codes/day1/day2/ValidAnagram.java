package day2;
    import java.util.Arrays;

    public class ValidAnagram {
        public static boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }
            char[] arr1 = s.toCharArray();
            char[] arr2 = t.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1, arr2);
        }

        public static void main(String[] args) {
            String s = "listen";
            String t = "silent";

            if (isAnagram(s, t)) {
                System.out.println("Yes, it's an anagram.");
            } else {
                System.out.println("No, it's not an anagram.");
            }
        }
    }


