// Crie um conjunto contendo as cores do arco-íris e:
// A - Exiba todas as cores, uma abaixo da outra
// B - Exiba quantidade de cores que o arco-íris tem
// C - Exiba as cores em ordem alfabética
// D - Exiba as cores na ordem inversa da que foi informada
// E - Exiba todas as cores que começam com a letra 'v'
// F - Remova todas as cores que não começam com a letra 'v'
// G - Limpe o conjunto
// H - Confira se o conjunto está vazio

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArcoIris {
    
    public static void main(String[] args) {
        Set<String> cores = new LinkedHashSet<>();
        cores.add("Vermelho");
        cores.add("Laranja");
        cores.add("Amarelo");
        cores.add("Verde");
        cores.add("Azul");
        cores.add("Anil");
        cores.add("Violeta");

        System.out.println("\nA - Exiba todas as cores, uma abaixo da outra: ");
        for (String string : cores) {
            System.out.println(string);
        }
        System.out.println("\nB - Exiba quantidade de cores que o arco-íris tem: " + cores.size());

        System.out.println("\nC - Exiba as cores em ordem alfabética: ");
        Set<String> cores2 = new TreeSet<>(new ComparatorCor());
        cores2.addAll(cores);
        for (String string : cores2)
            System.out.println(string);

//        System.out.println("\nD - Exiba as cores na ordem inversa da que foi informada: ");

        System.out.println("\nE - Exiba todas as cores que começam com a letra 'v': ");
        for (String string : cores) {
            if (string.startsWith("V")) System.out.println(string);
        }

        System.out.println("\nF - Remova todas as cores que não começam com a letra 'v': ");
        Iterator<String> iterator1 = cores.iterator();
        while(iterator1.hasNext())
            if(!iterator1.next().startsWith("V"))
                iterator1.remove();
        for (String string : cores)
            System.out.println(string);
            
        System.out.println("\nG - Limpe o conjunto: ");
        cores.clear();
        for (String string : cores)
            System.out.println(string);

        System.out.println("\nH - Confira se o conjunto está vazio: " + cores.isEmpty());

    }
}

class ComparatorCor implements Comparator<String> {
    @Override
    public int compare (String c1, String c2) {
    return c1.compareTo(c2);
    }
}
