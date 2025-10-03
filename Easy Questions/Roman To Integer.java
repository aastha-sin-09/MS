13. Roman to Integer

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanVal = new HashMap<>();

        romanVal.put('I',1);
        romanVal.put('V',5);
        romanVal.put('X',10);
        romanVal.put('L',50);
        romanVal.put('C',100);
        romanVal.put('D',500);
        romanVal.put('M',1000);


        int total = romanVal.get(s.charAt(s.length() - 1));

        for(int i = s.length() - 2; i >= 0; i--){
            int currVal = romanVal.get(s.charAt(i));
            int rightVal = romanVal.get(s.charAt(i + 1));

            if(currVal < rightVal){
                total -= currVal;
            }else{
                total += currVal;
            }
        }

        return total;
    }
}