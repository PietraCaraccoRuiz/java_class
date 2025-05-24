import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double comissao = 0;

        System.out.println("Digite o valor da venda: ");
        double venda = Double.parseDouble(scanner.nextLine());

        if(venda >= 100000){
            comissao = 700 + (venda * 16/100);
        } else if(venda >= 80000 && venda < 10000){
            comissao = 650 + (venda * 14/100);
        } else if(venda >= 60000 && venda < 80000){
            comissao = 600 + (venda * 14/100);
        } else if(venda >= 40000 && venda < 60000){
            comissao = 550 + (venda * 14/100);
        } else if( venda < 400000 ){
            comissao = 550 + (venda * 14/100);
        } else {
            System.out.println("Valor inválido!");
        }

        System.out.printf("A comissão da venda R$%.2f é R$%.2f", venda, comissao);
    }
}
