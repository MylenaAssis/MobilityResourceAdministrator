package br.com.mylena.cadastrodeveiculos.domain;

public class VehicleFactory {

    public static MobilityResource create(String mode, String type, String model) {

        switch (type.toLowerCase()) {

            case "car":
                return new Car(mode, type, model);

            case "truck":
                return new Truck(mode, type, model);

            case "motorcycle":
                return new Motorcycle(mode, type, model);

            case "bicycle":
                return new Bicycle(mode, type, model);

            case "boat":
                return new Boat(mode, type, model);

            default:
                throw new IllegalArgumentException("Tipo de veículo inválido: " + type);
        }
    }
}
