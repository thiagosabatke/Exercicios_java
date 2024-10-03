package ex_cap4.classes_e_objetos.listaExercicios.Exercicio07;

public class exe07 {
    public void calcularY(int valor_x){
        int y;

        while (valor_x != 1){
            if(valor_x % 2 == 0){
                System.out.println(valor_x+ "/2 =" );
                y = valor_x/2;
            } else {
                System.out.println("3 *" + valor_x + "+ 1");
                y =( 3 * valor_x) + 1;
            }

            System.out.println("valor de y: " + y);

            if (y != 1) {
                System.out.println("--------");
            }
            valor_x = y;
        }
    }
}
