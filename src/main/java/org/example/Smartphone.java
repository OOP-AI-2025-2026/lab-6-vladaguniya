package org.example;

public class Smartphone implements GPS, Cellular {

    private String model;

    public Smartphone(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public double[] getCoordinates() {
        return new double[] {57.9825, 43.7539};  // Умовні координати
    }

    @Override
    public void makeCall() {
        System.out.println(model + ": Виклик");
    }

    @Override
    public void receiveCall() {
        System.out.println(model + ": Прийом дзвінка");
    }
}
