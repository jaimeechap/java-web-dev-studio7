package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {

    private String name;
    private int storageCapacity;
    private int remainingCapacity;
    private int capacityUsed;
    private String discType;
    private ArrayList<String> contents;

    public BaseDisc(String name, int storageCapacity, int capacityUsed, String discType) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.remainingCapacity = spaceLeft();
        this.capacityUsed = capacityUsed;
        this.discType = discType;
    }

    private int checkCapacity(int dataWritten) {
        if (storageCapacity < dataWritten) {
            return storageCapacity;
        }
        return dataWritten;
    }

    private int spaceLeft() {
        return storageCapacity - capacityUsed;
    }

    public String discInfo() {
        String output = String.format("\nDisk name: %s\nMax capacity: %d" + "\nSpace used: %d" + "\nAvailable space: %d\n",
                name, storageCapacity, capacityUsed, remainingCapacity);
        return output;
    }

    public String writeData(int dataSize) {
        if (dataSize > remainingCapacity) {
            return "Not enough space!";
        }
        capacityUsed += dataSize;
        remainingCapacity -= dataSize;
        return "Data successfully written to disc. Remaining space equals " + remainingCapacity;
    }


}
