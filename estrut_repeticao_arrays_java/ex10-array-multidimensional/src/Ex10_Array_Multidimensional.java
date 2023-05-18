/*
 * Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0 e 9.
 */

import java.util.Random;

public class Ex10_Array_Multidimensional {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] M = new int[4][4];

        for (int i = 0; i < M.length; i++) { // M.length retorna a quantidade de LINHAS
            for (int j = 0; j < M[i].length; j++) { // M[i].length retorna a quantidade de COLUNAS
                M[i][j] = random.nextInt(9); 
            }
        }
        System.out.print("\nMatriz gerada aleatoriamente:\n\n");
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++)
                System.out.print(M[i][j] + "  ");
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }
}
