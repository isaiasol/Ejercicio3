/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotrescentfaren;
import java.util.Scanner;
/**
 *
 * @author OrtizL
 */
public class EjercicioTresCentFaren {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double cent, faren;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce la temperatura en ºC");
        cent=teclado.nextDouble();
        faren=(cent * 9/5) + 32;
        System.out.println(cent+"ºC equivalen a " +faren+ " ºF" );
    }
    
}
