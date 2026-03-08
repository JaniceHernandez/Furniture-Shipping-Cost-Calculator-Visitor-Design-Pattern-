public interface Furniture {
    double accept(ShippingCostCalculator calculator, double size, double distance);
}