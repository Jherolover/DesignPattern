package behavior.VisitorPattern;

/**
 * ÍøÕ¾·ÃÎÊ½Ó¿Ú
 */
public interface SiteVisitor {
    public void visit(GeneralSites generalSites);
    public void visit(BaiduSite baiduSite);
    public void visit(JingdongSite jingdongSite);
    public void visit(TianmaoSite tianmaoSite);

}
