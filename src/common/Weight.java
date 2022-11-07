package common;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

// Enum to account for the size and number all the weights in the gym.
public enum Weight {
    SMALL_5LBS,
    MEDIUM_10LBS,
    LARGE_25LBS;

    static final Map<Weight, Integer> numOfWeightsInGym = new HashMap<>();

    static {
        numOfWeightsInGym.put(SMALL_5LBS, 110);
        numOfWeightsInGym.put(MEDIUM_10LBS, 90);
        numOfWeightsInGym.put(LARGE_25LBS, 75);
    }

    // Returns a random weight size
    public static Weight getRandomWeight() {
        return Weight.values()[new Random().nextInt(Weight.values().length)];
    }
}