package br.com.mylena.cadastrodeveiculos.domain;

import javax.swing.*;
@Tabela("Bicycle")
public class Bicycle extends MobilityResource {
    private String model;
    private String color;
    private String bikeType;

    private Boolean hasGears;

    public Bicycle(String modeInput, String type, String model) {
        super(modeInput, type, model);
    }

    @Override
    public void registerSpecificVehicleData() {
        this.color = JOptionPane.showInputDialog("Color:");
        this.bikeType = JOptionPane.showInputDialog("Bike type:");
        this.hasGears = Boolean.parseBoolean(
                JOptionPane.showInputDialog("Has gears? true/false")
        );
    }
}
