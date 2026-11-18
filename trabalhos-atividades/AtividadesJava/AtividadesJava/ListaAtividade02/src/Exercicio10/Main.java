package Exercicio10;
import javax.swing.JOptionPane;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        String idade;

        idade = JOptionPane.showInputDialog("Digite sua idade: ");

        int dias = Integer.parseInt(idade) * 365;

        JOptionPane.showMessageDialog(null,
                "Você viveu aproximadamente " + dias + " dias"
        );
    }
}
