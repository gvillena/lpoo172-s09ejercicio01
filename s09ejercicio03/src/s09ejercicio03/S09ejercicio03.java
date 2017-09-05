/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s09ejercicio03;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S09ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // mostrar mensaje al usuario 
        System.out.print("Ingrese un valor entero (0 a 15): ");
        int numero = input.nextInt();
                                
        // Mostrar el caracter hexadecimal correspondiente
        if (numero >= 0 && numero <= 9) {
            System.out.println("El valor hexdecimal es " + numero);
        } else if (numero >= 10 && numero <= 15 ) { 
            System.out.println("El valor hexdecimal es " + (char)(numero + 'A' - 10));
        } else {
            System.out.println("El numero ingresado es invalido.");
        }
        
    }
    
}
