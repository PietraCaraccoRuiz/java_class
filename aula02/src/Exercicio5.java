import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SEJA BEM-VIND0(A) A CLÍNICA\n");

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite seu CPF: ");
        long cpf = Long.parseLong(scanner.nextLine());

        System.out.println("Digite sua altura: ");
        float altura = Float.parseFloat(scanner.nextLine());

        System.out.println("Digite seu peso: ");
        double peso = Double.parseDouble(scanner.nextLine());

        System.out.printf("""
                
                Paciente: %s, CPF: %d\s
                ------------------------------------------------------\
                
                Idade: %d
                Altura: %.2f
                Peso: %.2f""", nome, cpf, idade, altura,peso);
    }
}
