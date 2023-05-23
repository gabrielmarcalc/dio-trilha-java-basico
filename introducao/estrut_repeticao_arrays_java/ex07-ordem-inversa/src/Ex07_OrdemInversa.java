/*
 * Crie um vetor de seis números inteiros
 * e mostre-os na ordem inversa.
 */

public class Ex07_OrdemInversa {
    public static void main(String[] args) throws Exception {
        
        int[] vetor = {6, 32, 47, 5, 669, 96};

        for (int i = vetor.length - 1; i >= 0; i--)
            System.out.println(vetor[i] + " ");
    }
}
