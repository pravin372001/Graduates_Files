import java.util.Scanner;

public class StockBuySell {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no of days :");
        int n = in.nextInt();
        System.out.println("Enter the stock prices ");
        int prices[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the day " + (i + 1) + " stock price :");
            prices[i] = in.nextInt();
        }

        int maxProfit = 0;
        int currentBuy = prices[0];

        for (int i = 1; i < n; i++) {
            int currentSell = prices[i] - currentBuy;
            currentBuy = Math.min(currentBuy, prices[i]);
            maxProfit = Math.max(maxProfit, currentSell);

        }
        System.out.println("Maximum profit :" + maxProfit);
        in.close();
    }
}
