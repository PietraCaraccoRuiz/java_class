import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero decimal: ");
        String numeroString = scanner.nextLine();
        String numeroFormatado = numeroString.replace(",",".");
        double numero = Double.parseDouble(numeroFormatado);

        System.out.println(numero);

    }
}
