/*
 * Faca um programa que leia um vetor de 6 caracteres e diga
 * quantas consoantes foram lidas. Imprima estas consoantes.
 */

import java.util.Scanner;

public class Ex08_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qtdCons = 0;

        for(int i = 0; i < 6; i++) {
            System.out.println("Digite o elemento da posição " + i);
            String letra = scan.next();
            if (!(letra.equalsIgnoreCase("a") ||
            letra.equalsIgnoreCase("e") ||
            letra.equalsIgnoreCase("i") ||
            letra.equalsIgnoreCase("o") ||
            letra.equalsIgnoreCase("u"))) {
                consoantes[i] = letra;
                qtdCons++;
            }
        }
        System.out.println("Foram digitadas " + qtdCons + " consoantes, sendo elas:\n");
        for(int i = 0; i < 6; i++) {
            if (consoantes[i] != null)
                System.out.println(consoantes[i]);
        }
    }
}
