import java.util.Scanner;

public class quis {
    public static void main(String[] args) {
        quiz();
    }
    public static void quiz () {
        Scanner sc = new Scanner(System.in);
        int pontos = 0;
        System.out.println("1- Qual o significado" +
                "nome da nistituição que vc" +
                "estuda" );

         String escocha1 = sc.nextLine();
        if (escocha1.equals("romildo cezepanik")) {
            System.out.println("Acertou");

            pontos++;
        } else {
            System.out.println("Errou");
        }
        ;
        System.out.println("Acertou" + pontos + "perguntas");

        System.out.println("2- quntos anos eu  telho");

        escocha1 = sc.nextLine();
        if(escocha1.equals("16")){
            System.out.println("Acertou");
            pontos ++;
        }else {
            System.out.println("Errou");
        }
        System.out.println("Acertou" + pontos + "perguntas");


        System.out.println("3 - Que anos estamos");

        escocha1 = sc.nextLine();
        if (escocha1.equals("2023")){
            System.out.println("Acertou");
            pontos++;
        }else{
            System.out.println("Errou");
        }
        System.out.println("Acertou" + pontos + "perguntas");


        System.out.println("4- Qual o anime que tem o pirata que estica");

        escocha1 = sc.nextLine();
        if (escocha1.equals("One piece")){
            System.out.println("Acertou");
            pontos++;
        }else{
            System.out.println("Errou");
        }
        System.out.println("Acertou" + pontos + "perguntas");


        System.out.println("5- Materia favorita ");

        escocha1 = sc.nextLine();
       if (escocha1.equals("Matematica")){
           System.out.println("Acertou");
           pontos++;
       }else{
           System.out.println("Errou");
       }
        System.out.println("Acertou" + pontos + "perguntas");
    }

}
