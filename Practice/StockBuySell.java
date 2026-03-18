public class StockBuySell {
    public static void main(String[] args) {
        int arr[] = {7,1,5,0,1,3,6,4};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] price){
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        int profit=0;
        for(int i=0; i<price.length-1; i++){
            for(int j=i; j<price.length; j++){
                if(price[i] > price[j]){
                    break;
                }
                profit = price[j]-price[i];
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

    // public static int maxProfit(int[] prices) {
    //     int minPrice = Integer.MAX_VALUE;
    //     int maxProfit = 0;
    //     for (int i = 0; i < prices.length; i++) {
    //         if (prices[i] < minPrice) {
    //             minPrice = prices[i];
    //         }
    //         if (prices[i] - minPrice > maxProfit) {
    //             maxProfit = prices[i] - minPrice;
    //         }
    //     }
    //     return maxProfit;
    // }
}
