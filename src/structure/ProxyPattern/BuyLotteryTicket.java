package structure.ProxyPattern;

/**
 * 购买彩票实现类
 * @author elite
 *
 */
public class BuyLotteryTicket implements LotteryTicket{
    //用户
	private String userName ;

	public BuyLotteryTicket(String userName) {
		this.userName = userName;
	}

	@Override
	public void buy() {
		System.out.println(userName+"去购买彩票....");
	}

}
