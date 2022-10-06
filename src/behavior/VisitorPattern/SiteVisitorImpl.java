package behavior.VisitorPattern;

public class SiteVisitorImpl implements SiteVisitor{
    @Override
    public void visit(GeneralSites generalSites) {
        System.out.println("�����ۺ���վ");
    }

    @Override
    public void visit(BaiduSite baiduSite) {
        System.out.println("���ʰٶ�");
    }

    @Override
    public void visit(JingdongSite jingdongSite) {
        System.out.println("���ʾ���");
    }

    @Override
    public void visit(TianmaoSite tianmaoSite) {
        System.out.println("������è");
    }
}
