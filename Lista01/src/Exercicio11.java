import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado 1: ");
        double l1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite o lado 1: ");
        double l2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite o lado 1: ");
        double l3 = Double.parseDouble(scanner.nextLine());

        if(l1 == l2 && l2 == l3){
            System.out.println("Equilátero");
        } else if (l1 != l2 && l2 != l3 && l1 != l3) {
            System.out.println("Escaleno");
        } else {
            System.out.println("Isósceles");
        }
    }
}
