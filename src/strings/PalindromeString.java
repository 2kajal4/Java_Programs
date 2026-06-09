package strings;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      String s = "abba";   // input

	        int start = 0;
	        int end = s.length() - 1;

	        boolean isPalindrome = true;

	        while (start < end) {
	            if (s.charAt(start) != s.charAt(end)) {
	                isPalindrome = false;
	                break;
	            }
	            start++;
	            end--;
	        }

	        if (isPalindrome) {
	            System.out.println("Palindrome");
	        } else {
	            System.out.println("Not Palindrome");
	        }
	    }

	}


