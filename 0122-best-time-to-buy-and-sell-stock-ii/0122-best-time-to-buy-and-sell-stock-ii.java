class Solution {
    public int maxProfit(int[] prices) {
        
        int  n = prices.length;
        int buy = prices[0];
        int profit = 0 ;
        for(int i = 0 ; i<n;i++){
            if(prices[i]>buy){   //If price is smaller → update buy price.
                 profit+=  prices[i]-buy; 
            }
            buy = prices[i];
           
            }
        
         return profit;
    }
}


        
    

    
