import java.util.List;
import java.util.Vector;

public class ListaVector {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        //Adicionar 4 esportes no vetor
        esportes.add("Futebol");
        esportes.add("Besquetebol");
        esportes.add("Tênis de Mesa");
        esportes.add("Handebol");

        System.out.println(esportes); //[Futebol, Besquetebol, Tênis de Mesa, Handebol]

        //Altera o valor da posição 2 do vetor
        esportes.set(2,"Ping Pong");

        System.out.println(esportes); //[Futebol, Besquetebol, Ping Pong, Handebol]

        //Remove o esporte da posição 1
        esportes.remove(1);

        System.out.println(esportes); //[Futebol, Ping Pong, Handebol]

        //Remove o esporte pelo nome
        esportes.remove("Futebol");

        System.out.println(esportes); //[Ping Pong, Handebol]

        //Retorna o primeiro item do vetor
        System.out.println(esportes.get(0)); //Ping Pong

        //Navega no vetor esportes

        for(String esporte: esportes){
            System.out.println("-->"+esporte);
        }

        List<String> nomes = new Vector<>();

        nomes.add("Plínio");
        nomes.add("Juliane");

        int quant = esportes.size();

        System.out.println(quant);

    }
}
