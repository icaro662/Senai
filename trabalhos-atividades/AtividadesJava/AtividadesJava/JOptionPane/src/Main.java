import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String nome;
        String idade;
        String nota1;
        String nota2;
        String nota3;

        JOptionPane.showMessageDialog(null, "Hola! Digite suas informações a seguir.");

        nome = JOptionPane.showInputDialog("Nome: ");
        idade = JOptionPane.showInputDialog("Idade: ");
        nota1 = JOptionPane.showInputDialog("Primeira nota: ");
        nota2 = JOptionPane.showInputDialog("Segunda nota: ");
        nota3 = JOptionPane.showInputDialog("Terceira nota: ");

        int age = Integer.parseInt(idade);
        double uno = Double.parseDouble(nota1);
        double dos = Double.parseDouble(nota2);
        double tres = Double.parseDouble(nota3);
        double media = (uno + dos + tres) / 3;

        int confirm = JOptionPane.showConfirmDialog(null, "Você confirma os dados?");
        if (confirm == 0) {
            JOptionPane.showMessageDialog(null, ("====== BOLETIM ======" + "\n" +
                "Nome: " + nome + "\n" +
                "Idade: " + age + "\n" +
                "Média: " + Math.round(media))
            );
            return;
        } else {
            JOptionPane.showMessageDialog(null,
                "Execute novamente o programa e insira os dados corretamente."
            );
            return;
        }
    }
}
