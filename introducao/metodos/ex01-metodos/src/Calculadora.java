public class Calculadora {
    public static void soma (double n1, double n2) {
        double result = n1 + n2;
        System.out.print("\n" + n1 + " + " + n2 + " = " + result);
    }
    public static void subtracao (double n1, double n2) {
        double result = n1 - n2;
        System.out.print("\n" + n1 + " - " + n2 + " = " + result);
    }
    public static void multiplicacao (double n1, double n2) {
        double result = n1 * n2;
        System.out.print("\n" + n1 + " x " + n2 + " = " + result);
    }
    public static void divisao (double n1, double n2) {
        double result = n1 / n2;
        System.out.print("\n" + n1 + " / " + n2 + " = " + result);
    }
}
