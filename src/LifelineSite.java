public class LifelineSite extends Site{
    private static int _units;
    private static float _rate;
    public LifelineSite(int units, float rate) {
        this._units = units;
        this._rate = rate;
    }
    public double getBase() {
        double base = _units * _rate * 0.5;
        return base;
    }
    public double getTax() {
        double base = getBase();
        double tax = base * Site.TAX_RATE * 0.2;
        return tax;
    }
}
