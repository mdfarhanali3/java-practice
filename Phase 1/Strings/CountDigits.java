public class CountDigits {
    public static void main(String[] args) {

        String sentence = "My name is md farhan ali. I am 24 years old.";

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        int digits = 0;
        int countVowels = 0;
        int spaces = 0;
        int consonants = 0;

        for (int i = 0; i < sentence.length(); i++) {

            char ch = Character.toLowerCase(sentence.charAt(i));

            if (ch == ' ') {
                spaces++;
                continue;
            }

            if (ch >= '0' && ch <= '9') {
                digits++;
                continue;
            }

            boolean isVowel = false;

            for (char letter : vowels) {
                if (ch == letter) {
                    countVowels++;
                    isVowel = true;
                    break;
                }
            }

            if (!isVowel && ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }

        System.out.println("Vowels: " + countVowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
    }
}