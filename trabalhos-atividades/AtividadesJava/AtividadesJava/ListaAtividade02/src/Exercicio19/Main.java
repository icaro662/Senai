package Exercicio19;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		String peso, altura;

		peso = JOptionPane.showInputDialog("Digite seu peso em quilogramas: ");
		altura = JOptionPane.showInputDialog("Digite sua altura em metros: ");

		double imc = Double.parseDouble(peso) / Math.pow(Double.parseDouble(altura), 2);

		JOptionPane.showMessageDialog(null,
			"Seu IMC númerico é de " + imc
		);
	}
}
