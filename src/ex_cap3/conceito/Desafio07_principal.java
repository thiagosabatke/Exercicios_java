package ex_cap3.conceito;


public class Desafio07_principal {
    public static void main(String[] args) {
        System.out.println("Iniciando Desafio07");

        for (int i = 10; i <= 40; i++) {
            
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.println(i); 
            }
        }
    }
}
