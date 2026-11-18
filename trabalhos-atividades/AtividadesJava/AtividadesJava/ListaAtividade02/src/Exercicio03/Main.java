package Exercicio03;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog("Digite um número inteiro: ");

        double dobro = Double.parseDouble(num) * 2;
        double triplo = Double.parseDouble(num) * 3;
        double quadrado = Math.pow(Double.parseDouble(num), 2.0);
        double cubo = Math.pow(Double.parseDouble(num), 3.0);

        JOptionPane.showMessageDialog(null,
                "O dobro de " + num + " é " + dobro + "\n"
                + "O triplo de " + num + " é " + triplo + "\n"
                + "O quadrado de " + num + " é " + quadrado + "\n"
                + "O cubo de " + num + " é " + cubo
        );
    }
}
