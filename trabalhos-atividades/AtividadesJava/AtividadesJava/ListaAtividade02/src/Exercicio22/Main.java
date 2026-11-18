package Exercicio22;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String brl, cotacaoUSD;

        brl = JOptionPane.showInputDialog("Digite o valor em reais: ");
        cotacaoUSD = JOptionPane.showInputDialog("Digite a cotação do dólar: ");

        double conversao = Double.parseDouble(cotacaoUSD) * Double.parseDouble(brl) ;

        JOptionPane.showMessageDialog(null,
                "O valor convertido de " + brl + " para USD é " + conversao
        );
    }
}
