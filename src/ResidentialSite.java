public class ResidentialSite extends Site{
    private static int _units;
    private static float _rate;
    public ResidentialSite(int units, float rate) {
        this._units = units;
        this._rate = rate;
    }
    public double getBase() {
        double base = _units * _rate;
        return base;
    }
    public double getTax() {
        double base = getBase();
        double tax = base * Site.TAX_RATE;
        return tax;
    }
}
