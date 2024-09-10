package ex_cap3.exercicios;

public class exe03 
{
    public static void main(String[] args) 
    {
        System.out.println("Imprimindo a soma de todos os numeros entre 1 e 1000");
        int soma = 0;

        for (int i = 1; i <=1000; i ++)
        {
            soma += i;
            System.out.println(soma);
            
        }
    }
}
