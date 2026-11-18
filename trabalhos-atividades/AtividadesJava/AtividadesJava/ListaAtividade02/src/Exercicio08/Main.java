package Exercicio08;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String distancia, combustivel;

        distancia = JOptionPane.showInputDialog("Digite a distância percorrida: ");
        combustivel = JOptionPane.showInputDialog("Digite a quantidade de combustível consumido em litros: ");

        double consumo = Double.parseDouble(distancia) / Double.parseDouble(combustivel);

        JOptionPane.showMessageDialog(null,
                "O consumo médio em km/l é " + consumo
            );
    }
}
