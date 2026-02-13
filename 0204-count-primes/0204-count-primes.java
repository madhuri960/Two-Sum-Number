class Solution {
    public int countPrimes(int n) {
        
        if (n <= 2) return 0;
        
        // Assume all numbers are prime
        boolean[] isPrime = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            isPrime[i] = true;
        }
        //Mark 0 and 1 as false (not prime)
        isPrime[0] = false;
        isPrime[1] = false;
        
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                // Mark multiples as not prime
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        int count = 0;
        
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        
        return count;
    }
}

       
            
       
    

        

            