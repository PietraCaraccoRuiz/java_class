import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 3 algarismos: ");
        int numero = Integer.parseInt(scanner.nextLine());

        if (numero > 99 && numero < 1000) {
            String numeroString = String.valueOf(numero);
            int n1 = Integer.parseInt(String.valueOf(numeroString.charAt(0)));
            int n2 = Integer.parseInt(String.valueOf(numeroString.charAt(1)));
            int n3 = Integer.parseInt(String.valueOf(numeroString.charAt(2)));
            int soma = n1 + n2 + n3;
            System.out.println("A soma é: "+ soma);
        } else {
            System.out.println("O número não tem 3 algarismos");
        }
    }
}
