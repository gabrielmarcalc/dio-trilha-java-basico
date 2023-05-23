/*
 * Dada a população estimada de alguns estados do NE brasileiro, faça:
 * Estado = PE - População = 9616621
 * Estado = AL - População = 3351543
 * Estado = CE - População = 9187103
 * Estado = RN - População = 3534265
 * Crie um dicionário e relacione os estados e suas populações
 * Substitua a população do estado do RN por 3534165
 * Confira se o estado PB está no dicionário. Caso não, adicione: PB - 4039277
 * Exiba a população de PE
 * Exiba todos os estados e suas populações na ordem que foi informado
 * Exiba os estados e suas populações em ordem alfabética
 * Exiba o estado com a menor população e sua quantidade
 * Exiba o estado com a maior população e sua quantidade
 * Exiba a soma da população desses estados
 * Exiba a média da população deste dicionário de estados
 * Remova os estados com a população menor que 4000000
 * Apague o dicionário de estados
 * Confira se o dicionário está vazio
 */

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class EstadosNordeste {
    public static void main(String[] args) throws Exception {
        
        System.out.println("\n\nCrie um dicionário e relacione os estados e suas populações: ");
        Map<String, Integer> nordeste1 = new HashMap<>();
        nordeste1.put("PE", 9616621);
        nordeste1.put("AL", 3351543);
        nordeste1.put("CE", 9187103);
        nordeste1.put("RN", 3534265);
        for (Map.Entry<String, Integer> estado1 : nordeste1.entrySet()) {
            System.out.print(estado1.getKey()+" = "+estado1.getValue()+"      ");   
        }

        System.out.println("\n\nSubstitua a população do estado do RN por 3534165: ");
        nordeste1.put("RN", 3534165);
        for (Map.Entry<String, Integer> estado1 : nordeste1.entrySet()) {
            System.out.print(estado1.getKey()+" = "+estado1.getValue()+"      ");   
        }

        System.out.println("\n\nConfira se o estado PB está no dicionário. Caso não, adicione PB - 4039277: ");
        System.out.println(nordeste1.containsKey("PB"));
        if (nordeste1.containsKey("PB") == false) nordeste1.put("PB", 4039277);
        for (Map.Entry<String, Integer> estado1 : nordeste1.entrySet()) {
            System.out.print(estado1.getKey()+" = "+estado1.getValue()+"      ");   
        }

        System.out.println("\n\nExiba a população de PE: " + nordeste1.get("PE"));

        System.out.println("\nExiba todos os estados e suas populações na ordem que foi informado: ");
        Map<String, Integer> nordeste2 = new LinkedHashMap<>();
        nordeste2.put("PE", 9616621);
        nordeste2.put("AL", 3351543);
        nordeste2.put("CE", 9187103);
        nordeste2.put("RN", 3534165);
        nordeste2.put("PB", 4039277);
        for (Map.Entry<String, Integer> estado1 : nordeste2.entrySet()) {
            System.out.print(estado1.getKey()+" = "+estado1.getValue()+"      ");   
        }

        System.out.println("\n\nExiba os estados e suas populações em ordem alfabética: ");
        Map<String, Integer> nordeste3 = new TreeMap<>(nordeste1);
        for (Map.Entry<String, Integer> estado1 : nordeste3.entrySet()) {
            System.out.print(estado1.getKey()+" = "+estado1.getValue()+"      ");   
        }

        System.out.print("\n\nExiba o estado com a menor população e sua quantidade: ");
        Integer menorPop = Collections.min(nordeste1.values());
        String estadoMenorPop = "";
        Set<Map.Entry<String, Integer>> entries1 = nordeste1.entrySet();
        for (Map.Entry<String,Integer> entry : entries1) {
            if(entry.getValue().equals(menorPop)) {
                estadoMenorPop = entry.getKey();
                System.out.print(estadoMenorPop+" = "+menorPop+"      ");
            }
        }

        System.out.print("\n\nExiba o estado com a maior população e sua quantidade: ");
        Integer maiorPop = Collections.max(nordeste1.values());
        String estadoMaiorPop = "";
        for (Map.Entry<String,Integer> entry : entries1) {
            if(entry.getValue().equals(maiorPop)) {
                estadoMaiorPop = entry.getKey();
                System.out.print(estadoMaiorPop+" = "+maiorPop+"      ");
            }
        }

        System.out.print("\n\nExiba a soma da população desses estados: ");
        Iterator<Integer> iterator1 = nordeste1.values().iterator();
        Integer soma = 0;
        while(iterator1.hasNext())
            soma += iterator1.next();
        System.out.println(soma);

        Integer media = soma/5;
        System.out.println("\nExiba a média da população deste dicionário de estados: "+media);

        System.out.println("\nRemova os estados com a população menor que 4000000: ");
        Iterator<Integer> iterator2 = nordeste1.values().iterator();
        while (iterator2.hasNext())
            if (iterator2.next() < 4000000)
                iterator2.remove();
        for (Map.Entry<String, Integer> estado1 : nordeste1.entrySet()) {
            System.out.print(estado1.getKey()+" = "+estado1.getValue()+"      ");   
        }
        
        System.out.println("\n\nApague o dicionário de estados: ");
        nordeste1.clear();
        for (Map.Entry<String, Integer> estado1 : nordeste1.entrySet()) {
            System.out.print(estado1.getKey()+" = "+estado1.getValue()+"      ");   
        }

        System.out.println("\n\nConfira se o dicionário está vazio: "+nordeste1.isEmpty());
        System.out.println("\n\n");

    }
}
