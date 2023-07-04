import java.util.Scanner;

public class Preço {
    public static void main (String[] args){
        Scanner entre = new Scanner(System.in);
        int preco1, preco2, preco3;
        String produto1,produto2,produto3;
        System.out.println("produto");
        produto1 = entre.next();
        System.out.println("produto");
        produto2 = entre.next();
        System.out.println("produto");
        produto3 = entre.next();

        System.out.println("proço");
        preco1 = entre.nextInt();
        System.out.println("proço");
        preco2 = entre.nextInt();
        System.out.println("proço");
        preco3 = entre.nextInt();

      if(preco1<preco3 && preco1<preco2){
          System.out.println("preco mais baixo1");
      } else if (preco1>preco3 && preco1>preco2) {
          System.out.println("preco mais caro1");
      } else if (preco2<preco3 && preco2<preco1) {
          System.out.println("preco mais baixo2");
      }else if (preco2>preco3 && preco2>preco1){
          System.out.println("preço mais caro2");
      }else if (preco3<preco2 && preco3<preco1){
          System.out.println("preco mais baixo3");
      } else if (preco3>preco2 && preco3>preco1) {
          System.out.println("preco mais caro3");
      }else {
          System.out.println("invalido");
      }

      }

    }

