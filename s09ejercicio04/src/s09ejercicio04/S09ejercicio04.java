/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s09ejercicio04;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S09ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // mostrar mensaje al usuario 
        System.out.print("Ingresa una letra: ");
        String s = input.nextLine();
                
        char ch = s.charAt(0);        
                
        if (Character.isLetter(ch)) {                        
            switch (Character.toUpperCase(ch)) {
                case 'A': // if( ch == 'A' )
                case 'E': // else if( ch == 'E' )
                case 'I': // else if( ch == 'I' )
                case 'O': // else if( ch == 'O' )
                case 'U': // else if( ch == 'U' )
                    System.out.println(ch + " es una vocal.");                
                    break;
                default: // else
                    System.out.println(ch + " es una consonante.");                    
            }                        
        } else {
            System.out.println(ch + " es una entrada invalida.");            
        }
        
    }
    
}
