package arrays;

/*
 Stock Buy Sell - Max profit by buying once and selling once
 Example: [7,1,5,3,6,4] -> 5 (buy at 1, sell at 6)
 Author: Aditi
*/
public class StockBuySell {
    public static void main(String[] args) {
        int[] price = {7, 1, 5, 3, 6, 4};
        int minPrice = price[0];
        int maxProfit = 0;

        for (int i = 1; i < price.length; i++) {
            if (price[i] < minPrice) {
                minPrice = price[i];
            } else {
                int profit = price[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        System.out.println("Max Profit: " + maxProfit);
    }
}
