class Solution {
    public boolean isValid(String s) {
        
        //Declare a stack to hold the characters of the string.
        
        int len = s.length();
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<len;i++)
        {
            char cur = s.charAt(i);
            if(cur == '(' || cur == '{' || cur == '[')
                st.push(cur);
            else if( cur == ')' )
            {
                if(st.isEmpty())
                    return false;
                char c = st.pop();
                if(c!='(')
                    return false;
            }
            else if(cur == '}')
            {
                if(st.isEmpty())
                    return false;
                char c = st.pop();
                if(c!='{')
                    return false;
            }
            else if(cur == ']')
            {
                if(st.isEmpty())
                    return false;
                char c = st.pop();
                if(c!='[')
                    return false;
            }
        }
        
        return st.isEmpty();
        
        
    }
}
