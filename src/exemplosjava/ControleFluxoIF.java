package exemplosjava;

import java.util.*;

/**
 * @author Leonardo
 */
public class ControleFluxoIF {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;
        System.out.print("Digite um valor: ");
        x = Integer.parseInt(entrada.nextLine());
        if (x > 0) {
            System.out.println("O número é positivo!");
        } else {
            System.out.println("O número é negativo ou neutro!");
        }
    }
    
}
