package Exercicio09;
import javax.swing.JOptionPane;

public class Main  {
    public static void main(String[] args) {
        String comprimento, largura;

        comprimento = JOptionPane.showInputDialog("Digite o comprimento: ");
        largura = JOptionPane.showInputDialog("Digite a largura: ");

        double area = Double.parseDouble(comprimento) * Double.parseDouble(largura);

        JOptionPane.showMessageDialog(null,
                "A área total em metros quadrados do terreno é " + area
        );
    }
}
