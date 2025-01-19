class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String substr = "";
        String result = "";

        for (char i : str1.toCharArray()) {
            String newstr1 = str1;
            String newstr2 = str2;
            substr += i;
            if (str1.indexOf(substr) != -1) {
                if (newstr1.replaceAll(substr, "").equals("") && newstr2.replaceAll(substr, "").equals("")) {
                    result = substr;
                }
            } else {
                return "";
            }
        }
        return result;
    }
}