import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distância percorrida(km): ");
        double d = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite a quantidade de litros consumidos(l): ");
        double l = Double.parseDouble(scanner.nextLine());

        double consumo = d/l;

        if (consumo < 8) {
            System.out.println("venda o carro!");
        } else if (consumo <= 12) {
            System.out.println("Econômico.");
        } else {
            System.out.println("Super enconômico.");
        }
    }
}
