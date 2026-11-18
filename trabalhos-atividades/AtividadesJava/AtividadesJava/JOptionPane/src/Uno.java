import javax.swing.JOptionPane;

public class Uno {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String ano = JOptionPane.showInputDialog("Digite seu ano de nascimento: ");

        int age = (2026 - Integer.parseInt(ano));

        JOptionPane.showMessageDialog(null, "Hola, " + nome + "! Sua idade é " + age);
        int bool = JOptionPane.showConfirmDialog(null, "Deseja encerrar o programa?");
        if (bool == 0) { return; } else { System.out.println("ok?");};



    }
}
