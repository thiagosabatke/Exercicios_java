package ex_cap4.classes_e_objetos.listaExercicios.Exercicio06;

public class exe06 {
    public void Fibonacci(int num1) {
        int primeiro_num = 0;
        int segundo_num = 1;

        System.out.println(primeiro_num);
        System.out.println(segundo_num);

        int proximo = primeiro_num + segundo_num;

        while (proximo <= num1){
            System.out.println(proximo);
            primeiro_num = segundo_num;
            segundo_num = proximo;
            proximo = primeiro_num + segundo_num;
        }
    }
}
