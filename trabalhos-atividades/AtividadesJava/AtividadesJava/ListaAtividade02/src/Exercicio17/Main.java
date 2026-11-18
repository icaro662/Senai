package Exercicio17;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String valorInicial;

        valorInicial = JOptionPane.showInputDialog("Digite um valor inteiro múltiplo de 5: ");

        int valor = Integer.parseInt(valorInicial);

        int cem = valor / 100;
        valor %= 100;

        int cinquenta = valor / 50;
        valor %= 50;

        int vinte = valor / 20;
        valor %= 20;

        int dez = valor / 10;
        valor %= 10;

        int cinco = valor / 5;

        JOptionPane.showMessageDialog(null,
               "A distribuição de notas para o valor de " + valorInicial + " é: \n"
               + cem + " nota(s) de cem \n"
               + cinquenta + " notas(s) de cinquenta \n"
               + vinte + " notas(s) de vinte \n"
               + dez + " notas(s) de dez \n"
               + cinco + " notas(s) de cinco \n"
        );
    }
}