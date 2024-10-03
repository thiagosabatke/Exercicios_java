package ex_cap4.classes_e_objetos.listaExercicios;
import ex_cap4.classes_e_objetos.listaExercicios.Exercicio01.exe01;
import ex_cap4.classes_e_objetos.listaExercicios.Exercicio02.exe02;
import ex_cap4.classes_e_objetos.listaExercicios.Exercicio03.exe03;
import ex_cap4.classes_e_objetos.listaExercicios.Exercicio04.exe04;
import ex_cap4.classes_e_objetos.listaExercicios.Exercicio05.exe05;
import ex_cap4.classes_e_objetos.listaExercicios.Exercicio06.exe06;
import ex_cap4.classes_e_objetos.listaExercicios.Exercicio07.exe07;
import ex_cap4.classes_e_objetos.listaExercicios.Exercicio08.exe08;
import ex_cap4.classes_e_objetos.listaExercicios.Exercicio09.exe09;
import ex_cap4.classes_e_objetos.listaExercicios.Exercicio10.exe10;
import ex_cap4.classes_e_objetos.listaExercicios.Exercicio11.exe11;
import ex_cap4.classes_e_objetos.listaExercicios.Exercicio12.exe12;
import ex_cap4.classes_e_objetos.listaExercicios.Exercicio13.exe13;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número da atividade");
        System.out.println("1 - Exercicio01");
        System.out.println("2 - Exercicio02");
        System.out.println("3 - Exercicio03");
        System.out.println("4 - Exercicio04");
        System.out.println("5 - Exercicio05");
        System.out.println("6 - Exercicio06");
        System.out.println("7 - Exercicio07");
        System.out.println("8 - Exercicio08");
        System.out.println("9 - Exercicio09");
        System.out.println("10 - Exercicio10");
        System.out.println("11 - Exercicio11");
        System.out.println("12 - Exercicio12");
        System.out.println("13 - Exercicio13");
        input.nextInt();

        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Exercicio 01");
                System.out.println("Imprimir Números de num1 a num2");
                exe01 ObjNum = new exe01();

                Scanner input01 = new Scanner(System.in);
                System.out.println("Digite um numero: ");
                int numero1_1 = input01.nextInt();
                System.out.println("Digite outro numero: ");
                int numero1_2 = input01.nextInt();

                if( numero1_1 > numero1_2){
                    System.out.println("Erro! 1º numero precisa ser maior que 2º numero");
                    return;
                }
                ObjNum.imprimirNumeros(numero1_1, numero1_2);
                break;

            case 2:
                System.out.println("Exercicio 02");
                System.out.println("Imprimir Números de num1 a num2 (sem extremos)");
                exe02 ObjNum2 = new exe02();

                Scanner input02 = new Scanner(System.in);
                System.out.println("Digite um numero: ");
                int numero2_1 = input02.nextInt();
                System.out.println("Digite outro numero: ");
                int numero2_2 = input02.nextInt();

                if( numero2_1 > numero2_2){
                    System.out.println("Erro! 1º numero precisa ser maior que 2º numero");
                    return;
                }
                ObjNum2.imprimirNumeros2(numero2_1, numero2_2);
                break;

            case 3:
                System.out.println("Exercicio 03");
                System.out.println("Soma dos Números de num1 até num2");
                exe03 ObjSoma = new exe03();

                Scanner input3 = new Scanner(System.in);
                System.out.println("Digite um numero: ");
                int numero3_1 = input3.nextInt();
                System.out.println("Digite outro numero: ");
                int numero3_2 = input3.nextInt();

                if( numero3_1 > numero3_2){
                    System.out.println("Erro! 1º numero precisa ser maior que 2º numero");
                    return;
                }
                ObjSoma.somarNumeros(numero3_1, numero3_2);
                break;
            case 4:
                System.out.println("Exercicio 04");
                System.out.println("Múltiplos de num1 entre num2 e num3");
                exe04 ObjMultiplo = new exe04();

                Scanner input04 = new Scanner(System.in);
                System.out.println("Digite o primeiro numero: ");
                int numero4_1 = input04.nextInt();
                System.out.println("Digite o segundo numero: ");
                int numero4_2 = input04.nextInt();
                System.out.println("Digite o terçeiro numero: ");
                int numero4_3 = input04.nextInt();

                ObjMultiplo.calculoMultiplo(numero4_1, numero4_2, numero4_3);
                break;

            case 5:
                System.out.println("Exercicio 05");
                System.out.println("Fatorial de num1 a num2");
                exe05 ObjFatorial = new exe05();

                Scanner input05 = new Scanner(System.in);
                System.out.println("Digite um numero: ");
                int numero5_1 = input05.nextInt();
                System.out.println("Digite outro numero: ");
                int numero5_2 = input05.nextInt();

                if(numero5_1 > numero5_2){
                    System.out.println("Erro: num1 deve ser menor outr igual a num2");
                } else {
                    for (int i = numero5_1; i <= numero5_2; i++){
                        System.out.println("O fatorial de " + i + " é: " + ObjFatorial.calcularFatorial(i));
                    }
                }
                break;

            case 6:
                System.out.println("Exercicio 06");
                System.out.println("Números da Série de Fibonacci até passar de num1");
                exe06 Objfibonacci = new exe06();

                Scanner input06 = new Scanner(System.in);
                System.out.println("Digite um numero: ");
                int numero6_1 = input06.nextInt();

                Objfibonacci.Fibonacci(numero6_1);
                break;

            case 7:
                System.out.println("Exercicio 07");
                System.out.println("Cálculo de y com base em x");
                exe07 ObjCalculox_y = new exe07();

                Scanner input07 = new Scanner(System.in);
                System.out.println("Digite o valor para x: ");
                int numero7_1 = input07.nextInt();

                ObjCalculox_y.calcularY(numero7_1);
                break;

            case 8:
                System.out.println("Exercicio 08");
                System.out.println("Tabela com For Encadeados");
                exe08 ObjTabela = new exe08();

                Scanner input08 = new Scanner(System.in);
                System.out.println("Digite o valor: ");
                int numero8_1 = input08.nextInt();

                ObjTabela.tabelaEncadeada(numero8_1);
                break;

            case 9:
                System.out.println("Exercicio 09");
                System.out.println("Cálculo de Folha de Pagamento");
                exe09 ObjPagamento = new exe09();

                Scanner inputPagamento = new Scanner(System.in);
                System.out.println("Digite o nome do funcionario: ");
                String nomeFuncionario = inputPagamento.nextLine();
                Scanner inputPagamento2 = new Scanner(System.in);
                System.out.println("Digite o valor da hora: ");
                double valorHora = inputPagamento2.nextDouble();
                Scanner inputPagamento3 = new Scanner(System.in);
                System.out.println("Digite a quantidade de horas trabalhadas: ");
                int horasTrabalhadas = inputPagamento3.nextInt();

                ObjPagamento.calculoPagamento(nomeFuncionario,valorHora,horasTrabalhadas);
                break;

            case 10:
                System.out.println("Exercicio 10");
                System.out.println("Cálculo de Reajuste Salarial");

                Scanner input10 = new Scanner(System.in);
                System.out.println("Digite o salário atual do funcionario: ");
                double salarioAtual = input10.nextDouble();

                exe10 reajuste = new exe10();
                reajuste.calcularReajuste(salarioAtual);
                break;

            case 11:
                System.out.println("Exercicio 11");
                System.out.println("Maior e Menor entre Três Números");

                Scanner input11 = new Scanner(System.in);
                System.out.println("Digite o primeiro numero: ");
                int numero11_1 = input11.nextInt();
                System.out.println("Digite o segundo numero: ");
                int numero11_2 = input11.nextInt();
                System.out.println("Digite o terceiro numero: ");
                int numero11_3 = input11.nextInt();

                exe11 Numeros = new exe11();
                Numeros.MaiorMenor(numero11_1,numero11_2,numero11_3);
                break;

            case 12:
                System.out.println("Exercicio 12");
                System.out.println("Ordem Crescente de Três Números");
                Scanner input12 = new Scanner(System.in);
                System.out.println("Digite o primeiro numero: ");
                int numero12_1 = input12.nextInt();
                System.out.println("Digite o segundo numero: ");
                int numero12_2 = input12.nextInt();
                System.out.println("Digite o terceiro numero: ");
                int numero12_3 = input12.nextInt();

                exe12 Nums = new exe12();
                Nums.ordenarNumeros(numero12_1, numero12_2,numero12_3);
                break;

            case 13:
                System.out.println("Exercicio 13");
                System.out.println("Ordem Decrescente de Quatro Números");
                Scanner input13 = new Scanner(System.in);
                System.out.println("Digite o primeiro numero: ");
                int numero13_1 = input13.nextInt();
                System.out.println("Digite o segundo numero: ");
                int numero13_2 = input13.nextInt();
                System.out.println("Digite o terceiro numero: ");
                int numero13_3 = input13.nextInt();
                System.out.println("Digite o quarto numero: ");
                int numero13_4 = input13.nextInt();

                exe13 decrescente = new exe13();
                decrescente.ordenarDecrescente(numero13_1,numero13_2,numero13_3,numero13_4);
                break;

            default:
                System.out.println("ERRO! opção inválida!");
                break;

        }
    }
}

