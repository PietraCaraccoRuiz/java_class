import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite as horas estacionadas: ");
        double horas = Double.parseDouble(scanner.nextLine());
        double valor = 0.0;

        if (horas <= 2) {
            valor = horas * 2.0;
        } else if (horas <= 4) {
            valor = 2 * 2.0 + (horas - 2) * 1.4;
        } else {
            valor = 2 * 2.0 + 2 * 1.4 + (horas - 4) * 1.0;
        }

        System.out.printf("Valor a ser pago: R$ %.2f%n", valor);
    }
}