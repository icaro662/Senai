package Exercicio01;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String num1, num2;

        num1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
        num2 = JOptionPane.showInputDialog("Digite o segundo número: ");

        int soma = Integer.parseInt(num1) + Integer.parseInt(num2);

        JOptionPane.showMessageDialog(null,
                "A soma de " + num1 + " e " + num2 + " é " + soma
        );
    }
}
