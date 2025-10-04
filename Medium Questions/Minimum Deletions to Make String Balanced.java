1653. Minimum Deletions to Make String Balanced

class Solution {
    public int minimumDeletions(String s) {
        int deletions = 0;
        int b_count = 0;

        for(char c : s.toCharArray()){
            if(c == 'a'){
                deletions = Math.min(deletions + 1, b_count);
            }else{
                b_count++;
            }
        }

        return deletions;
    }
}