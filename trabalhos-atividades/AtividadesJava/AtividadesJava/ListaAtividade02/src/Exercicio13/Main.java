package Exercicio13;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String distancia, tempo;

        distancia = JOptionPane.showInputDialog("Digite a distância percorrida em quilômetros: ");
        tempo = JOptionPane.showInputDialog("Digite o tempo gasto em horas: ");

        double velocidade = Double.parseDouble(distancia) / Double.parseDouble(tempo);

        JOptionPane.showMessageDialog(null,
                "A velocidade média é " + velocidade
        );
    }
}