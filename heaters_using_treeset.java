//Solution using a TreeSet in Java.
//COnstruct a tree set and find the min Radius reqd.
class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        TreeSet<Integer> set =  new TreeSet<>();
        
        for(int i:heaters )
            set.add(i);
        
        int res = 0;
        for(int house:houses)
        {
            Integer up = set.ceiling(house);
            Integer low = set.floor(house);
            
            res = Math.max(res, Math.min((up == null)?Integer.MAX_VALUE : up - house,(low == null)?Integer.MAX_VALUE:house - low) );
        }
        
        return res;
    }
}
