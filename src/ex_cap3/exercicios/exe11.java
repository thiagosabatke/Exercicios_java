package ex_cap3.exercicios;

public class exe11 
{
    public static void main(String[] args) 
    {
        int numero1 = 25;
        int numero2 = 10;
        int numero3 = 42;

        int maior = numero1;
        int menor = numero1;

        if (numero2 > maior) 
        {
            maior = numero2;
        }
        if (numero3 > maior) 
        {
            maior = numero3;
        }

        if (numero2 < menor) 
        {
            menor = numero2;
        }
        if (numero3 < menor) 
        {
            menor = numero3;
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }   
}
