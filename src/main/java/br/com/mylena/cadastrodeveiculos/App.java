package br.com.mylena.cadastrodeveiculos;

import br.com.mylena.cadastrodeveiculos.dao.IMobilityResourceDAO;
import br.com.mylena.cadastrodeveiculos.dao.MobilityResourceDAO;
import br.com.mylena.cadastrodeveiculos.domain.MobilityResource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

import static org.springframework.boot.SpringApplication.exit;

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
                        "separados por vírgula. Ex: Modo,Nome", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
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
        String[] splitData = data.split(",", -1); // -1 mantém campos vazios no final
        int expectedFields = 2;
        String[] resultData = new String[expectedFields];

        for (int i = 0; i < expectedFields; i++) {
            if (i < splitData.length && !splitData[i].isBlank()) {
                resultData[i] = splitData[i];
            } else {
                resultData[i] = null;
            }
        }

        MobilityResource client = new MobilityResource(
                resultData[0],
                resultData[1]
        );

        Boolean registered = iClientDAO.register(client);

        if (registered) {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso.", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "O CPF é obrigatório.", "ERRO DE CADASTRO", JOptionPane.ERROR_MESSAGE);
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
