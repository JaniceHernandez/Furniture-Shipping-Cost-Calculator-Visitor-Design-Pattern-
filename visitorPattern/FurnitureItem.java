public class FurnitureItem implements Furniture {

    private String furnitureType;
    private double size;

    public FurnitureItem(String furnitureType, double size) {
        this.furnitureType = furnitureType;
        this.size = size;
    }

    @Override
    public double accept(ShippingCalculator calculator, double distance) {
        return calculator.computeShipping(furnitureType, size, distance);
    }

    @Override
    public double accept(DistanceShipping shipping, double distance) {
        return shipping.computeDistanceShipping(furnitureType, size, distance);
    }

    public void setFurnitureType(String furnitureType) {
        this.furnitureType = furnitureType;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    public double getSize() {
        return size;
    }
}