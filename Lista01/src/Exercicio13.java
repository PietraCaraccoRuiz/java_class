import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o seu tipo de moeda: ");
        System.out.println("1 - Real ");
        System.out.println("2 - Dólar ");
        System.out.println("1 - Euro ");
        int moeda_inicial = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o seu tipo de moeda para conversão: ");
        System.out.println("1 - Real ");
        System.out.println("2 - Dólar ");
        System.out.println("1 - Euro ");
        int moeda_final = Integer.parseInt(scanner.nextLine());
    }
}
