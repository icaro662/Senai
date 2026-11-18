package Exercicio21;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String produto1, preco1, quantidade1,
        produto2, preco2, quantidade2,
        produto3, preco3, quantidade3;

        produto1 = JOptionPane.showInputDialog("Digite o nome do primeiro produto: ");
        preco1 = JOptionPane.showInputDialog("Digite o valor do preço unitário do primeiro produto: ");
        quantidade1 = JOptionPane.showInputDialog("Digite a quantidade do primeiro produto comprada: ");

        produto2 = JOptionPane.showInputDialog("Digite o nome do segundo produto: ");
        preco2 = JOptionPane.showInputDialog("Digite o valor do preço unitário do segundo produto: ");
        quantidade2 = JOptionPane.showInputDialog("Digite a quantidade do segundo produto comprada: ");

        produto3 = JOptionPane.showInputDialog("Digite o nome do terceiro produto: ");
        preco3 = JOptionPane.showInputDialog("Digite o valor do preço unitário do terceiro produto: ");
        quantidade3 = JOptionPane.showInputDialog("Digite a quantidade do terceiro produto comprada: ");


        double valorTotal1 = Double.parseDouble(preco1) * Double.parseDouble(quantidade1);
        double valorTotal2 = Double.parseDouble(preco2) * Double.parseDouble(quantidade2);
        double valorTotal3 = Double.parseDouble(preco3) * Double.parseDouble(quantidade3);

        double valorTotalCompra = valorTotal1 + valorTotal2 + valorTotal3;
        double valorMedioPorProduto = valorTotalCompra / 3;

        JOptionPane.showMessageDialog(null,
                "O valor total por produto é: \n"
                + produto1 + ": " + valorTotal1 + " R$\n"
                + produto2 + ": " + valorTotal2 + " R$\n"
                + produto3 + ": " + valorTotal3 + " R$\n"
                + "O valor total da compra é " + valorTotalCompra + " R$, e o valor médio por produto é aproximadamente " + Math.round(valorMedioPorProduto) + " R$"
        );
    }
}
