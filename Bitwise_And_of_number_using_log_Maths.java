// Try to come up with O(1) Solution using Java
// Step-1 : Find the Xor of given numbers.
// Step-2 : find the highest MSB from starting from LSB where mismatch happened
// Step-3 : shift right and then shift left.
// Step-4 : Return the formed answer

class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        if(n == m)
            return m;
        
        int highest = m^n;
        
        //Count the Max MSB position where mismatch happened.
        int count = (int)(Math.log(highest)/ Math.log(2)) + 1;
        
        m = m >> count;
        
        m = m << count;
        
        return m;
        
    }
}
