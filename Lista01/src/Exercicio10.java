import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario, reajuste;

        System.out.println("Digite seu salário: ");
        salario = Double.parseDouble(scanner.nextLine());

        if (salario <= 3000){
            reajuste = 35;
        } else {
            reajuste = 15;
        }
        System.out.printf("Salário Reajustado: R$ %.2f", salario + (salario * reajuste/100));
    }
}
