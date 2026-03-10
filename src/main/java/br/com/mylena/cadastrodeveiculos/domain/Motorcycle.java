package br.com.mylena.cadastrodeveiculos.domain;

import br.com.mylena.cadastrodeveiculos.domain.shared.Propulsion;

import javax.swing.*;
import java.util.UUID;

@Tabela("Motorcycle")
public class Motorcycle extends MobilityResource {

    private String color;
    private Propulsion propulsionType;
    private String useType;
    private int engineDisplacement;

    public Motorcycle(String modeInput, String type, String model) {
        super(modeInput, type, model);
    }

    @Override
    public void registerSpecificVehicleData() {

        this.color = JOptionPane.showInputDialog("Informe a cor da motocicleta:");

        String propulsionInput = JOptionPane.showInputDialog(
                "Informe o tipo de propulsão (GASOLINE, ELECTRIC, HYBRID):"
        );

        this.propulsionType = Propulsion.valueOf(propulsionInput.toUpperCase());

        this.useType = JOptionPane.showInputDialog(
                "Informe o tipo de uso (ex: street, sport, trail, touring):"
        );

        this.engineDisplacement = Integer.parseInt(
                JOptionPane.showInputDialog("Informe a cilindrada do motor (cc):")
        );
    }
}
