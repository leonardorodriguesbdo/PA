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
 * 
 * Codigo aperfeiçoado, utilizando classes prontas do java
 * 
 */
public class Arranjo41 {
    public static void main(String[] args){
        //Inicializa o arrays com os nomes da turma
        int[] numeros = new int[10];
        
        //inicializa a classe scanner para capturar informações do teclado
        Scanner entrada= new Scanner(System.in); 
        for (int i=0; i<numeros.length; i++){
            System.out.print("Entre com o valor " + (i+1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        
        //imprime a entrada em forma de vetor
        System.out.println("Entrada: " + Arrays.toString(numeros));
        
        //ordenando o array com o método nativo Java 
        Arrays.sort(numeros);
        
        //imprime o array ordenado
        System.out.println("Entrada ordenada: " + Arrays.toString(numeros));
    }
}
