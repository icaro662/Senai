package Exercicio02;

public class Main {
    public static void main(String[] args) {
        // erro 1: aspas de fechamento de string faltando no primeiro println
        // erro 2: ponto e vírgula de fechamento de comando faltando no primeiro println
        // erro 3: ponto e vírgula de fechamento de comando faltando no segundo println
        // erro 4: chave de fechamento de escopo faltando no método main
        System.out.print("Olá, ");

        // para printar tudo em uma linha foi modificado o println abaixo para "print" em vez de "println"
        System.out.print("meu número na chamada é: ");
        System.out.print("15");
    }
}
