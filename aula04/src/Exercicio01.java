import java.util.Scanner;
import java.lang.Math;

public class Exercicio01 {

    public void operacoesMatematicas(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("digite um numero: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Operações:");

        System.out.println(num1 + " + " + num2 + " = " + num1 + num2);

        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

        System.out.println(num1 + " * " + num2 + " = " + num1 * num2);

        System.out.println(num1 + " / " + num2 + " = " + (double) num1 / num2);

        System.out.println(num1 + " ^ " + num2 + " = " + Math.pow(num1, num2));

        System.out.println("√ " + num1 + " = " + Math.sqrt(num1));
    }
}
