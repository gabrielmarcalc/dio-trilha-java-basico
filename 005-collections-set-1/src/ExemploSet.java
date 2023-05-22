import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class ExemploSet {
    public static void main(String[] args) {
        
// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça

// Set notas = new HashSet();
// Set<Double> notas = new HashList<>();
// HashSet<Double> notas = new HashSet<>();
// Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 6d, 0d, 3.6));
// Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 6d, 0d, 3.6);
// notas.add(10d);
// notas.remove(5d);
// System.out.println(notas);

        System.out.println("Crie um conjunto e adicione as notas: ");
        
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        // Serão adicionados em ordem aleatória e os elementos repetidos aparecerão apenas uma vez
        System.out.println(notas.toString());

        //System.out.println("Exiba a posição da nota 5.0: ");
        // No Set não é possível consultar o índice de um elemento devido à aleatoriedade no armazenamento

        //System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        // No Set não é possível consultar o índice de um elemento devido à aleatoriedade no armazenamento

        //System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        // No Set não é possível setar pontualmente um elemento devido à aleatoriedade

        System.out.println("Confirme se a nota 5.0 está na lista: " + notas.contains(5.0));

        //System.out.println("Exiba a terceira nota adicionada: ");
        // No set não se trabalha com ordem e posições de armazenamento

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator1 = notas.iterator();
        Double soma = 0.0;
        while(iterator1.hasNext())
            soma += iterator1.next();
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + soma/notas.size());

        System.out.println("Remova a nota 0: ");
        notas.remove(0.0);
        System.out.println(notas);

        //System.out.println("Remova a nota da posição 0: ");

        System.out.println("Remova as notas menores que 7.0 e exiba a lista: ");
        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext())
            if(iterator2.next() < 7.0)
                iterator2.remove();
        System.out.println(notas);

        System.out.println("Exiba todas as notas no ordem em que foram informadas: ");
        Set<Double> notas2 = new LinkedHashSet<>();         // Necessário para que se tenha a ordem
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);         // Necesário para organização em ordem natural
        System.out.println(notas3);

        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

    }
}
