56. Merge Intervals

class Solution {
    public int[][] merge(int[][] intervals) {
        //sorted the intervals based on starting time
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0] - b[0];
            }
        });

        //creating merged 
        List<int[]> merged = new ArrayList<>();

        for(int[] interval : intervals){
            
            //if empty or not overlapping
            if(merged.isEmpty() || interval[0] > merged.get(merged.size() - 1)[1]){
                merged.add(interval);
            } else{
                //overlapping then merge
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        return merged.toArray(new int[merged.size()][]);

    }
}
