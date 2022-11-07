package common;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

// Represents a single exercise in the gym
public class Exercise {
    private final MachineType machine; // Stores the type of machine used in the exercise
    private final Map<Weight, Integer> weight; // Stores how many weights this exercise uses
    private final int duration; // Stores how long the exercise lasts

    // Creates a random exercise
    public Exercise() {
        this.machine = MachineType.getRandomEquipment();
        Map<Weight, Integer> weightSet = new HashMap<>();
        weightSet.put(Weight.SMALL_5LBS, 0);
        weightSet.put(Weight.MEDIUM_10LBS, 0);
        weightSet.put(Weight.LARGE_25LBS, 0);
        for (int i = 0; i < 10; i++) {
            Weight randPlate = Weight.getRandomWeight();
            int rand = new Random().nextInt(4);
            if (rand < 3) {
                weightSet.replace(randPlate, weightSet.get(randPlate) + 1);
            }
        }
        this.weight = weightSet;
        this.duration = 1000 + new Random().nextInt(2000);
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        int totalWeight = (this.weight.get(Weight.SMALL_5LBS) * 5)
                + (this.weight.get(Weight.MEDIUM_10LBS) * 10)
                + (this.weight.get(Weight.LARGE_25LBS) * 25);
        String weightsMessage = totalWeight + " lbs of total weight consisting of "
                + this.weight.get(Weight.SMALL_5LBS) + " x 5 lbs weights, "
                + this.weight.get(Weight.MEDIUM_10LBS) + " x 10 lbs weights, "
                + this.weight.get(Weight.LARGE_25LBS) + " x 25 lbs weights.";
        return this.machine.machineName + " with " + weightsMessage + "\n";
    }
}