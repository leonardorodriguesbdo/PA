/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosjava;

import java.util.*;
/**
 * @author Leonardo
 * Crie uma lista de números que armazene 10 números inteiros.
 * Solicitar ao usuário que informe cada um destes números; Colocar todo o array
 * em ordem crescente; Mostrar o array ordenado na tela.
 */
public class Arranjo4 {
    public static void main(String[] args){
        //Inicializa o arrays com os nomes da turma
        int[] numeros = new int[10];
        //variável para guardar o valor que irá mudar de posição
        int aux = 0;
        
        //inicializa a classe scanner para capturar informações do teclado
        Scanner entrada= new Scanner(System.in); 
        for (int i=0; i<numeros.length; i++){
            System.out.print("Entre com o valor " + (i+1) + ": ");
            //guarda no array o valor digitado
            numeros[i] = entrada.nextInt();
        }
        
        System.out.println("entrada: " + Arrays.toString(numeros));
        
        //ordenando o array, estrategia utilizada: percorrer cada elemento do array testando 
        //se o proximo elemento é maior que o anterior, so for troca de posição e continua testando. 
        //Sugestão leia sobre o algoritmo bublesort
        for(int x = 0; x < numeros.length; x++){ //percorre todos os elementos do array
            for(int y = 0; y < numeros.length-1; y++){//não preciso chegar no ultimo valor do array, pois o teste [y+1] ja faz isso
                //se o primeiro elemento for maior que o segundo, muda de posição
                if(numeros[y] > numeros[y+1]){
                    aux = numeros[y];
                    numeros[y] = numeros[y+1];
                    numeros[y+1] = aux;
                }
            }
        }
        
        //Imprime o array no formato [1, 2, 3,...]
        String vetor = "[";
        for(int i=0; i<numeros.length; i++){
            if (i==numeros.length-1)
                vetor = vetor + numeros[i] + "]";
            else
                vetor = vetor + numeros[i] + ", ";
        }
        
        System.out.println("Entrada ordenada: " + vetor);
    }
}
