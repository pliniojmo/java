import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        Map<String,Integer> campeoesMundialFifa = new HashMap<>();

        // Adiciona os campeões mundias fifa no mapa.
        campeoesMundialFifa.put("Brasil",5);
        campeoesMundialFifa.put("Alemanha",4);
        campeoesMundialFifa.put("Itália",4);
        campeoesMundialFifa.put("Uruguai",2);
        campeoesMundialFifa.put("França",2);
        campeoesMundialFifa.put("Argentina",2);
        campeoesMundialFifa.put("Inglaterra",1);
        campeoesMundialFifa.put("Espanha",1);

        System.out.println(campeoesMundialFifa);

        // Atualiza o valor para chave Brasil.
        campeoesMundialFifa.put("Brasil",6);

        System.out.println(campeoesMundialFifa);

        // Retorna Argentina.
        System.out.println(campeoesMundialFifa.get("Argentina"));

        // Retorna se existe ou não um campeão França.
        System.out.println(campeoesMundialFifa.containsKey("França"));

        // Remove campeão França.
        campeoesMundialFifa.remove("França");

        // Retorna ou não se tem campeão França
        System.out.println(campeoesMundialFifa.containsKey("França"));

        System.out.println(campeoesMundialFifa);

        // Retorna se tem seleção hexa
        System.out.println(campeoesMundialFifa.containsValue(6));

        // Retorna o tamanho do mapa
        System.out.println(campeoesMundialFifa.size());

        System.out.println(campeoesMundialFifa);

        // Navega no registro do mapa
        for (Map.Entry<String,Integer> entry: campeoesMundialFifa.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
        System.out.println("===============================");
        // Navega no registro do mapa
        for (String key: campeoesMundialFifa.keySet()){
            System.out.println(key +" =-= "+campeoesMundialFifa.get(key));
        }
        System.out.println("===============================");

        // Verifica se o mapa contem o valor 5
        System.out.println(campeoesMundialFifa.containsValue(5));

        // Varifica se tem a chave Estados Unidos
        System.out.println(campeoesMundialFifa.containsKey("Estados Unidos"));

        campeoesMundialFifa.clear();

        System.out.println(campeoesMundialFifa.size());

        System.out.println(campeoesMundialFifa);

    }
}
