public class Refatoracao {

    public static  void main (String[]args ){
        System.out.println(somaXeY(2.0,4.0));
    }
    public static double salvaX(double x) {
        double xSalvo = x;
        return xSalvo;
    }
    public static double salvaY(double Y){
        double YSalvo=Y;
        return YSalvo;
    }
     public  static  double somaXeY(double X,double Y){
        return salvaX(X) + salvaY(Y);
     }






}
