public class BestTimeToBuyAndSell {
    public static void main(String[] args) {
        int[] prices = {6, 3, 5, 7, 1, 4};
        int res = maxProfit(prices);
        System.out.println(res);
    }

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int res = 0;
        int temp = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            temp = prices[i] - min;
            if (res < temp) {
                res = temp;
            }
        }
        return res;
    }
}
