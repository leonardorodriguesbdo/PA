package exemplosjava;

import java.util.*;

/**
 * @author Leonardo
 */
public class ControleFluxoIF2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;
        System.out.print("Digite um valor: ");
        x = Integer.parseInt(entrada.nextLine());
        if ((x >= 1) && (x <= 10)) {
            System.out.println("Pertence ao intervalo 1..10!");
        } else {
            System.out.println("NÃO pertence ao intervalo 1..10!");
        }
    }
    
}
