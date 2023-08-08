import java.util.Scanner;

public class calcuadora {
    public static void main(String args[]) {
        Scanner calcula = new Scanner(System.in);
        double x;
        double y;
        int z;
       double resposta;
        System.out.println("Escreva qual o valor");
        x = calcula.nextDouble();
        System.out.println("Escreva qual o valor");
        y = calcula.nextDouble();

        System.out.println("qual operação" +
                "\n 1 mais +" +
                "\n2 menos -" +
                "\n 3 dividir /" +
                "\n 4 vezes * ");

        z = calcula.nextInt();

        if (z == 1){
            System.out.println(x+y);
        }else if (z==2){
            System.out.println(x-y);
        }else if (z==3){
            System.out.println(x/y);
        }else if (z==4){
            System.out.println(x*y);
        }




    }
}