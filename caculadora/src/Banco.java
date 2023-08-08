import java.util.Scanner;

public class Banco {
    public static void main(String args[]){
        Scanner barnco = new Scanner(System.in);
        double valorInicial = 1500;
        double ValorSacar = 0,
                ValorDepositar;
        int escolha;
        boolean menu;
        double ValorAtualizado=0;
        int contador =0 ;

        while ( menu= true) {
            System.out.println("Seja bem vindo ");
            System.out.println("Escolha" +
                    "\n1-Sacar" +
                    "\n2-Depositar");
            escolha = barnco.nextInt();

            if (escolha == 1) {
                System.out.println("Qual seria o valor que deseja sacar:");
                ValorSacar = barnco.nextDouble();
                System.out.println();
                if (contador>=1){
                    ValorAtualizado=ValorAtualizado-ValorSacar;
                } else if (contador==0){
                ValorAtualizado = valorInicial - ValorSacar;}
                System.out.println("le resta" + ValorAtualizado);
            } else {
                System.out.println("Quanto quer depoisitar");
                ValorDepositar = barnco.nextDouble();
            }
            contador++;
            System.out.println("contador "+ contador);

        }

    }
}
