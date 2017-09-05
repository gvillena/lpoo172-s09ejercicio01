/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s09ejercicio01;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S09ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // mostrar mensaje al usuario 
        System.out.print("Ingrese la distancia entre el centro del pentagono a uno de sus vertices: ");
        double r = input.nextDouble();
        
        // calcular el area del pentagono 
        double s = (2 * r) * Math.sin( Math.PI / 5); // ancho de un lado
        double area = (5 * Math.pow(s, 2)) /  (4 * Math.tan(Math.PI / 5));
        
        
        
        // mostrar resultado
        System.out.println("El area del pentagono es: " + area);
        
        
         
        
        
    }
    
}
