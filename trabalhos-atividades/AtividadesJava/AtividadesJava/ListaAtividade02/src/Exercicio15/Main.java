package Exercicio15;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String conta, pessoas;

        conta = JOptionPane.showInputDialog("Digite o valor total da conta: ");
        pessoas = JOptionPane.showInputDialog("Digite a quantidade de pessoas: ");

        double valorPorPessoa = Double.parseDouble(conta) / Double.parseDouble(pessoas);

        JOptionPane.showMessageDialog(null,
                "A divisão igualitária de " + conta + " para " + pessoas + " é " + valorPorPessoa
        );
    }
}