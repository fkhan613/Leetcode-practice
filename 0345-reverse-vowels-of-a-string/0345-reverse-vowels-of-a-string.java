class Solution {
    public String reverseVowels(String s) {

        //define hashseht that contains the vowels
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        //loop through the string, use two pointers to keep track of left and right
        int left = 0;
        int right = s.length() -1;
        char temp;
        char[] charArray = s.toCharArray();

        while (left < right){

            //if the left and right are vowels, switch them
            if(vowels.contains(charArray[left]) && vowels.contains(charArray[right])){
                temp = charArray[right];
                charArray[right] = charArray[left];
                charArray[left] = temp;
                left++;
                right--;
                continue;
            }

            //only increment/decrement if the left/right is not a vowel
            if(!vowels.contains(charArray[left])){
                left++;
            }

            if(!vowels.contains(charArray[right])){
                right--;
            }
            
        }

        return new String(charArray);
    }
}