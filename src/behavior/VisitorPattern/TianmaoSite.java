package behavior.VisitorPattern;

public class TianmaoSite implements Sites{

    @Override
    public void accept(SiteVisitor siteVisitor) {
        siteVisitor.visit(this);
    }
}
