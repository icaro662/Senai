package Exercicio24;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String produtosFabricados, tempoGasto;

        produtosFabricados = JOptionPane.showInputDialog("Digite o número de produtos fabricados: ");
        tempoGasto = JOptionPane.showInputDialog("Digite o tempo de fabricação gasto: ");

        double produtividadeHora = Double.parseDouble(produtosFabricados) / Double.parseDouble(tempoGasto);
        double estimativaTurno = produtividadeHora * 8;

        JOptionPane.showMessageDialog(null,
                "A produtividade por hora da fabricação informada é " + produtividadeHora
                + ", e a estimativa de produtividade num turno de oito horas é " + estimativaTurno
        );
    }
}
