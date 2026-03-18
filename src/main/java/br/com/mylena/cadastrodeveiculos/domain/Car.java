package br.com.mylena.cadastrodeveiculos.domain;

import br.com.mylena.cadastrodeveiculos.domain.shared.Propulsion;

import javax.swing.*;

@Tabela("Car")
@Priority("Média")
public class Car extends MobilityResource {
    @Priority("Baixa")
    private String bodyType;
    private String color;
    private Propulsion propulsionType;
    private int trunkCapacity;
    private Boolean sunroof;

    public Car(String modeInput, String type, String model) {
        super(modeInput, type, model);
    }
    public Car() {
        super();
    }

    @Override
    public void registerSpecificVehicleData() {

        this.bodyType = JOptionPane.showInputDialog("Informe o tipo de carroceria:");

        this.color = JOptionPane.showInputDialog("Informe a cor do veículo:");

        String propulsionInput = JOptionPane.showInputDialog(
                "Informe o tipo de propulsão (GASOLINE, ELECTRIC, HYBRID, DIESEL):"
        );

        this.propulsionType = Propulsion.valueOf(propulsionInput.toUpperCase());

        this.trunkCapacity = Integer.parseInt(
                JOptionPane.showInputDialog("Informe a capacidade do porta-malas:")
        );

        this.sunroof = Boolean.parseBoolean(
                JOptionPane.showInputDialog("O veículo possui teto solar? (true/false)")
        );
    }
}
