package ex_cap4.classes_e_objetos.listaExercicios.Exercicio03;

public class exe03 {
    public int soma = 0;

    public void somarNumeros(int num1, int num2) {


        for (int i = num1; i <=num2; i ++) {
            System.out.println(i);
            soma += i;
            System.out.println("Soma: " + soma);
        }
        System.out.println();
    }
}
