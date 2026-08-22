class Solution {
    int sumOfDigit(int n){
        int sum = 0;
        while( n != 0 ){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
    int productOfDigit(int n){
        int product = 1;
        while( n != 0 ){
            product *= n%10;
            n = n/10;
        }
        return product;
    }
    public boolean checkDivisibility(int n) {
      int sum = sumOfDigit(n);
      int product = productOfDigit(n);
      return ( n % ( sum + product) ) == 0;
    }
}