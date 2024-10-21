package ex_cap6.p20241015.Exercicios;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Capitulo 6 - exercicios");
        ListaExercicios exercicios = new ListaExercicios();
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecione um exercício:");
        System.out.println("1 - Exercicio 01: Soma de Elementos");
        System.out.println("2 - Exercicio 02: Menor e Maior");
        System.out.println("3 - Exercicio 03: Pares e Ímpares");
        System.out.println("4 - Exercicio 04: Inverter Array");
        System.out.println("5 - Exercicio 05: Ordenar Array");
        System.out.println("6 - Exercicio 06: Buscar Valor");
        System.out.println("7 - Exercicio 07: Duplicar Array");
        System.out.println("8 - Exercicio 08: Remover Duplicatas");
        System.out.println("9 - Exercicio 09: Média");
        System.out.println("10 - Exercicio 10: Transposição de Matriz");
        int exercicio = sc.nextInt();

        switch (exercicio){
            case 1:
                exercicios.exe01();
                break;
                case 2:
                    exercicios.exe02();
                    break;
            case 3:
                exercicios.exe03();
                break;
            case 4:
                exercicios.exe04();
                break;
            case 5:
                exercicios.exe05();
                break;
            case 6:
                exercicios.exe06();
                break;
            case 7:
                exercicios.exe07();
                break;
            case 8:
                exercicios.exe08();
                break;
            case 9:
                exercicios.exe09();
                break;
            case 10:
                exercicios.exe10();
                break;
            default:
                System.out.println("Digite um numero válido");
                break;
        }
        sc.close();
    }
}
