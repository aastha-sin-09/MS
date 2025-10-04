253. Meeting Rooms II

class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        // code here
        if(start == null || start.length == 0){
            return 0;
        }
        
        Arrays.sort(start);
        Arrays.sort(end);
        
        int rooms = 0;
        int endTracker = 0;
        
        for(int i = 0; i < start.length; i++){
            if(start[i] < end[endTracker]){
                rooms++;
            }else{
                endTracker++;
            }
        }
        
        return rooms;
        
    }
}
