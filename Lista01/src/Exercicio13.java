import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o seu tipo de moeda: ");
        int moeda_inicial = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o seu tipo de moeda para conversão: ");
        int moeda_final = Integer.parseInt(scanner.nextLine());
    }
}
