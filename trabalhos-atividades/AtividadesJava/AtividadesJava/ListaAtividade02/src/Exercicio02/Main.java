package Exercicio02;
import javax.swing.JOptionPane;

public class  Main {
    public static void main(String[] args) {
        String num1, num2;

        num1 = JOptionPane.showInputDialog("Digite o primeiro número inteiro: ");
        num2 = JOptionPane.showInputDialog("Digite o segundo inteiro: ");

        int soma = Integer.parseInt(num1) + Integer.parseInt(num2);
        int subtracao = Integer.parseInt(num1) - Integer.parseInt(num2);
        double multiplicacao = Math.round(Double.parseDouble(num1) * Double.parseDouble(num2));
        double divisao = Double.parseDouble(num1) / Double.parseDouble(num2);

        JOptionPane.showMessageDialog(null,
                "A soma de " + num1 + " e " + num2 + " é " + soma + "\n"
                + "A subtração de " + num1 + " e " + num2 + " é " + subtracao + "\n"
                + "A multiplicação de " + num1 + " e " + num2 + " é " + multiplicacao + "\n"
                + "A divisão de " + num1 + " e " + num2 + " é " + divisao
        );
    }
}