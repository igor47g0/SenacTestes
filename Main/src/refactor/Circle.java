package refactor;

public class Circle {
    public static void main(String[] args) {
        System.out.println(calculaAreaDoCirculo(2.0));
        System.out.println(calculaPerimetroDoCirculo(3.0));
        System.out.println(calculaVolumeDaEsfera(4.0));
        System.out.println(calculaAreaDaSuperficieDaEsfera(5.0));
    }
        public static double calculaAreaDoCirculo(double raio) {
            double area = Math.PI * raio * raio;
            return area;
        }

        public static double calculaPerimetroDoCirculo(double raio) {
            double perimetro = 2 * Math.PI * raio;
            return perimetro;
        }

        public static double calculaVolumeDaEsfera(double raio) {
            double volume = (4 * Math.PI * Math.pow(raio, 3)) / 3;
            return volume;
        }

        public static double calculaAreaDaSuperficieDaEsfera(double raio) {
            double area = 4 * Math.PI * (Math.pow(raio, 2));
            return area;
        }

}
