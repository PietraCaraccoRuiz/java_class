import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double conv = 0;

        System.out.println("Digite o seu tipo de moeda: ");
        System.out.println("1 - Real ");
        System.out.println("2 - Dólar ");
        System.out.println("3 - Euro ");
        int moeda_inicial = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o valor da moeda: ");
        double valor = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite o seu tipo de moeda para conversão: ");
        System.out.println("1 - Real ");
        System.out.println("2 - Dólar ");
        System.out.println("3 - Euro ");
        int moeda_final = Integer.parseInt(scanner.nextLine());


        if(moeda_inicial == 1){
            if(moeda_final == 1){
                conv = valor;
            } else if(moeda_final == 2) {
                conv = valor * 0.17709;
            } else if(moeda_final == 3){
                conv = valor * 0.15584;
            } else {
                System.out.println("Escolha entre 1, 2 e 3!");
            }
        } else if(moeda_inicial == 2){
            if(moeda_final == 1){
                conv = valor * 5.71;
            } else if(moeda_final == 2) {
                conv = valor;
            } else if(moeda_final == 3){
                conv = valor * 0.8838;
            } else {
                System.out.println("Escolha entre 1, 2 e 3!");
            }
        } else if(moeda_inicial == 3) {
            if(moeda_final == 1){
                conv = valor * 6.42;
            } else if(moeda_final == 2) {
                conv = valor * 1.13;
            } else if(moeda_final == 3){
                conv = valor;
            } else {
                System.out.println("Escolha entre 1, 2 e 3!");
            }
        } else {
            System.out.println("Escolha entre 1, 2 e 3!");
        }
        System.out.printf("Valor da conversão %.2f", conv);
    }
}
