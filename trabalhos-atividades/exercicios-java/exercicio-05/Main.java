public class Main {
    public static void main(String[] args) {
        double preco = 6.50;
        int quantidade = 5;
        double valorTotal = (double) quantidade * preco;

        System.out.println("Quantidade comprada: " + quantidade);
        System.out.println("Valor total: " + valorTotal);
        System.out.println("Troco: " + (100.0 - valorTotal));
    }
}
