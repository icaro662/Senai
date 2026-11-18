package Exercicio04;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String num1, num2, num3;

        num1 = JOptionPane.showInputDialog("Digite a primeira nota: ");
        num2 = JOptionPane.showInputDialog("Digite a segunda nota: ");
        num3 = JOptionPane.showInputDialog("Digite a terceira nota: ");

        double media = (Double.parseDouble(num1) +
                Double.parseDouble(num2) +
                Double.parseDouble(num3)) / 3;

        JOptionPane.showMessageDialog(null, "Sua média é " + media);
    }
}
