/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosjava;

import java.util.Random;

/**
 *
 * @author Leonardo
 * Exercício um do slide sobre Array
 */
public class Arranjo1 {
    public static void main(String[] args){
        
        //cria o array com 10 posições
        int[] vetor = new int[10];
        
        //carrega o array com valores aleatórios
        Random rnd = new Random();
        for(int i=0; i < vetor.length; i++){
            vetor[i] = rnd.nextInt(100);
        }
        
        //percorre o array e imprime os valores
        for(int i=0;i<vetor.length;i++){
            System.out.println("valor [" + i +"] = " + vetor[i]);
        }    
        
    }
}
