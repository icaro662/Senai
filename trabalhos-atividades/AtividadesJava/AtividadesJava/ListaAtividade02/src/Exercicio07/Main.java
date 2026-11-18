package Exercicio07;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String salario, aumento;

        salario = JOptionPane.showInputDialog("Digite o valor do salário atual: ");
        aumento = JOptionPane.showInputDialog("Digite o aumento a ser aplicado em porcentagem: ");

        double salarioFinal = Double.parseDouble(salario) + (Double.parseDouble(salario) * (Double.parseDouble(aumento) / 100));

        JOptionPane.showMessageDialog(null,
                "O novo salário após " + aumento + "% de aumento é " + salarioFinal
        );
    }
}