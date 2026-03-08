public class FurnitureShop {
    public static void main(String[] args) {
        Chair chair = new Chair("Chair", 5000.0); //In cubic centimeters (cm³)
        Sofa sofa = new Sofa("Sofa", 45000.0);
        Table table = new Table("Table", 12000.0);

        ShippingCostCalculator flatRate = new FlatRateShipping();
        ShippingCostCalculator distanceShipping = new DistanceBasedShipping();

        double distance = 10.0; // Distance in kilometers

        System.out.println("=== Flat Rate Shipping ===");
        System.out.println(chair.getModel() + " shipping cost: " + chair.accept(flatRate, chair.getSize(), distance) + " Pesos");
        System.out.println(sofa.getModel() + " shipping cost: " + sofa.accept(flatRate, sofa.getSize(), distance) + " Pesos");
        System.out.println(table.getModel() + " shipping cost: " + table.accept(flatRate, table.getSize(), distance) + " Pesos");

        System.out.println("\n=== Distance Based Shipping ===");
        System.out.println(chair.getModel() + " shipping cost: " + chair.accept(distanceShipping, chair.getSize(), distance) + " Pesos");
        System.out.println(sofa.getModel() + " shipping cost: " + sofa.accept(distanceShipping, sofa.getSize(), distance) + " Pesos");
        System.out.println(table.getModel() + " shipping cost: " + table.accept(distanceShipping, table.getSize(), distance) + " Pesos");
    }
}