package br.com.mylena.cadastrodeveiculos.domain;

import br.com.mylena.cadastrodeveiculos.domain.shared.Propulsion;

import javax.swing.*;
import java.util.UUID;

public class Truck extends MobilityResource {

    private String color;
    private Propulsion propulsionType;
    private int loadCapacity;
    private int axles;

    public Truck(String modeInput, String type, String model) {
        super(modeInput, type, model);
    }

    @Override
    public void registerSpecificVehicleData() {

        this.color = JOptionPane.showInputDialog("Informe a cor do caminhão:");

        String propulsionInput = JOptionPane.showInputDialog(
                "Informe o tipo de propulsão (GASOLINE, DIESEL, ELECTRIC, HYBRID):"
        );

        this.propulsionType = Propulsion.valueOf(propulsionInput.toUpperCase());

        this.loadCapacity = Integer.parseInt(
                JOptionPane.showInputDialog("Informe a capacidade de carga (kg):")
        );

        this.axles = Integer.parseInt(
                JOptionPane.showInputDialog("Informe a quantidade de eixos:")
        );
    }
}
