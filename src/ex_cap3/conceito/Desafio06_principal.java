package ex_cap3.conceito;

public class Desafio06_principal 
{
    public static void main(String[] args) 
    {
        System.out.println("DESAFIO 6 – Estrutura de Repetição FOR");
        System.out.println("imprimindo numeros impares de 0 ate 10");

        for(int i = 0; i <=10; i++)
        {
            if (i % 2 !=0) {
                System.out.println(i);
            }
        }
        System.out.println("Desafio6 finalizado");
    }    
}
