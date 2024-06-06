package com.pankaj.ds.arrays;

public class MaxProfitBuySell {

    public int maxProfit(int[] prices) {

        int minBuyValue = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices){
            if(price < minBuyValue){
                minBuyValue = price;
            }
            if(price - minBuyValue > maxProfit){
                maxProfit = price - minBuyValue;
            }
        }

        return maxProfit;
    }

    public static void main(String [] args){
        int[] array = {7,2,5,3,6,4};
        MaxProfitBuySell maxProfitBuySell = new MaxProfitBuySell();
        int maxProfit = maxProfitBuySell.maxProfit(array);
        System.out.print(maxProfit);
    }
}
