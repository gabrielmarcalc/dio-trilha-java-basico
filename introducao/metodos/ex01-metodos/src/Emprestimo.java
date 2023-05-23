public class Emprestimo {
    
    public static int getDuasParcelas() {
        return 2;
    }
    public static int getTresParcelas() {
        return 3;
    }
    public static double getTaxaDuasParcelas() {
        return 0.3;
    }
    public static double getTaxaTresParcelas() {
        return 0.45;
    }

    public static void calcular (double valor, int parcelas) {

        if (parcelas == 2) {

            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.print("\nValor final do empréstimo para 2 parcelas: R$" + valorFinal + "\n");

        } else if (parcelas == 3) {

            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.print("\nValor final do empréstimo para 3 parcelas: R$" + valorFinal + "\n");

        } else {

            System.out.print("\nQuantidade de parcelas não aceita.\n");

        }

    }

}
