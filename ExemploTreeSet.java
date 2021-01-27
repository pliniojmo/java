import java.util.Iterator;
import java.util.TreeSet;
public class ExemploTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();

        // Mostra a árvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        // Mostra a árvore em ordem alfabética
        System.out.println(treeCapitais);

        System.out.println("=====================");

        // Retorna a primeira capital no topo da árvore.
        System.out.println(treeCapitais.first());
        System.out.println("=====================");

        // Retorna a última capital no final da árvore.
        System.out.println(treeCapitais.last());
        System.out.println("=====================");

        // Retorna quem vem a frente do nome selecioando.
        System.out.println(treeCapitais.lower("Florianópolis"));

        System.out.println("=====================");

        // Retorna quem vem a atrás do nome selecioando.
        System.out.println(treeCapitais.higher("Florianópolis"));

        System.out.println("=====================");

        // Retorna a primeira capital no topo, removendo do set
        System.out.println(treeCapitais.pollFirst());

        System.out.println("=====================");

        System.out.println(treeCapitais);
        System.out.println("=====================");

        // Retorna a ultima capital no topo, removendo do set
        System.out.println(treeCapitais.pollLast());

        System.out.println(treeCapitais);
        System.out.println("=====================");

        Iterator<String> iterator = treeCapitais.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=====================");
        for (String estado: treeCapitais){
            System.out.println(estado);
        }



    }
}
