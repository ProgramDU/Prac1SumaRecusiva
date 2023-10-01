
package prac1sumarecursiva;

import java.util.Scanner;

public class Prac1SumaRecursiva {

    public static void main(String[] args) {
        Scanner en=new Scanner(System.in);
        int lim1, lim2;
        double resultado;
        
        System.out.println("Ingresa el limite inferior");
        lim1 = en.nextInt();
        System.out.println("Ingresa el limie superior");
        lim2 = en.nextInt();
        resultado = sumatoria(lim1, lim2);
        System.out.println("El resultado de la sumatoria es: " + resultado );
          
    }
    private static double sumatoria(int lim1, int lim2){
        if(lim1>lim2){
            return 0;
        } else {
            return Math.pow(lim1,2) + sumatoria(lim1 +1, lim2);
        }
    }
    
}

