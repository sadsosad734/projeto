import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a temperatura em Celsius
        System.out.print("Digite a temperatura em graus Celsius (°C): ");
        double celsius = scanner.nextDouble();

        // Converte para Fahrenheit e Kelvin
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        // Exibe os resultados
        System.out.printf("Temperatura em Fahrenheit (°F): %.2f%n", fahrenheit);
        System.out.printf("Temperatura em Kelvin (K): %.2f%n", kelvin);

        scanner.close();
    }
}
