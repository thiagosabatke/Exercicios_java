package ex_cap3.exercicios;

public class exe12 
{
    public static void main(String[] args) 
    {
        int numero1 = 30;
        int numero2 = 15;
        int numero3 = 25;

        int temp;

        if (numero1 > numero2) 
        {
            temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        if (numero1 > numero3) 
        {
            temp = numero1;
            numero1 = numero3;
            numero3 = temp;
        }

        if (numero2 > numero3) 
        {
            temp = numero2;
            numero2 = numero3;
            numero3 = temp;
        }

        System.out.println("Os números em ordem crescente são: " + numero1 + ", " + numero2 + ", " + numero3);
    }
}
