package structure.ProxyPattern;

/**
 * �����Ʊʵ����
 * @author elite
 *
 */
public class BuyLotteryTicket implements LotteryTicket{
    //�û�
	private String userName ;

	public BuyLotteryTicket(String userName) {
		this.userName = userName;
	}

	@Override
	public void buy() {
		System.out.println(userName+"ȥ�����Ʊ....");
	}

}
