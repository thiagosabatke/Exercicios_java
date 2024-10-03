package ex_cap4.classes_e_objetos.listaExercicios.Exercicio12;

public class exe12 {
    public void ordenarNumeros(int num1, int num2, int num3) {

        int variavel;

        if (num1 > num2) {
            variavel = num1;
            num1 = num2;
            num2 = variavel;
        }
        if (num1 > num3) {
            variavel = num1;
            num1 = num3;
            num3 = variavel;
        }
        if (num2 > num3) {
            variavel = num2;
            num2 = num3;
            num3 = variavel;
        }

        System.out.println("Numeros em ordem crecente:" + num1 + ", " + num2 + ", " + num3);
    }
}

