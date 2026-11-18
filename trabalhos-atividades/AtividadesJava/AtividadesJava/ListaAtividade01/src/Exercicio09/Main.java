package Exercicio09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite a distância da viagem em quilômetros: ");
        int distancia = input.nextInt();

        System.out.print("Digite o consumo médio do carro (km/l): ");
        int consumoKmL = input.nextInt();
        input.close();

        double precoGasolinaPorL = 5.89;
        double pedagio = 8.0;

        double litrosNecessarios = distancia / consumoKmL;
        double custoTotal = litrosNecessarios * precoGasolinaPorL + pedagio;

        System.out.printf("Nome: %s" + "\n" + "Distância: %d" + "\n" + "Litros gastos: %f" + "\n" + "Valor do pedágio: %.2f" + "\n" + "Custo final: %.2f", nome, distancia, litrosNecessarios, pedagio, custoTotal);
    }
}
