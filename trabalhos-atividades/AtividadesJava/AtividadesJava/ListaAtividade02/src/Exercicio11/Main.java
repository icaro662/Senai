package Exercicio11;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double pi = 3.14159;
        String raio;

        raio = JOptionPane.showInputDialog("Digite a área do círculo: ");

        double area = pi * Math.pow(Double.parseDouble(raio), 2);

        JOptionPane.showMessageDialog(null,
                "A área do círculo é " + area
        );
    }
}
