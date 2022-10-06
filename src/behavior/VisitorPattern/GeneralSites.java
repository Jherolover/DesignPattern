package behavior.VisitorPattern;

/**
 * ×ÛºÏÍøÖ·
 */
public class GeneralSites implements Sites{

   Sites[] sites;

    public GeneralSites(Sites[] sites) {
        this.sites = sites;
    }

    @Override
    public void accept(SiteVisitor siteVisitor) {
        for (int i = 0; i < sites.length; i++) {
            sites[i].accept(siteVisitor);
        }
        siteVisitor.visit(this);
    }
}
