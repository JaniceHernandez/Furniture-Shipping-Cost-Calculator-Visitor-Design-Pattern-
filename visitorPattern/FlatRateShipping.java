import java.util.HashMap;
import java.util.Map;

public class FlatRateShipping implements ShippingCostCalculator {

    private static Map<String, Double> flatRateMap = new HashMap<>();
    private static final double SIZE_THRESHOLD = 10000.0;

    static {
        flatRateMap.put("Chair", 150.0);   
        flatRateMap.put("Table", 200.0);    
        flatRateMap.put("Sofa", 300.0);   
    }

    @Override
    public double calculateShipping(String furnitureType, double size, double distance) {
        if (size <= SIZE_THRESHOLD) {
            return flatRateMap.getOrDefault(furnitureType, 0.0);
        }
        return 0.0;
    }
}