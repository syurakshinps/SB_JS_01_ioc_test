package org.example;

public class DeliveryRobotProdLine implements RoboProductionLine {
    @Override
    public void work() {
        System.out.println("new DELIVERY robot build completed");
    }
}
