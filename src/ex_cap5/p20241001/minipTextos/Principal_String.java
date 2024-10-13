package ex_cap5.p20241001.minipTextos;
import java.util.Scanner;

public class Principal_String {
    public static void main(String[] args) {
        // Desafio 01
        String msgTitulo = "Capítulo 05 – Trabalhando com Strings";
        System.out.println(msgTitulo);

        Textos textos = new Textos();
        Scanner scanner = new Scanner(System.in);

        // Desafio 02
        System.out.println("---------- Verifica tamanho da texto 1 ----------");
        String texto = "Exemplo de texto";
        System.out.println("Texto: " + texto);
        System.out.println("O comprimento do texto é: " + textos.verifComprimento(texto));

        // Desafio 03
        System.out.println("---------- Verifica tamanho do texto 2 ----------");
        System.out.println("Digite um texto:");
        texto = scanner.nextLine();
        System.out.println("O comprimento do texto é: " + textos.verifComprimento(texto));

        // Desafio 04
        System.out.println("---------- Compara strings 1 ----------");
        System.out.println("Digite o primeiro texto:");
        String texto1 = scanner.nextLine();
        System.out.println("Digite o segundo texto:");
        String texto2 = scanner.nextLine();
        boolean comparacao1 = textos.compararStrings1(texto1, texto2);
        if (comparacao1) {
            System.out.println("Os textos são iguais.");
        } else {
            System.out.println("Os textos são diferentes.");
        }

        // Desafio 05
        System.out.println("---------- Compara strings 2 ignoreCase ----------");
        System.out.println("Digite o primeiro texto:");
        texto1 = scanner.nextLine();
        System.out.println("Digite o segundo texto:");
        texto2 = scanner.nextLine();
        boolean comparacao2 = textos.compararStrings2(texto1, texto2);
        if (comparacao2) {
            System.out.println("Os textos são iguais, ignorando maiúsculas e minúsculas.");
        } else {
            System.out.println("Os textos são diferentes.");
        }

        // Desafio 06
        System.out.println("---------- Concatenar strings 1 ----------");
        System.out.println("Digite o primeiro texto:");
        texto1 = scanner.nextLine();
        System.out.println("Digite o segundo texto:");
        texto2 = scanner.nextLine();
        String resultadoConcatenacao1 = textos.concatenarStrings1(texto1, texto2);
        System.out.println("Texto concatenado: " + resultadoConcatenacao1);

        // Desafio 07
        System.out.println("---------- Concatenar strings 2 concat() ----------");
        System.out.println("Digite o primeiro texto:");
        texto1 = scanner.nextLine();
        System.out.println("Digite o segundo texto:");
        texto2 = scanner.nextLine();
        String resultadoConcatenacao2 = textos.concatenarStrings2(texto1, texto2);
        System.out.println("Texto concatenado: " + resultadoConcatenacao2);

        // Desafio 08
        System.out.println("---------- Quantidade de letras ----------");
        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();
        System.out.println("Digite uma letra:");
        char letra = scanner.next().charAt(0);
        int quantidadeLetras = textos.contandoLetras(frase, letra);
        System.out.println("A letra '" + letra + "' aparece " + quantidadeLetras + " vezes.");

        // Desafio 09
        System.out.println("---------- Quantidade de palavras ----------");
        scanner.nextLine(); // Limpa o buffer
        System.out.println("Digite um texto:");
        texto = scanner.nextLine();
        System.out.println("Digite uma palavra:");
        String palavra = scanner.nextLine();
        int ocorrencias = textos.contaPalavras(texto, palavra);
        if (ocorrencias > 0) {
            System.out.println("O texto possui " + ocorrencias + " ocorrências da palavra '" + palavra + "'.");
            System.out.println("A palavra: " + palavra + " aparece" + ocorrencias + " vezes.");
        } else {
            System.out.println("O texto não possui a palavra '" + palavra + "'.");
        }

        // Desafio 10
        System.out.println("---------- Alterar texto ----------");
        System.out.println("Digite um texto:");
        texto = scanner.nextLine();
        System.out.println("Digite a palavra a ser trocada:");
        String palavraAntiga = scanner.nextLine();
        System.out.println("Digite a nova palavra:");
        String palavraNova = scanner.nextLine();
        String novoTexto = textos.alterarTexto(texto, palavraAntiga, palavraNova);
        System.out.println("Novo texto: " + novoTexto);

        // Desafio 11
        System.out.println("---------- Criptografar texto ZENITPOLAR ----------");
        System.out.println("Digite um texto para criptografar (ZENIT POLAR):");
        texto = scanner.nextLine();
        String textoCriptografadoZENITPOLAR = textos.criptografarZENITPOLAR(texto);
        System.out.println("Texto criptografado: " + textoCriptografadoZENITPOLAR);

        // Desafio 12
        System.out.println("---------- Criptografar texto PERNANBUCO ----------");
        System.out.println("Digite um texto para criptografar (PERNAMBUCO):");
        texto = scanner.nextLine();
        String textoCriptografadoPERNAMBUCO = textos.criptografarPERNAMBUCO(texto);
        System.out.println("Texto criptografado: " + textoCriptografadoPERNAMBUCO);

        scanner.close();
    }
}