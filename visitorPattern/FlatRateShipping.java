import java.util.*;

public class FlatRateShipping implements ShippingCalculator {

    private static Map<String, Double> flatRateMap = new HashMap<>();
    private static final double sizeThreshold = 10000.0;

    static {

        flatRateMap.put("Chair", 150.0);
        flatRateMap.put("Table", 300.0);
        flatRateMap.put("Sofa", 500.0);

    }

    @Override
    public double computeShipping(String furnitureType, double size, double distance) {

        if(size <= sizeThreshold){

            return flatRateMap.getOrDefault(furnitureType,0.0);

        }

        return 0.0;
    }

}