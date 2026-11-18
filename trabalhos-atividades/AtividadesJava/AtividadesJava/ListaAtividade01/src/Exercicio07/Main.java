package Exercicio07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int number = input.nextInt();
        input.close();

        System.out.println(number * 8);
        System.out.println(number % 3);
    }
}
