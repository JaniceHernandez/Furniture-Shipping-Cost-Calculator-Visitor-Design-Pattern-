public interface Furniture {
    public double accept(ShippingCalculator calculator, double distance);
    public double accept(DistanceShipping shipping, double distance);

}