package ex_cap4.classe_Scanner;
import java.util.Scanner;

public class Scanner_DESAFIO1
{
    public static void main(String[] args)
    {
        Scanner Obj_Input = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = Obj_Input.nextLine();
        System.out.println("Digite sua idade:");
        String idade = Obj_Input.nextLine();
        System.out.println("Olá " + nome + " seja bem vindo");
        System.out.println("Você tem " + idade + " anos");
        Obj_Input.close();
    }
}
