class Solution {
    public String solution(int age) {
        String str = "";
        int length = (int)(Math.log10(age) + 1);
        
        for (int i = 0; i < length; i++) {
            str += (char)(age % 10 + 'a');
            age /= 10;
        }
        
        char[] arr = str.toCharArray();
        char[] reversedArr = new char[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            reversedArr[arr.length - 1 - i] = arr[i];
        }
        
        String reversedStr = new String(reversedArr);
        
        return reversedStr;
    }
}