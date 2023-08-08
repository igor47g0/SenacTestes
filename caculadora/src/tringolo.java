public class tringolo {
    public static void main(String args[]){
        tringolo(1,1,1);
    }
    public static void tringolo(int lado1, int lado2, int lado3) {
        System.out.println("Equilátero");
        if ((lado1 == lado2 && lado2 != lado3) || (lado2 == lado3 && lado3 != lado1) || (lado3 == lado1 && lado3 != lado2)) {
            System.out.println("Isóceles");
        } else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
            System.out.println("Escaleno");
        }
          

    }
}
