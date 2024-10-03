package ex_cap4.classes_e_objetos.Desafio03;

public class Calculadora {

    public double N1, N2, R;

    public void soma(){
        R = N1 + N2;
    }
    public void subtracao(){
        R = N1 - N2;
    }
    public void divisao(){
        R = N1 / N2;
    }
    public void multiplicacao(){
        R = N1 * N2;
    }
    public void mostraResultado(){
        System.out.println("O resultado é: " + R);
    }

}
