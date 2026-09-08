class Solution {
    public String toGoatLatin(String sentence) {

        String[] words = sentence.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            char firstchar = word.charAt(0);
            String transformedWord = "";

            if (firstchar == 'a' || firstchar == 'e' || firstchar == 'i' ||
                firstchar == 'o' || firstchar == 'u' ||
                firstchar == 'A' || firstchar == 'E' || firstchar == 'I' ||
                firstchar == 'O' || firstchar == 'U') {

                transformedWord = word + "ma";

            } else {

                transformedWord = word.substring(1) + word.charAt(0) + "ma";
            }
            for (int j = 0; j <= i; j++) {
                transformedWord = transformedWord + "a";
            }
            result = result + transformedWord + " ";
        }

        return result.trim();
    }
}
