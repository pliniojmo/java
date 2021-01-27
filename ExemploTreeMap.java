import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {
        TreeMap<String,String> treeCapitais = new TreeMap<>();

        // Montar a árvore com as capitais

        treeCapitais.put("RS","Porto Alegre");
        treeCapitais.put("PE","Recife");
        treeCapitais.put("SC","Florianópolis");
        treeCapitais.put("PR","Curitiba");
        treeCapitais.put("SP","São Paulo");
        treeCapitais.put("RJ","Rio de Janeiro");
        treeCapitais.put("BH","Belo Horizonte");

        System.out.println(treeCapitais);

        // Retorna a primeira capital no topo da árvore.
        System.out.println(treeCapitais.firstKey());

        // Retorna o ultimo
        System.out.println(treeCapitais.lastKey());

        // Retorna quem vem em cima da capital parametrizada.
        System.out.println(treeCapitais.lowerKey("SC"));

        // Retorna quem vem em baixo
        System.out.println(treeCapitais.higherKey("SC"));

        System.out.println(treeCapitais);

        // Retona a primeira capital
        System.out.println(treeCapitais.firstEntry().getKey()+" - "+treeCapitais.firstEntry().getValue());

        // Retorna a ultima capital
        System.out.println(treeCapitais.lastEntry().getKey()+" - "+treeCapitais.lastEntry().getValue());

        System.out.println(treeCapitais);

        // Retorna a primeira a cima
        System.out.println(treeCapitais.lowerEntry("SC").getKey()+" - "+treeCapitais.lowerEntry("SC").getValue());

        // Retorna a primeira capital abaixo na árvore da capital parametrizada
        System.out.println(treeCapitais.higherEntry("SC").getKey()+" - "+treeCapitais.higherEntry("SC").getValue());

        System.out.println(treeCapitais);

        Map.Entry<String,String> firstEntry = treeCapitais.pollFirstEntry();
        Map.Entry<String,String> lastEntry = treeCapitais.pollLastEntry();

        // Retorna a primeira capital no topo da árvore, e remove.
        System.out.println(firstEntry.getKey()+" - "+firstEntry.getValue());

        // Retorna a ultima e remove
        System.out.println(lastEntry.getKey()+" - "+lastEntry.getValue());

        System.out.println(treeCapitais);

        // Navega em todas as chaves
        Iterator<String> iterator = treeCapitais.keySet().iterator();
        System.out.println("========================================");
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key+" - "+treeCapitais.get(key));
        }
        System.out.println("========================================");
        for (String capital : treeCapitais.keySet()){
            System.out.println(capital+" - "+treeCapitais.get(capital));
        }
        System.out.println("========================================");
        for (Map.Entry<String, String> capital: treeCapitais.entrySet()){
            System.out.println(capital.getKey()+ " - "+capital.getValue());
        }
        System.out.println("========================================");
    }
}
