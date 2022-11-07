package common;

import java.util.Random;

// Enum of all gym equipment
public enum MachineType {
    LEGPRESSMACHINE("Leg Press"),
    BARBELL("Bar Bells"),
    SQUATMACHINE("Squat Machine"),
    LEGEXTENSIONMACHINE("Leg Extensions"),
    LEGCURLMACHINE("Leg Curls"),
    LATPULLDOWNMACHINE("Lat Pull Downs"),
    PECDECKMACHINE("Pec Deck Machine"),
    CABLECROSSOVERMACHINE("Cable Crossovers");

    public final String machineName;

    MachineType(String machineName) {
        this.machineName = machineName;
    }

    // Returns a random piece of gym equipment
    public static MachineType getRandomEquipment() {
        return MachineType.values()[new Random().nextInt(MachineType.values().length)];
    }
}