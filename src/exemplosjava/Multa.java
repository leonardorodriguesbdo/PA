package exemplosjava;

import java.util.*;

public class Multa {

    public static void main(String[] args) {
        //declaração das variáveis
        float velocidade_carro, velocidade_rua, diferenca;
        
        //Criação do scanner para leitura do teclado
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a velocidade do carro: ");
        velocidade_carro = entrada.nextFloat();
        System.out.println("Informe a velocidade maxima permitida:");
        velocidade_rua = entrada.nextFloat();

        //calcula a diferença de velocidade para checar as condições
        diferenca = velocidade_carro - velocidade_rua;

        //controle de fluxo
        if ((diferenca > 0) && (diferenca <= 10)) {
            System.out.println("A multa e de 50 reais");
        } else if ((diferenca >= 11) && (diferenca <= 30)) {
            System.out.println("A multa e de 100 reais");
        } else if (diferenca >= 31) {
            System.out.println("A multa e de 300 reais");
        } else {
            System.out.println("VOcê não foi multado");
        }
    }
}
