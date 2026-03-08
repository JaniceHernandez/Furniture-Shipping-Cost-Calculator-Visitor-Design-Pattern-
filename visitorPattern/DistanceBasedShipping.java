import java.util.HashMap;
import java.util.Map;

public class DistanceBasedShipping implements ShippingCostCalculator {

    private static Map<String, Double> distanceRateMap = new HashMap<>();
    private static final double SIZE_THRESHOLD = 10000.0;
    private static final double BASE_FEE = 100.0;

    static {
        distanceRateMap.put("Sofa", 12.0);   // ₱12 per km
        distanceRateMap.put("Table", 8.0);   // ₱8 per km
        distanceRateMap.put("Chair", 5.0);   // ₱5 per km
    }

    @Override
    public double calculateShipping(String furnitureType, double size, double distance) {

        if (size <= SIZE_THRESHOLD) {
            return 0.0; 
        }

        double rate = distanceRateMap.getOrDefault(furnitureType, 0.0);

        return BASE_FEE + (distance * rate);
    }
}