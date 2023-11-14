public class LifelineSite extends Site{
    private static int _units;
    private static float _rate;
    public LifelineSite(int units, float rate) {
        this._units = units;
        this._rate = rate;
    }
    public double getBase() {
        double lifelineBase = _units * _rate * 0.5;
        return lifelineBase;
    }
    public double getTax() {
        double lifelineBase = getBase();
        double tax = lifelineBase * Site.TAX_RATE * 0.2;
        return tax;
    }
}
