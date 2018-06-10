class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        
        if(s.length()!=t.length())
            return false;
        
        // 1. Iterate through the first string and push the chracters onto the hashmap
        for(int i=0;i<s.length();i++)
        {
            if(!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),1);
            else
                map.replace(s.charAt(i),map.get(s.charAt(i))+1);
        }
        
        //2. Itearte through the second string and remove the characters, and return the result.
        for(int i=0;i<t.length();i++)
        {
            if(map.containsKey(t.charAt(i)))
            {
                if(map.get(t.charAt(i)) == 1)
                    map.remove(t.charAt(i));
                else
                    map.replace(t.charAt(i),map.get(t.charAt(i))-1);
            }
            else
                return false;
        }
        
        //Return true if map is empty else return false;
        return map.isEmpty();
    }
}
