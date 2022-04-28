class Solution {
public String multiply(String num1, String num2) {

    int len1 = num1.length();
    int len2 = num2.length();
    
    int len3 = len1 + len2;
    
    int [] arr = new int[len3];
    
    if(num1.equals("0") || num2.equals("0"))
        return "0";
    
    if(num1.equals("1"))
        return num2;
    
    if(num2.equals("1"))
        return num1;
    
    
    
    for(int i=num1.length()-1; i >=0; i--)
    {
        for(int j=num2.length()-1; j>=0; j--)
        {
            int product = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
            product = product + arr[i + j + 1];
            arr[i + j + 1] = product % 10;
            arr[i + j] += product/10;
            
        }
    }
    
    StringBuilder sb = new StringBuilder();
    
    for(int a : arr)
    {
        if(sb.length() == 0 && a == 0)
            continue;
        
        sb.append(a);
    }
    
    return sb.toString();
    
}
}