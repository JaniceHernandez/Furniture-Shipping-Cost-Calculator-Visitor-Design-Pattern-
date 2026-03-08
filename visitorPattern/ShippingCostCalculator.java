public interface ShippingCostCalculator {
    double calculateShipping(String furnitureType, double size, double distance);
}