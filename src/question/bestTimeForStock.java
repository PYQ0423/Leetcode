class Solution {

    public int maxProfit_jyq233(int[] prices){
        if(prices.length == 0) return 0;
        int res = 0;
        for( int i=0;i<prices.length;i++){
            if(i == 0) continue;
            if(prices[i]>prices[i-1]){
                res += (prices[i]-prices[i-1]);
            }
        }
        return res;
    }


    public int maxProfit(int[] prices) {
        int buy_price = -1;
        int sell_price = -1;
        int buy_point = 0;
        int sell_point = 0;
        int gain = 0;

        // Test case: [7 1 6 4 5]
        // [2 1 2 0 1]
        for(int i=0; i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                buy_price = prices[i];
                buy_point = i;
                sell_point = i+1;
                sell_price = prices[i+1];
            }

            if ((prices[i] > prices[i+1]) && (buy_price!=-1) ){
                sell_price = prices[i];
                sell_point = i;
            }

            if(sell_price!=-1 && buy_price!=-1 && (buy_point < sell_point)){
                gain = gain + sell_price - buy_price;
                sell_price = -1;
                buy_price = -1;
            }
        }

        return gain;
    }
}