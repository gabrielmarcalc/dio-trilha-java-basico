public class Quadrilatero {
    
    public static double area (double lado) {
        double a = lado * lado;
        return a;
    }
    public static double area (double lado1, double lado2) {
        double a = lado1 * lado2;
        return a;
    }
    public static double area (double baseMaior, double baseMenor, double altura) {
        double a = (baseMaior + baseMenor) * altura / 2;
        return a;
    }

}
