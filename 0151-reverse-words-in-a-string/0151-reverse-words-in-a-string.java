class Solution {
    public String reverseWords(String s) {

        String[] words = s.trim().split(" ");
        String result = "";

        System.out.println(Arrays.toString(words));

        for(int i = words.length-1; i >= 0; i--){

            //check if the current "word" is a space
            if(!words[i].equals("")){
                result += words[i] + " ";
            }
        }

        return result.trim();
    }
}