public class Site {
    public static final double TAX_RATE = 0.05;
    private static int _units;
    private static float _rate;
    ResidentialSite resSite;
    LifelineSite lifelineSite;
    public Site(int units, float rate) {
        this._units = units;
        this._rate = rate;
        resSite = new ResidentialSite(units, rate);
        lifelineSite = new LifelineSite(units, rate);
    }
    private double getBillableAmount() {
        return getBaseAmount() + getTaxAmount();
    }
    private double getBaseAmount() {
        return resSite.getBase() + lifelineSite.getBase();
    }
    private double getTaxAmount() {
        return resSite.getTax() + lifelineSite.getTax();
    }
}
