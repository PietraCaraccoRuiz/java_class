import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor = 0;

        System.out.println("digite as horas: ");
        double horas =  Integer.parseInt(scanner.nextLine());
            if (valor < 4) {
                valor = valor + (horas * 2);
                System.out.println("1: " + horas);
                System.out.println("1: " + valor);
            }
            if (valor >= 4) {
                valor = valor + ((horas - 2) * 1.4);
                System.out.println("2: "+ horas);
                System.out.println("2: "+ valor);
            }
            if (valor >= 6.8) {
                valor = valor + (horas - 4);
                System.out.println("3: "+ horas);
                System.out.println("3: "+ valor);
            }

        System.out.printf("Valor a ser pago: R$ %.2f", valor);
    }
}
