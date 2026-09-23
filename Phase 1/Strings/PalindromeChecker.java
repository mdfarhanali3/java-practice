public class PalindromeChecker {
    public static void main(String[] args) {
        String sentence = "race car";

        sentence = sentence.replace(" ", "").toLowerCase();

        int i = 0;
        int j = sentence.length() - 1;
        boolean isPalindrome = true;

        while (i != j) {
            if (sentence.charAt(i) != sentence.charAt(j)) {
                isPalindrome = false;
                break;
            }

            i++;
            j--;
        }

        if (isPalindrome) {

            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");

        }
    }

}