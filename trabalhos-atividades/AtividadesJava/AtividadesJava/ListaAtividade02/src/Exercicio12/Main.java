package Exercicio12;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String largura, comprimento;

        largura = JOptionPane.showInputDialog("Digite a largura do terreno: ");
        comprimento = JOptionPane.showInputDialog("Digite o comprimento do terreno: ");

        double perimetro = 2 * (Double.parseDouble(largura) + Double.parseDouble(comprimento));

        JOptionPane.showMessageDialog(null,
                "O valor do perímetro do terreno é " + perimetro
        );
    }
}