/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosjava;

/**
 *
 * @author Leonardo
 * Escreva um programa em java, que imprima na tela os números de 0 a 100;
 */
public class Repeticao1 {
    public static void main(String[] args){
        
        //Utilizando o laço for para imprimir os numeros        
        for(int i=0;i<=100;i++){
            System.out.println("valor = " + i);
        }
        
        int j = 0;
        while(j<=100){
            System.out.println("valor = " + j);
            j++; //incrementa o j
        }
    }
}
