public class Table implements Furniture {
    private String model;
    private double size;

    public Table(String model, double size) {
        this.model = model;
        this.size = size;
    }

    @Override
    public double accept(ShippingCostCalculator calculator, double size, double distance) {
        this.size = size;
        return calculator.calculateShipping("Table", this.size, distance);
    }

    public String getModel() {
        return model;
    }

    public double getSize() {
        return size;
    }
}