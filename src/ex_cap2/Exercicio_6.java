package ex_cap2;

public class Exercicio_6 {
    public static void main(String[] args){
        double valor_litro_combustivel = 6.50;
        double consumo_carro = 12;
        double distancia_percorrida = 100;

        double total_gasto = (distancia_percorrida / consumo_carro) * valor_litro_combustivel;
        System.out.println("Total gasto: " + total_gasto);
    }
}
