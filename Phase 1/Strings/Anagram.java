public class Anagram {
    public static void main(String[] args) {
        String word1 = "hello";
        String word2 = "world";

        boolean isAnagram = false;

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        for (int i = 0; i < word1.length(); i++) {
            for (int k = 0; k < word2.length(); k++) {

                if (word1.charAt(i) != word2.charAt(k)) {
                    if (k == (word2.length()-1) ) {
                        isAnagram = false;
                        // break both loops
                    }
                    isAnagram = false;
                } else {
                    isAnagram = true;
                    break;
                }
            }

        }      

        if (word1.length() != word2.length()) {
            isAnagram = false;
        }
        if (isAnagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an Anagram");

        }
    }
}
