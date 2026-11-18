package Exercicio06;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String preco, desconto;

        preco = JOptionPane.showInputDialog("Digite o preço do produto: ");
        desconto = JOptionPane.showInputDialog("Digite o desconto a ser aplicado em porcentagem: ");

        double precoFinal = Double.parseDouble(preco) * (Double.parseDouble(desconto) / 100);

        JOptionPane.showMessageDialog(null,
                "O preço final do produto após " + desconto + "% de desconto é " + precoFinal
        );
    }
}
