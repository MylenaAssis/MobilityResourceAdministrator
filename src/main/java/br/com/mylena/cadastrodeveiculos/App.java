package br.com.mylena.cadastrodeveiculos;

import br.com.mylena.cadastrodeveiculos.dao.IMobilityResourceDAO;
import br.com.mylena.cadastrodeveiculos.dao.MobilityResourceDAO;
import br.com.mylena.cadastrodeveiculos.domain.MobilityResource;
import br.com.mylena.cadastrodeveiculos.domain.VehicleFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class App {
    private static IMobilityResourceDAO iMobilityResourceDAO;

    public static void main(String[] args) {

        iMobilityResourceDAO = new MobilityResourceDAO();

        String option = JOptionPane.showInputDialog(
                null, "Digite 1 para cadastro, 2 para deletar ou 3 para sair.", "Menu",
                JOptionPane.INFORMATION_MESSAGE
        );

        if (option == null) {
            exit();
        }

        while (!isValidOption(option)) {
            if ("".equals(option)) {
                exit();
            } else {
                option = JOptionPane.showInputDialog(null, "Opção inválida. Digite 1 para cadastro, 2 para deletar ou 3 para sair.", "Menu", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        while (isValidOption(option)) {
            if (isExitOption(option)) {
                exit();
            } else if (isRegister(option)) {
                String data = JOptionPane.showInputDialog(null, "Digite os dados do meio de transporte" +
                        "separados por vírgula. Ex: Modal,tipo,modelo", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                Register(data);
            }
        }
    }

    private static boolean isRegister(String option) {
        if ("1".equals(option)) {
            return true;
        }
        return false;
    }

    private static boolean isExitOption(String option) {
        if ("3".equals(option)) {
            return true;
        }
        return false;
    }

    private static void Register(String data) {

        String[] splitData = data.split(",", -1);
        int expectedFields = 3;
        String[] resultData = new String[expectedFields];

        for (int i = 0; i < expectedFields; i++) {
            if (i < splitData.length && !splitData[i].isBlank()) {
                resultData[i] = splitData[i].trim();
            } else {
                resultData[i] = null;
            }
        }

        try {

            MobilityResource mobilityResource =
                    VehicleFactory.create(
                            resultData[0],
                            resultData[1],
                            resultData[2]
                    );

            // dados específicos do tipo de veiculo
            mobilityResource.registerSpecificVehicleData();

            Boolean registered = iMobilityResourceDAO.register(mobilityResource);

            if (registered) {
                JOptionPane.showMessageDialog(
                        null,
                        "Meio de transporte cadastrado com sucesso.",
                        "SUCESSO",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Falha no registro.",
                        "ERRO DE CADASTRO",
                        JOptionPane.ERROR_MESSAGE
                );
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Erro no cadastro: " + e.getMessage(),
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    private static void exit() {
        JOptionPane.showMessageDialog(null, "Até logo!", "Sair", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isValidOption(String option) {
        if ("1".equals(option)) {
            return true;
        } else if ("2".equals(option)) {
            return true;
        }
        return false;
    }
}
