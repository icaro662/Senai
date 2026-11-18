package Exercicio18;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
	String a, b, c;

	a = JOptionPane.showInputDialog("Digite o valor de a: ");
	b = JOptionPane.showInputDialog("Digite o valor de b: ");
	c = JOptionPane.showInputDialog("Digite o valor de c: ");

	double delta = Math.pow(Double.parseDouble(b), 2) - 4 * (Double.parseDouble(a) * Double.parseDouble(c));

	JOptionPane.showMessageDialog(null,
		"O valor de delta é " + delta
	);
    }
}
