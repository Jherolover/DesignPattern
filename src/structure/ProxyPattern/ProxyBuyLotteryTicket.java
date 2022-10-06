package structure.ProxyPattern;
/**
 * ´úÀí¹ºÂò²ÊÆ±
 * @author elite
 *
 */
public class ProxyBuyLotteryTicket implements LotteryTicket{

	private LotteryTicket lotteryTicket;

	public ProxyBuyLotteryTicket(LotteryTicket lotteryTicket) {
		this.lotteryTicket = lotteryTicket;
	}
	@Override
	public void buy() {
		lotteryTicket.buy();
	}
}
