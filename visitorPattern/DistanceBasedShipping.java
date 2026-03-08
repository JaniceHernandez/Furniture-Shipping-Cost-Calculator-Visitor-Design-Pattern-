import java.util.*;

public class DistanceBasedShipping implements DistanceShipping {

    private static Map<String, Double> distanceRateMap = new HashMap<>();
    private static final double sizeThreshold = 10000.0;
    private static final double baseFee = 100.0;

    static {

        distanceRateMap.put("Chair", 5.0);
        distanceRateMap.put("Table", 8.0);
        distanceRateMap.put("Sofa", 12.0);

    }

    @Override
    public double computeDistanceShipping(String furnitureType, double size, double distance) {

        if(size > sizeThreshold){

            double rate = distanceRateMap.getOrDefault(furnitureType,0.0);

            return baseFee + (distance * rate);

        }

        return 0.0;
    }

}