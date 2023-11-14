public class ResidentialSite extends Site{
    int _units;
    float _rate;
    public ResidentialSite(int units, float rate) {
        this._units = units;
        this._rate = rate;
    }
    public double getBillableAmount( double base, double tax) {
        base = _units * _rate;
        tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
