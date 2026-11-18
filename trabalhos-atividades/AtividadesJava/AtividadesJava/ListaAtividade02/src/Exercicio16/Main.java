package Exercicio16;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String horas;

        horas = JOptionPane.showInputDialog("Digite a quantidade de horas: ");

        double minutos = Double.parseDouble(horas) * 60 ;
        double segundos = minutos * 60;
        double dias = Double.parseDouble(horas) / 24;

        JOptionPane.showMessageDialog(null,
                "Em " + horas + ", temos " + minutos + " minutos, " + segundos + " segundos, " + dias + " dia(s)"
        );
    }
}