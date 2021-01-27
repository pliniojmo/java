import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;

    public Pessoa (String nome, int ano, int mes, int dia){
        this.nome = nome;
        this.dataNascimento = LocalDate.of(ano,mes,dia);
    }

    public int calcularIdade(){
        return Period.between(dataNascimento,LocalDate.now()).getYears();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa [ " +
                "nome ='" + nome + '\'' +
                ", Data de Nascimento= " + dataNascimento +
                ", Idade: " + calcularIdade() + " ]";
    }
}
