package br.com.mylena.cadastrodeveiculos.domain;

import br.com.mylena.cadastrodeveiculos.domain.shared.Propulsion;

import javax.swing.*;
import java.util.UUID;

public class Boat extends MobilityResource {

    private String color;
    private Propulsion propulsionType;
    private String hullType;
    private double length;

    public Boat(String modeInput, String type, String model) {
        super(modeInput, type, model);
    }

    @Override
    public void registerSpecificVehicleData() {

        this.color = JOptionPane.showInputDialog("Informe a cor da embarcação:");

        String propulsionInput = JOptionPane.showInputDialog(
                "Informe o tipo de propulsão (GASOLINE, DIESEL, ELECTRIC, HYBRID):"
        );

        this.propulsionType = Propulsion.valueOf(propulsionInput.toUpperCase());

        this.hullType = JOptionPane.showInputDialog(
                "Informe o tipo de casco (ex: displacement, planing, catamaran):"
        );

        this.length = Double.parseDouble(
                JOptionPane.showInputDialog("Informe o comprimento da embarcação (metros):")
        );
    }
}
