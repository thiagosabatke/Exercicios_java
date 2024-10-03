package ex_cap4.classe_Scanner;
import java.util.Scanner;

public class Scanner_DESAFIO4
{
    public static void main(String[] args)
    {
        String Nome;
        boolean Estudante;
        Scanner Input = new Scanner(System.in);
        System.out.println("Capitulo 04 - Classe Scanner - Capturando BOOLEANOS");
        System.out.println("Digite o nome do aluno: ");
        Nome = Input.nextLine();
        System.out.println("é estudante?(true/false): ");
        Estudante = Input.nextBoolean();

        System.out.println("___________");
        System.out.println("Dados capturados");
        System.out.println("Nome: " + Nome);
        if (Estudante)
        {
            System.out.println("Situação: Aluno");
        }
        else
        {
            System.out.println("Situação: Não é aluno");
        }
        Input.close();
    }
}
