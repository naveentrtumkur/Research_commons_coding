class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> st = new Stack<Integer>();
        
        for(int cur:asteroids)
        {
           label:
            {
            while(!st.isEmpty() && st.peek() > 0 && cur < 0)
            {
                
                if(st.peek() < -cur)
                {
                    st.pop();
                    continue;
                }
                //It should be negative of that number, only then they will collide.
                else if(st.peek() == -cur)
                {
                    st.pop();
                             
                }
                
                break label;
                
            }
            st.push(cur);   
        }
        }
        
        int len = st.size();
        
        int[] ans = new int[len];
        
        //Add elements in the reverse order.
        for(int i=len-1;i>=0;i--)
        {
            ans[i] = st.pop();
        }
        
        return ans;
        
        
        
        }       
}
