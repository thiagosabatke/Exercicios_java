package ex_cap5.p20241001.minipTextos;

public class Textos {

    /*Desafio 02*/
    public int verifComprimento(String texto) {
        return texto.length();
    }

    /* Desafio 04*/
    public boolean compararStrings1(String texto1, String texto2) {
        return texto1.equals(texto2);
    }

    /* Desafio 05 */
    public boolean compararStrings2(String texto1, String texto2) {
        return texto1.equalsIgnoreCase(texto2);
    }

    /* Desafio 06*/
    public String concatenarStrings1(String texto1, String texto2) {
        return texto1 +" "+ texto2;
    }

    /* Desafio 07*/
    public String concatenarStrings2(String texto1, String texto2) {
        return texto1.concat(" ").concat(texto2);
    }

    /* Desafio 08 */
    public int contandoLetras(String frase, char letra) {
        int contagem = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contagem++;
            }
        }
        return contagem;
    }

    /* Desafio 09 */
    public int contaPalavras(String texto, String palavra) {
        String[] palavras = texto.split(" ");
        int contagem = 0;
        for (String p : palavras) {
            if (p.equals(palavra)) {
                contagem++;
            }
        }
        return contagem;
    }

    /* Desafio 10 */
    public String alterarTexto(String texto, String palavraAntiga, String palavraNova) {
        return texto.replace(palavraAntiga, palavraNova);
    }

    /* Desafio 11 */
    public String criptografarZENITPOLAR(String texto) {
        texto = texto.toUpperCase();
        StringBuilder criptografado = new StringBuilder();
        for (char c : texto.toCharArray()) {
            switch (c) {
                case 'Z': criptografado.append('P'); break;
                case 'E': criptografado.append('O'); break;
                case 'N': criptografado.append('L'); break;
                case 'I': criptografado.append('A'); break;
                case 'T': criptografado.append('R'); break;
                case 'P': criptografado.append('Z'); break;
                case 'O': criptografado.append('E'); break;
                case 'L': criptografado.append('N'); break;
                case 'A': criptografado.append('I'); break;
                case 'R': criptografado.append('T'); break;
                default: criptografado.append(c); break;
            }
        }
        return criptografado.toString();
    }

    /* Desafio 12 */
    public String criptografarPERNAMBUCO(String texto) {
        texto = texto.toUpperCase();
        StringBuilder criptografado = new StringBuilder();
        for (char c : texto.toCharArray()) {
            switch (c) {
                case 'P': criptografado.append('9'); break;
                case 'E': criptografado.append('8'); break;
                case 'R': criptografado.append('7'); break;
                case 'N': criptografado.append('6'); break;
                case 'A': criptografado.append('5'); break;
                case 'M': criptografado.append('4'); break;
                case 'B': criptografado.append('3'); break;
                case 'U': criptografado.append('2'); break;
                case 'C': criptografado.append('1'); break;
                case 'O': criptografado.append('0'); break;
                default: criptografado.append(c); break;
            }
        }
        return criptografado.toString();
    }
}