import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite um numero: ");
        int n2 = Integer.parseInt(scanner.nextLine());

        int soma = n1 + n2;

        if (soma > 20) {
            soma += 8;
        } else {
            soma -= 5;
        }

        System.out.println("O resultado final é: " + soma);
    }
}
