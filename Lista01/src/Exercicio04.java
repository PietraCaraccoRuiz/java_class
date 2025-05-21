import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite um número: ");
        int n2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite um número: ");
        int n3 = Integer.parseInt(scanner.nextLine());

        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        if (n1 > n3) {
            int temp = n1;
            n1 = n3;
            n3 = temp;
        }
        if (n2 > n3) {
            int temp = n2;
            n2 = n3;
            n3 = temp;
        }
        System.out.println("Ordem crescente: " + n1 + " " + n2 + " " + n3);
    }
}
