public class Main {
    public static void main(String[] args) {
        String nome = "Ícaro";
        double media = 8.5;
        boolean aprovado = true;
        System.out.println("------- Boletim Escolar ------");
        System.out.printf(
            "Nome: %s" + "\n" +
            "Media: %.2f" + "\n" +
            "Aprovado?: %s" + "\n"
            , nome, media, (aprovado) ?  "Sim" : "Não"
        );
        System.out.println("------------------------------");
    }
}
