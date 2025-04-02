import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        String letra = alfabeto.toUpperCase();

        System.out.println("Digite um numero de 1 a 26: ");
        int i = Integer.parseInt(scanner.nextLine());

        System.out.println("A letra da posicção "+ i +" é: "+ letra.charAt(i-1));
    }
}
