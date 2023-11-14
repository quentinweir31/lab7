public class ResidentialSite extends Site{
    private static int _units;
    private static float _rate;
    public ResidentialSite(int units, float rate) {
        this._units = units;
        this._rate = rate;
    }
    public double getBase() {
        double residentialBase = _units * _rate;
        return residentialBase;
    }
    public double getTax() {
        double residentialBase = getBase();
        double tax = residentialBase * Site.TAX_RATE;
        return tax;
    }
}
