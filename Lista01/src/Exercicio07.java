import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        float peso = Float.parseFloat(scanner.nextLine());
        System.out.println("Digite sua altura: ");
        float altura = Float.parseFloat(scanner.nextLine());

        double imc = peso / Math.pow(altura, 2);

        if(imc < 18.5){
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Saudável");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Obesidade grau I");
        } else if (imc < 40) {
            System.out.println("Obesidade grau II");
        } else{
            System.out.println("Obesidade grau III");
        }
    }
}
