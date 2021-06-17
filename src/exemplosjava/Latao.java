package exemplosjava;

import java.util.*;

public class Latao{
     public static void main(String[] args){
        //declaração de variáveis
        double qtde, cobre, zinco; 
     
        //inicializa a classe scanner para capturar informações do teclado
        Scanner entrada = new Scanner(System.in);
        //Imprimir na tela a pergunta
        System.out.print("Entre com a quantidade de Latão desejada: ");
        //atribuir a variável qtde o valor digitado pelo usuário
        qtde = entrada.nextInt();
        
        //calculos
        cobre = qtde * 0.7;
        zinco = qtde * 0.3;
           
        //exibição dos resultados na tela
        System.out.println ("O peso necessário de cobre é: " + cobre + "\n" + 
                " e o peso necessário de zinco e: " + zinco);
        
     }

}
