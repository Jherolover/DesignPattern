package behavior.StatePattern;

import java.math.BigDecimal;

public class Client {

    public static void main(String[] args) {

       MemberCardInfo memberCardInfo = new MemberCardInfo(new BasicCard(),0);
       memberCardInfo.doBalance(new BigDecimal("100.0"));

       memberCardInfo = new MemberCardInfo(new BasicCard(),850);
        memberCardInfo.doBalance(new BigDecimal("100.0"));

    }

}
