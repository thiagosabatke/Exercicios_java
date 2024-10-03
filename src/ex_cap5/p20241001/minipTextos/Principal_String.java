package ex_cap5.p20241001.minipTextos;
import java.util.Scanner;

public class Principal_String {
    public static void main(String[] args) {
        String msgTitulo;
        int tam;
        msgTitulo = "Capítulo 5 - Manipulação de Strings";
        System.out.println(msgTitulo);

        Scanner Obj_In = new Scanner(System.in);
        Textos Obj_T = new Textos();

        System.out.println("---------- Verifica Tamanho do Texto ----------");
        System.out.println("Digite um texto qualquer:");
        msgTitulo = Obj_In.nextLine();

        tam = Obj_T.verificarComprimento(msgTitulo);
        System.out.println("O texto tem " + tam + " caracteres");

        System.out.println();
        System.out.println("----------- Compara 2 Textos -------------------");
        System.out.println("Digite o primeiro texto:");
        String T1 = Obj_In.nextLine();
        System.out.println("Digite o segundo texto:");
        String T2 = Obj_In.nextLine();

        boolean resultado = Obj_T.compararStrings(T1, T2);
        if (resultado) {
            System.out.println("Os textos são iguais.");
        } else {
            System.out.println("Os textos são diferentes.");
        }

        System.out.println();
        System.out.println("---- Concatenar 2 Textos -----");
        System.out.println("Digite o primeiro texto:");
        String T3 = Obj_In.nextLine();
        System.out.println("Digite o segundo texto:");
        String T4 = Obj_In.nextLine();


        String TextoCompleto = Obj_T.concatenarTextos(T3, T4);
        System.out.println("Texto concatenado: " + TextoCompleto);

        System.out.println("------------ Acessando Caracteres -------------");
        Obj_T.acessaCaracteres("TESTE", 'E');


        String texto2 = "aprendendo java";
        texto2 = texto2.trim();
        for (int i = 0; i < texto2.length(); i++) {
            char posEspaco = texto2.charAt(i);
            if (posEspaco == ' ') {
                System.out.println("O espaço esta na posição" + i);
            }
        }


        Obj_In.close();
    }
}
