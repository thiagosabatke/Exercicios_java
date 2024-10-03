package ex_cap4.classes_e_objetos.classes_Retorno;

import ex_cap4.classes_e_objetos.classes_Retorno.Desafio01.Calculadora;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Calculadora calc1 = new Calculadora();
        double num1, num2;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        num1 = input.nextDouble();
        System.out.println("Digite o segundo valor: ");
        num2 = input.nextDouble();

        System.out.println("Escolha a operação que deseja realizar:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");

        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(calc1.soma(num1, num2));
                break;
            case 2:
                System.out.println(calc1.subtracao(num1, num2));
                break;
            case 3:
                System.out.println(calc1.multiplicacao(num1, num2));
                break;
            case 4:
                System.out.println(calc1.divisao(num1, num2));
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
