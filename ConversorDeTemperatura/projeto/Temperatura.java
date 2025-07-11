import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, escolha o tipo de conversão:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");

        int escolha = scanner.nextInt();

        if (escolha == 1) {
            celsiusParaFahrenheit(); // chama a função
        } else if (escolha == 2) {
            fahrenheitParaCelsius(); // chama a outra função
        } else {
            System.out.println("Opção inválida. Tente novamente.");
        }

        scanner.close(); // fecha o scanner principal
    }

    // Função para converter Celsius em Fahrenheit
    public static void celsiusParaFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + "°C é igual a " + fahrenheit + "°F");

        scanner.close();
    }

    // Função para converter Fahrenheit em Celsius
    public static void fahrenheitParaCelsius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(fahrenheit + "°F é igual a " + celsius + "°C");

        scanner.close();
    }
}
