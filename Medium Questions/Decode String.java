394. Decode String

class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder currentStr = new StringBuilder();

        int k = 0;

        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                k = k * 10 + (ch - '0');
            }
            else if(ch == '['){
                countStack.push(k);
                stringStack.push(currentStr);

                currentStr = new StringBuilder();
                k = 0;
            }
            else if(ch == ']'){
                int count = countStack.pop();
                StringBuilder decoded = stringStack.pop();

                for(int i = 1; i <= count; i++){
                    decoded.append(currentStr);
                }

                currentStr = decoded;
            }
            else{
                currentStr.append(ch);
            }
        }

        return currentStr.toString();
    }
}