package ex_cap4.classe_Scanner;
import java.util.Scanner;

public class Scanner_DESAFIO2
{
    public static void main(String[] args)
    {
        int numero1;
        Scanner Obj_Input = new Scanner(System.in);
        System.out.println("Cápitulo 04 - CLasse Scanner - Capturando Números");
        System.out.println("Digite um número inteiro maior que 10:");
        numero1 = Obj_Input.nextInt();
        if (numero1%2 != 0 && numero1%3 != 0 && numero1%5 != 0 && numero1%7 != 0)
        {
            System.out.println("O número " + numero1 + " é primo!");
        }
        else
        {
            System.out.println("O número " + numero1 + " Não é primo");
        }
        Obj_Input.close();
    }
}
