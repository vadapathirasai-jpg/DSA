class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1; int c = n;
        while( n != 0 ){
            int rem = n % 10;
            sum += rem;
            product *= rem;
            n = n / 10;
        }
        return c % ( sum + product) == 0;
    }
}