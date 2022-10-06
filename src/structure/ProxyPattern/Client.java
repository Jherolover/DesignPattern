package structure.ProxyPattern;
/**
 * ≤‚ ‘¿‡
 * @author elite
 */
public class Client {
	public static void main(String[] args) {
		
		BuyLotteryTicket buyLotteryTicket = new BuyLotteryTicket("’≈»˝");
		ProxyBuyLotteryTicket proxy = new ProxyBuyLotteryTicket(buyLotteryTicket);
		proxy.buy();
	}
}
