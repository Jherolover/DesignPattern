package behavior.VisitorPattern;

public class JingdongSite implements Sites{
    @Override
    public void accept(SiteVisitor siteVisitor) {
        siteVisitor.visit(this);
    }
}
