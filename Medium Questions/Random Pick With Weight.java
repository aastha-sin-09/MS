528. Random Pick with Weight

class Solution {
    int[] cummulativeSum;
    int totalSum;
    Random rand;

    public Solution(int[] w) {
        this.rand = new Random();
        this.cummulativeSum = new int[w.length];

        int currSum = 0;
        for(int i = 0; i < w.length; i++){
            currSum += w[i];
            this.cummulativeSum[i] = currSum;
        }
        this.totalSum = currSum;
    }
    
    public int pickIndex() {
        int target = rand.nextInt(totalSum);

        int l = 0;
        int h = cummulativeSum.length - 1;

        while(l < h){
            int mid = (l + h)/2;
            if(target >= cummulativeSum[mid]) l = mid + 1;
            else h = mid;
        }
        return l;
    }
}