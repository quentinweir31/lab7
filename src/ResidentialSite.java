public class ResidentialSite extends Site{
    private int _units;
    private float _rate;
    public ResidentialSite(int units, float rate) {
        this._units = units;
        this._rate = rate;
    }
    public double getBillableAmount() {
        double base = getBase();
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
    private double getBase() {
        double base = _units * _rate;
        return base;
    }
}
