public class buy_sell_stock {
    public static void buy_sell(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit=prices[i]-buyPrice;//today's profit
                maxProfit=Math.max(maxProfit, profit);
            }else{
                buyPrice=prices[i];

            }
        }
        System.out.println("Maximum Profit: "+maxProfit);
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        buy_sell(prices);
    }
}
