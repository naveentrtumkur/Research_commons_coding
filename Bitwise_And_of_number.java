// solution: Keep right shifting the numbers and make a count of ho wmany right shifts.
class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        if(m==0 || n==0)
            return 0;
        int rightShifted_bits = 1;
        while(m!=n)
        {
            m = m >> 1;
            n = n >>1;
            rightShifted_bits = rightShifted_bits + 1;
        }
        
        return rightShifted_bits * m;
    }
}
