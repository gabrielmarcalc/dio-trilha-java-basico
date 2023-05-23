import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class ExemploMap {

    public static void main(String[] args) {
        
// Dados os modelos de carros e seus respectivos consumos na estrada, faça:
// modelo = gol, consumo = 14,4 km/l
// modelo = uno, consumo = 15,6 km/l
// modelo = mobi, consumo = 16,1 km/l
// modelo = hb20, consumo = 14,5 km/l
// modelo = kwid, consumo = 15,6 km/l
/*
 * Map carrosPopulares2020 = new HashMap();
 * Map<String, Double> carros Populares = new HashMap<>();
 * HashMap<String, Double> carrosPopulares = new HashMap<>();
 * Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1,
 *                                                  "hb20", 14.5, "kwid", 15.6);
 */
        System.out.println("\nCrie um dicionário que relacione os modelos e " +
        "seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>();
        carrosPopulares.put("gol", 14.4);
        carrosPopulares.put("uno", 15.6);
        carrosPopulares.put("mobi", 16.1);
        carrosPopulares.put("hb20", 14.5);
        carrosPopulares.put("kwid", 15.6);
        System.out.println(carrosPopulares.toString());

        System.out.println("\nSubstitua o consumo do gol por 12,5 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares.toString());

        System.out.println("\nConfira se o modelo 'tucson' está no dicionário: ");
        System.out.println(carrosPopulares.containsKey("tucson"));

        System.out.println("\nExiba o consumo do uno: ");
        System.out.println(carrosPopulares.get("uno"));

//        System.out.println("\nExiba o terceiro modelo adicionado: ");

        System.out.println("\nExiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos.toString());

        System.out.println("\nExiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos.toString());

        System.out.println("\nExiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println(modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }
        
        System.out.println("\nExiba o modelo menos econômico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println(modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }
        
        System.out.println("\nExiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()) 
            soma += iterator.next();
        System.out.println(soma);

        System.out.println("\nExiba a média dos consumos deste dicionário de carros: ");
        System.out.println(soma/5);

        System.out.println("\nRemova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()) 
            if (iterator1.next().equals(15.6))
                iterator1.remove();
        System.out.println(carrosPopulares.toString());

        System.out.println("\nExiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>();
        carrosPopulares1.put("gol", 14.4);
        carrosPopulares1.put("uno", 15.6);
        carrosPopulares1.put("mobi", 16.1);
        carrosPopulares1.put("hb20", 14.5);
        carrosPopulares1.put("kwid", 15.6);
        System.out.println(carrosPopulares1.toString());

        System.out.println("\nExiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("\nApague o conjunto de carros: ");
        carrosPopulares.clear();
        System.out.println(carrosPopulares.toString());

        System.out.println("\nConfira se a lista está vazia: ");
        System.out.println(carrosPopulares.isEmpty());


    }
}
