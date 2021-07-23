package exemplosjava;
import java.util.Scanner;
/**
 * @author Leonardo
 */
public class Funcao_Ex {
    public static void main(String[] args){
        int opcao;
        do{
            opcao = MostraMenu();
        }while(opcao != 2);
        
    }
    
    public static int MostraMenu(){
        Scanner ent = new Scanner(System.in);
        System.out.println("#################################");
        System.out.println("#####          MENU         #####");
        System.out.println("#################################"); 
        System.out.println("# 1 - Mostrar de novo           #");
        System.out.println("# 2 - Sair                      #");
        return Integer.parseInt(ent.nextLine());
    }
    
    /*public static double calcDesc(double va, double pc) {
        double vd= va* (pc/ 100);
        return va-vd;
    }*/
}

