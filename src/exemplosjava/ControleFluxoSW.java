package exemplosjava;

import java.util.*;

/**
 * @author Leonardo
 */
public class ControleFluxoSW {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int x = Integer.parseInt(entrada.nextLine());
        switch(x)
        {
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            default:
                System.out.println("Desconhecido");
                break;
        }
    }
}
