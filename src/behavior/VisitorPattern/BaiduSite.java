package behavior.VisitorPattern;

public class BaiduSite implements Sites{
    @Override
    public void accept(SiteVisitor siteVisitor) {
        siteVisitor.visit(this);
    }
}
