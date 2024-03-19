package com.driver;

import java.util.HashMap;
import java.util.Map;

public class SpoonInventory {
    public Map<String, Spoon> spoonMap;

    public SpoonInventory() {
        this.spoonMap = new HashMap<>();
    }

    public void addSpoonType(String name, int quantity) {
    	//your code goes here
        Spoon spoon = new Spoon(name, quantity);
        spoonMap.put(name, spoon);
        System.out.println(name + " added successfully!");
    }

    public int retrieveSpoonDetails(String name) {
    	//your code goes here
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid spoon name provided.");
        }
        if (spoonMap.containsKey(name)) {
            Spoon spoon = spoonMap.get(name);
            System.out.println(spoon.getName() + " has quantity: " + spoon.getQuantity());
            return spoon.getQuantity();
        } else {
            throw new IllegalArgumentException(name + " not found in inventory!");
        }
    }

    public int computeTotalSpoons() {
    	//your code goes here
        int totalSpoons = 0;
        for (Spoon spoon : spoonMap.values()) {
            totalSpoons += spoon.getQuantity();
        }
        return totalSpoons;
    }
}
