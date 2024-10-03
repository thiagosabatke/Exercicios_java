package ex_cap4.classes_e_objetos.Desafio01;

public class Pessoa
{
    public String nome;
    public int idade;
    public boolean Trabalhando;

    public void mostrarDados()
    {
        System.out.println("---- Dados do Pessoa ----");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Trabalhando: " + this.Trabalhando);
        System.out.println("-------------------------");
    }
}
