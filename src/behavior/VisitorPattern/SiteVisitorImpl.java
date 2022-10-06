package behavior.VisitorPattern;

public class SiteVisitorImpl implements SiteVisitor{
    @Override
    public void visit(GeneralSites generalSites) {
        System.out.println("访问综合网站");
    }

    @Override
    public void visit(BaiduSite baiduSite) {
        System.out.println("访问百度");
    }

    @Override
    public void visit(JingdongSite jingdongSite) {
        System.out.println("访问京东");
    }

    @Override
    public void visit(TianmaoSite tianmaoSite) {
        System.out.println("访问天猫");
    }
}
