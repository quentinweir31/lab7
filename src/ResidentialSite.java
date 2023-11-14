public class ResidentialSite extends Site{
    int _units;
    double _rate;
    double getBillableAmount( double base, double tax) {
        base = _units * _rate;
        tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
