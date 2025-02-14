class Solution {
    public int maxVowels(String s, int k) {

        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        //------------

        int n = s.length();
        int currentVowelCount = 0;

        //loop through the first k charcaters and count the number of vowels
        for(int i = 0; i < k; i++){

            if(vowels.contains(s.charAt(i))){
                ++currentVowelCount;
            }
        }

        int maxVowelCount = currentVowelCount;

        for(int i = k; i < n; i++){

            //check if the character we are removing from the left is a vowel
            if(vowels.contains(s.charAt(i-k))){
                --currentVowelCount;
            }

            //check if the newly added one on the right is a vowel
            if(vowels.contains(s.charAt(i))){
                ++currentVowelCount;
            }

            //use Math.max to find the max between current and max
            maxVowelCount = Math.max(currentVowelCount, maxVowelCount);

        }

        return maxVowelCount;
    }
}