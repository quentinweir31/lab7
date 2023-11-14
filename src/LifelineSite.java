public class LifelineSite extends Site{
    private static int _units;
    private static float _rate;
    public LifelineSite(int units, float rate) {
        this._units = units;
        this._rate = rate;
    }
    public double getBillableAmount() {
        double base = getBase();
        double tax = getTax(base);
        return base + tax;
    }

    private static double getTax(double base) {
        double tax = base * Site.TAX_RATE * 0.2;
        return tax;
    }

    private static double getBase() {
        double base = _units * _rate * 0.5;
        return base;
    }
}
