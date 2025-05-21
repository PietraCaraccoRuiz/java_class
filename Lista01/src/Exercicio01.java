import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = Integer.parseInt(scanner.nextLine());

        if (numero % 3 == 0) {
            System.out.println("É mútiplo de 3");
        } else {
            System.out.println("Não é mútiplo de 3");
        }
    }
}
