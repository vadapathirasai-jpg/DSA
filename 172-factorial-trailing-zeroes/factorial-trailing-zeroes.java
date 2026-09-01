class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        int k = 5;
     while( k <= n ){
            count += n/k;
           // n = n / k;
            k *= 5;
       }
       //TC:O(log base 5 n);
        return count;
    }
}