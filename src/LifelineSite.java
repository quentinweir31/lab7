public class LifelineSite extends Site{
    private int _units;
    private float _rate;
    public LifelineSite(int units, float rate) {
        this._units = units;
        this._rate = rate;
    }
    public double getBillableAmount() {
        double base = _units * _rate * 0.5;
        double tax = base * Site.TAX_RATE * 0.2;
        return base + tax;
    }
}
