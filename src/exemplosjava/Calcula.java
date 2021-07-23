/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosjava;

import java.util.Scanner;

/**
 *
 * @author Leonardo
 */
public class Calcula {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o valor 1: ");
        double v1 = entrada.nextDouble();
        System.out.println("Entre com o valor 2: ");
        double v2 = entrada.nextDouble();
        
        System.out.println("Resultado: " + soma(v1, v2));
    }
    
    public static double soma(double valor1, double valor2){
        double resultado = valor1 + valor2;
        return resultado;
    }
    
}
