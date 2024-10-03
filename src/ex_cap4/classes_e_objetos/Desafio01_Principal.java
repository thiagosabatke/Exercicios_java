package ex_cap4.classes_e_objetos;
import ex_cap4.classes_e_objetos.Desafio01.Pessoa;

public class Desafio01_Principal
{
    public static void main(String[] args)
    {
     Pessoa ObjPessoa1 = new Pessoa();
     Pessoa ObjPessoa2 = new Pessoa();

     ObjPessoa1.nome = "Thiago";
     ObjPessoa1.idade = 18;
     ObjPessoa1.Trabalhando = true;

     ObjPessoa2.nome = "Joao";
     ObjPessoa2.idade = 19;
     ObjPessoa2.Trabalhando = true;

     ObjPessoa1.mostrarDados();
     ObjPessoa2.mostrarDados();
    }
}
