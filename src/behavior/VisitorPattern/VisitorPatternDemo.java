package behavior.VisitorPattern;

public class VisitorPatternDemo {
    public static void main(String[] args) {

        //�ۺ���վ
        GeneralSites generalSites = new GeneralSites(new Sites[]{new BaiduSite(),new JingdongSite(),new TianmaoSite()});
        generalSites.accept(new SiteVisitorImpl());

    }
}
