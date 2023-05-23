/*
 * Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene.
 * Depois mostre quantas vezes cada valor foi inserido.
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class LancamentoDado {
    public static void main(String[] args) {
        
        Map<Integer, Integer> dado = new HashMap<>();
        Random lancador = new Random();
        for(Integer i = 1; i <=100; i++) {
            Integer valor = lancador.nextInt(6) + 1;
            dado.put(i, valor);    
        }
//        for (Map.Entry<Integer, Integer> lancamento : dado.entrySet()) {
//            System.out.println(lancamento.getKey()+" - "+lancamento.getValue());
//        }

        Integer contador = 0;        
        Iterator<Integer> iterator1 = dado.values().iterator();
        while (iterator1.hasNext())
            if (iterator1.next() == 1)
                contador++;
        System.out.println("\nResultado: 1 - Quantidade de vezes: "+contador);
        contador = 0;
        Iterator<Integer> iterator2 = dado.values().iterator();
        while (iterator2.hasNext())
            if (iterator2.next() == 2)
                contador++;
        System.out.println("Resultado: 2 - Quantidade de vezes: "+contador);
        contador = 0;
        Iterator<Integer> iterator3 = dado.values().iterator();
        while (iterator3.hasNext())
            if (iterator3.next() == 3)
                contador++;
        System.out.println("Resultado: 3 - Quantidade de vezes: "+contador);
        contador = 0;        
        Iterator<Integer> iterator4 = dado.values().iterator();
        while (iterator4.hasNext())
            if (iterator4.next() == 4)
                contador++;
        System.out.println("Resultado: 4 - Quantidade de vezes: "+contador);
        contador = 0;
        Iterator<Integer> iterator5 = dado.values().iterator();
        while (iterator5.hasNext())
            if (iterator5.next() == 5)
                contador++;
        System.out.println("Resultado: 5 - Quantidade de vezes: "+contador);
        contador = 0;
        Iterator<Integer> iterator6 = dado.values().iterator();
        while (iterator6.hasNext())
            if (iterator6.next() == 6)
                contador++;
        System.out.println("Resultado: 6 - Quantidade de vezes: "+contador);
        System.out.println();


    }
}
