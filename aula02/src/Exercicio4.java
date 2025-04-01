import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int inteiro = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite um número byte: ");
        byte valorbyte = Byte.parseByte(scanner.nextLine());

        System.out.println("Digite um número short: ");
        short valorshort = Short.parseShort(scanner.nextLine());

        System.out.println("Digite um número long: ");
        long valorLong = Long.parseLong(scanner.nextLine());

        System.out.println("Digite um número float: ");
        float valorFloat = Float.parseFloat(scanner.nextLine());

        System.out.println("Digite um número double: ");
        double valorDouble = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite um booleano: ");
        Boolean valorBoolean = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("Digite um texto: ");
        String valorString = scanner.nextLine();

        System.out.printf("%d\n%d\n%d\n%d\n%.2f\n%.2f\n%b\n%s", inteiro, valorbyte, valorshort, valorLong, valorFloat, valorDouble, valorBoolean, valorString);
    }
}
