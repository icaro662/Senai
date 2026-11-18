package Exercicio05;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String celcius;

        celcius = JOptionPane.showInputDialog("Digite um valor para temperatura em ℃: ");

        double fahres = Math.round((Double.parseDouble(celcius) * ((double)9/5)) + 32);

        JOptionPane.showMessageDialog(null,
                "A conversão de " + celcius + "℃ para Fahrenheint é aproximadamente " + fahres + "℉"
        );
    }
}
