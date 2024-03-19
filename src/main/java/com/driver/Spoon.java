package com.driver;

public class Spoon {
    private String name;
    private int quantity;

    public Spoon(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
    	//your code goes here
        return name;
    }

    public int getQuantity() {
    	//your code goes here
        return quantity;
    }

    public void setQuantity(int quantity) {
    	//your code goes here
        this.quantity = quantity;
    }
}
