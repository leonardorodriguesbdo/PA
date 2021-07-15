/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosjava;

/**
 *
 * @author Leonardo
 * Declaração de arrays
 */
public class Arranjo {
    public static void main(String[] args){
        
        //cria e inicializa com valores
        int[] primes = {2,3,5,7,11,13,17,19,23,29};
        
        for(int i=0;i<primes.length;i++){
            System.out.println("valor [" + i +"] = " + primes[i]);
        }
        
        //cria e inicializa os valores com null
        String[] nomes = new String[3]; 
        nomes[0] = "leonardo";
        nomes[1] = "Ruth";
        nomes[2] = "Raynara";
        
        for(String n: nomes){  //foreach
            System.out.println("nome  = " + n);
        }
        
        
    }
}
