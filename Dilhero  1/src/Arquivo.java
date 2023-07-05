import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Arquivo {
    public static void main(String[] args){
        System.out.println("Leitura do arquivo");
        File file = new File("C:\\Users\\igor.santos5\\Documents/senac.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (IOException e){
            System.out.println("Erro"+e.getMessage());
        }finally {
            if(sc != null);
            sc.close();
            
        }
    }
}
