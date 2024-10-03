package ex_cap4.classes_e_objetos.listaExercicios.Exercicio05;

public class exe05 {
    public int calcularFatorial(int n) {
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return n * calcularFatorial(n - 1);
        }
    }
}
