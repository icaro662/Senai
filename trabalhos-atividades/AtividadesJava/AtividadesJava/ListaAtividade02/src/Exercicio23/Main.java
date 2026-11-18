package Exercicio23;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String potenciaWatts, horasDiaria, diasUso;

        potenciaWatts = JOptionPane.showInputDialog("Digite a potência do equipamento em watts: ");
        horasDiaria = JOptionPane.showInputDialog("Digite as horas em utilização por dia: ");
        diasUso = JOptionPane.showInputDialog("Digite a quantidade de dias em uso: ");

        double kWh = (Double.parseDouble(potenciaWatts) * Double.parseDouble(horasDiaria) * Double.parseDouble(diasUso)) / 1000;

        JOptionPane.showMessageDialog(null,
                "O consumo total em kilowatts por hora é de " + kWh
        );
    }
}
