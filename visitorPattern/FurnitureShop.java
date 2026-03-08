public class FurnitureShop {

    public static void main(String[] args) {

        FurnitureItem item = new FurnitureItem("Chair",5000);

        ShippingCalculator flat = new FlatRateShipping();
        DistanceShipping distance = new DistanceBasedShipping();

        double distanceKm = 10;

        // Chair
        System.out.println("Shipping for " + item.getFurnitureType() + " : " +
                item.accept(flat,distanceKm) + " Pesos");

        // Table
        item.setFurnitureType("Table");
        item.setSize(12000);

        System.out.println("Shipping for " + item.getFurnitureType() + " : " +
                item.accept(distance,distanceKm) + " Pesos");

        // Sofa
        item.setFurnitureType("Sofa");
        item.setSize(45000);

        System.out.println("Shipping for " + item.getFurnitureType() + " : " +
                item.accept(distance,distanceKm) + " Pesos");

    }

}