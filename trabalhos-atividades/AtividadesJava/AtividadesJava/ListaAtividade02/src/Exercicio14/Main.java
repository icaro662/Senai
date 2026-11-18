package Exercicio14;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String capital, taxa, meses;

        capital = JOptionPane.showInputDialog("Digite o capital inicial: ");
        taxa = JOptionPane.showInputDialog("Digite a taxa de juros mensal: ");
        meses = JOptionPane.showInputDialog("Digite a quantidade de meses: ");

        double juros = Double.parseDouble(capital) * (Double.parseDouble(taxa) / 100) * Double.parseDouble(meses);
        double montante = Double.parseDouble(capital) + juros;

        JOptionPane.showMessageDialog(null,
                "O juros e o montante final são, respectivamente, " + juros + " e " + montante
        );
    }
}