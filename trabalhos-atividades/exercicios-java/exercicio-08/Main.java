import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int age = input.nextInt();
        input.close();

        int dias = age * 365;
        int horas = dias * 24;

        System.out.printf("Você viveu por %d dias e %d horas.", dias, horas);
    }
}
