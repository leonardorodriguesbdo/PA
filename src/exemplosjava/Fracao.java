package exemplosjava;

import java.util.*;

public class Fracao {

    public static void main(String[] args) {
        //declaração das variáveis
        float n1, n2, n3;
        
        //Criação do scanner para leitura do teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        n1 = entrada.nextFloat();
        System.out.println("Digite o segundo numero: ");
        n2 = entrada.nextFloat();
        System.out.println("Digite o terceiro numero: ");
        n3 = entrada.nextFloat();

        //controle de fluxo
        if (n1 > (n2 + n3)) {
            System.out.println("Esse número é maior");
        } else {
            System.out.println("Esse número é menor");
        }
    }
}
