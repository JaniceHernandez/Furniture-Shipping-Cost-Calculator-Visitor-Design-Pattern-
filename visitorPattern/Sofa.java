public class Sofa implements Furniture {
    private String model;
    private double size;

    public Sofa(String model, double size) {
        this.model = model;
        this.size = size;
    }

    @Override
    public double accept(ShippingCostCalculator calculator, double size, double distance) {
        this.size = size;
        return calculator.calculateShipping("Sofa", this.size, distance);
    }

    public String getModel() {
        return model;
    }

    public double getSize() {
        return size;
    }
}