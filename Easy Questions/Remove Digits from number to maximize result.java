2259. Remove Digits from number to maximize result

class Solution {
    public String removeDigit(String number, char digit) {
        int tracker = -1;

        for(int i = 0; i < number.length(); i++){
            if(number.charAt(i) == digit){
                tracker = i;

                if(i < number.length() - 1 && number.charAt(i + 1) > digit){
                    return number.substring(0,i) + number.substring(i+1);
                }
            }
        }
        return number.substring(0,tracker) + number.substring(tracker + 1);
    }
}
