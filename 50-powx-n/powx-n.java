class Solution {
    public double myPow(double x, int n) {
        if(n== 0){
        return 1;
    }
     
//if n is even
double halfPower=myPow(x, n/2);
   double halfPowSq=   halfPower * halfPower;
    if (n < 0) {
            n = -n;
            x = 1 / x;
        }
  
    //n is odd
    if( n % 2 != 0){
       halfPowSq= x * halfPowSq;
     }

   return halfPowSq;
  }
   
}