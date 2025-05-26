import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dias_restantes = 0;

        System.out.println("Digite uma data(DD/MM/AAAA): ");
        String data = scanner.nextLine();

        int dia = Integer.parseInt(data.substring(0,2));
        int mes = Integer.parseInt(data.substring(3,5));
        int ano = Integer.parseInt(data.substring(6));
        System.out.println("dia: "+ dia +"Mes: "+ mes +" Ano: "+ ano);

        
        if (mes == 1) {
            dias_restantes = (31 - dia) + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 25;
        } else if (mes == 2) {
            dias_restantes = (28 - dia) + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 25;
        } else if (mes == 3) {
            dias_restantes = (31 - dia) + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 25;
        } else if (mes == 4) {
            dias_restantes = (30 - dia) + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 25;
        } else if (mes == 5) {
            dias_restantes = (31 - dia) + 30 + 31 + 31 + 30 + 31 + 30 + 25;
        } else if (mes == 6) {
            dias_restantes = (30 - dia) + 31 + 31 + 30 + 31 + 30 + 25;
        } else if (mes == 7) {
            dias_restantes = (31 - dia) + 31 + 30 + 31 + 30 + 25;
        } else if (mes == 8) {
            dias_restantes = (31 - dia) + 30 + 31 + 30 + 25;
        } else if (mes == 9) {
            dias_restantes = (30 - dia) + 31 + 30 + 25;
        } else if (mes == 10) {
            dias_restantes = (31 - dia) + 30 + 25;
        } else if (mes == 11) {
            dias_restantes = (30 - dia) + 25;
        } else if (mes == 12) {
            if (dia < 25) {
                dias_restantes = 25 - dia;
            } else if(dia == 25){
                System.out.println("É natalllllllllll!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            } else {
                dias_restantes = (31 - dia) + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 25;
                ano = ano + 1;
                if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    dias_restantes += 1;
                }
            }
        }else{
            System.out.println("Mês inválido! Digite um mês de 1 a 12.");
        }

        if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            if(mes <=2){
                dias_restantes += 1;
            }
        }

        System.out.println("Dias finais: "+ dias_restantes);
    }
}
