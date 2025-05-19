package week3.day3.marathon;

public class LastWordLength {
	    public static int lengthOfLastWord(String s) {
	        int length = 0;
	        int i = s.length() - 1;

	        // Step 1: Skip trailing spaces
	        while (i >= 0 && s.charAt(i) == ' ') {
	            i--;
	        }

	        // Step 2: Count characters of the last word
	        while (i >= 0 && s.charAt(i) != ' ') {
	            length++;
	            i--;
	        }

	        return length;
	    }

	    public static void main(String[] args) {
	        System.out.println(lengthOfLastWord("Hello World"));                  // Output: 5
	        System.out.println(lengthOfLastWord("   fly me   to   the moon  ")); // Output: 4
	        System.out.println(lengthOfLastWord("luffy is still joyboy"));       // Output: 6
	    }
	}
