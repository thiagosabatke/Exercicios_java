package ex_cap4.classes_e_objetos.listaExercicios.Exercicio04;

public class exe04 {

    public void calculoMultiplo(int num1, int num2, int num3) {

        System.out.println("Múltiplos de " + num1 + " entre " + num2 + " e " + num3 + ":");
        for (int i = num2; i <= num3; i++) {
            if (i % num1 == 0) {
                System.out.println(i);
            }
        }
    }
}
