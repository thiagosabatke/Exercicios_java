package ex_cap4.classes_e_objetos.listaExercicios.Exercicio01;

public class exe01 {

    public int num1, num2;

    public void imprimirNumeros(int num1, int num2) {

        System.out.println("Numeros entre: " + num1 + " e " + num2);

        for(int i = num1; i <= num2; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
