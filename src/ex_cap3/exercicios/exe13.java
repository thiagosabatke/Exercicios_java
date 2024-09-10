package ex_cap3.exercicios;

public class exe13 
{
    public static void main(String[] args) 
    {
        int numero1 = 12;
        int numero2 = 45;
        int numero3 = 32;
        int numero4 = 20;

        int temp;

        if (numero1 < numero2) 
        {
            temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        if (numero1 < numero3) 
        {
            temp = numero1;
            numero1 = numero3;
            numero3 = temp;
        }

        if (numero1 < numero4) 
        {
            temp = numero1;
            numero1 = numero4;
            numero4 = temp;
        }

        if (numero2 < numero3) 
        {
            temp = numero2;
            numero2 = numero3;
            numero3 = temp;
        }

        if (numero2 < numero4)
        {
            temp = numero2;
            numero2 = numero4;
            numero4 = temp;
        }

        if (numero3 < numero4) 
        {
            temp = numero3;
            numero3 = numero4;
            numero4 = temp;
        }
        
        System.out.println("Os números em ordem decrescente são: " + numero1 + ", " + numero2 + ", " + numero3 + ", " + numero4);
    }
}
