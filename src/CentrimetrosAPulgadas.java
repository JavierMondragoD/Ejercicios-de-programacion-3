/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOSE JAVIER
 */
import java.util.Scanner;
public class CentrimetrosAPulgadas {

    /**
     * @param args the command line arguments
     */
        public static void main(String Args []){
                Scanner t = new Scanner(System.in);
               
                double valorCentimetros = 2.54;
                double pulgadas, centimetros;
               
                System.out.print("Valor en pulgadas: ");
                pulgadas = t.nextDouble();
               
                centimetros = pulgadas * valorCentimetros;
               
                System.out.println("Valor en Centímetros: " + centimetros);
        }
}
