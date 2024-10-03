package ex_cap4.classe_Scanner;
import java.util.Scanner;

public class Scanner_DESAFIO3
{
    public static void main(String[] args)
    {
        double numero1, numero2, resultado = 0;
        String Operacao = "Z";

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cápitulo 04 - Classe Scanner - Capturando Números");
        while (!Operacao.equalsIgnoreCase("X"))
        {
            System.out.println("Qual é a matemática deseja realizar:");
            System.out.println("(A) Soma");
            System.out.println("(B) Subtração");
            System.out.println("(C) Multiplicação");
            System.out.println("(D) Divisão");
            System.out.println("(X) Sair");
            Operacao = entrada.nextLine();

            if (Operacao.equalsIgnoreCase("X"))
            {
                break;
            }
            if (!Operacao.equalsIgnoreCase("A") && !Operacao.equalsIgnoreCase("B") && !Operacao.equalsIgnoreCase("C") && !Operacao.equalsIgnoreCase("D"))
            {
                System.out.println("válor inválido, Tente novamente");
            }
            else
            {
                System.out.println("---------");
                System.out.println("Digite o primeiro numero: ");
                numero1 = entrada.nextDouble();
                System.out.println("Digite o segundo numero: ");
                numero2 = entrada.nextDouble();

                if (Operacao.equalsIgnoreCase("A"))
                {
                    System.out.println("Soma");
                    resultado = numero1 + numero2;
                }
                else if (Operacao.equalsIgnoreCase("B"))
                {
                    System.out.println("Subtracao");
                    resultado = numero1 - numero2;
                }
                else if (Operacao.equalsIgnoreCase("C"))
                {
                    System.out.println("Multiplicacao");
                    resultado = numero1 * numero2;
                } else if (Operacao.equalsIgnoreCase("D"))
                {
                    System.out.println("Divisao");
                    resultado = numero1 / numero2;
                }
                System.out.println("Resultado: " + resultado);
            }
            System.out.println("");
            System.out.println("");
        }
        System.out.println("FIM");
        entrada.close();
    }
}
