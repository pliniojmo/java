import java.util.Hashtable;
import java.util.Map;

public class ExemploHashTable {
    public static void main(String[] args) {
        Hashtable<String,Integer> estudantes = new Hashtable<>();

        estudantes.put("Carlos",21);
        estudantes.put("Mariana",33);
        estudantes.put("Rafaela",18);
        estudantes.put("Pedro",44);
        estudantes.put("Plínio",41);

        System.out.println(estudantes);

        //Sobrescreve
        estudantes.put("Pedro", 55);

        System.out.println(estudantes);

        // Remove
        estudantes.remove("Pedro");

        System.out.println(estudantes);

        int idadeEstudante = estudantes.get("Mariana");

        // Pega a idade
        System.out.println(idadeEstudante);

        // Tamanho
        System.out.println(estudantes.size());

        // Navega
        for (Map.Entry<String, Integer> entry : estudantes.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }

        for (String key: estudantes.keySet()){
            System.out.println((key+" -=- "+estudantes.get(key)));
        }

        System.out.println(estudantes);
    }
}
