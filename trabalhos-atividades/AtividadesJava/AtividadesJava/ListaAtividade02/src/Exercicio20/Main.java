package Exercicio20;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		String distancia, consumo, preco;

		distancia = JOptionPane.showInputDialog("Digite a distância da viagem em quilômetros: ");
		consumo = JOptionPane.showInputDialog("Digite o consumo médio do veículo em km/l: ");
		preco = JOptionPane.showInputDialog("Digite o preço do litro do combustível: ");

		double litrosNecessarios = Double.parseDouble(distancia) / Double.parseDouble(consumo);
		double custoTotal = litrosNecessarios * Double.parseDouble(preco);
		double custoPorKm = custoTotal / litrosNecessarios;

		JOptionPane.showMessageDialog(null,
			"Para a viagem, os litros necessários são " + litrosNecessarios + ", o custo total é " + custoTotal + ", e o custo por km é " + custoPorKm
		);
	}
}
