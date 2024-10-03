package ex_cap4.classes_e_objetos.listaExercicios.Exercicio13;

public class exe13 {
    public void ordenarDecrescente(int num1,int num2, int num3, int num4){
        int variavel;

        if (num1 < num2)
        {
            variavel = num1;
            num1 = num2;
            num2 = variavel;
        }

        if (num1 < num3)
        {
            variavel = num1;
            num1 = num3;
            num3 = variavel;
        }

        if (num1 < num4)
        {
            variavel = num1;
            num1 = num4;
            num4 = variavel;
        }

        if (num2 < num3)
        {
            variavel = num2;
            num2 = num3;
            num3 = variavel;
        }

        if (num2 < num4)
        {
            variavel = num2;
            num2 = num4;
            num4 = variavel;
        }

        if (num3 < num4)
        {
            variavel = num3;
            num3 = num4;
            num4 = variavel;
        }

        System.out.println("Números em ordem decrescente: " + num1 + ", " + num2 + ", " + num3 + ", " + num4);
    }
}
