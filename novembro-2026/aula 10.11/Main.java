import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu  nome: ");
        String name = entrada.nextLine();
        String typeOfName = name.getClass().toString();
        System.out.println(typeOfName);
        System.out.println(typeOfName == "class java.lang.String");

        if (typeOfName != "class java.lang.String") {
           System.out.println("Digite um nome válido.");
           entrada.close();
           return;
        }

        System.out.print("Digite seu nome de nascimento: ");
        int year = entrada.nextInt();
        System.out.println("year = " + year);

        // if (year <=1950 || year > 2026 || year ) {
        //  System.out.println("Digite um ano válido.");
        //  return;
        // }
        //
        entrada.close();

        int age = 2026 - year;

        System.out.println("Seu nome é " + name + " e você tem " + age + " anos");
    }
}
