package org.example.array_string._121_best_time_to_buy_and_sell_stock;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;
        for (int price : prices) {
            if (price < min) {
                min = price;
            } else {
                maxProfit = Math.max(maxProfit, price - min);
            }
        }
        return maxProfit;
    }
}
