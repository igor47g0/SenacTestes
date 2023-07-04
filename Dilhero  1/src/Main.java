import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entre = new Scanner(System.in);
        int fome, dinheiro;
        System.out.println("Esta com fome ?"
          + "\n1- sim"+"\n2- Não");
         dinheiro = entre.nextInt();
        System.out.println("Tem dinheiro ?"
                + "\n1- sim"+"\n2- Não");
        fome  = entre.nextInt();
         if (fome == 1 && dinheiro == 1){
             System.out.println("Va para a cantina!");
         }else if (fome == 1&& dinheiro==2){
             System.out.println("Trabalho que é bom nada");
         } else if (fome==2 && dinheiro==1 ) {
             System.out.println("Garde o dinheiro");
         } else if (fome == 2&& dinheiro==2) {
             System.out.println("Va caçar o que fazer!");
         }else{
             System.out.println("Invalido!");

         }
    }
    }
