/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s09ejercicio02;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S09ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
                
        String set1 = 
                " 1  3  5  7\n" + 
                " 9 11 13 15\n" + 
                "17 19 21 23\n" + 
                "25 27 29 31";
        
        String set2 = 
                " 2  3  6  7\n" + 
                "10 11 14 15\n" + 
                "18 19 22 23\n" + 
                "26 27 30 31";
        
        String set3 = 
                " 4  5  6  7\n" + 
                "12 13 14 15\n" + 
                "20 21 22 23\n" + 
                "28 29 30 31";
        
        String set4 = 
                " 8  9 10 11\n" + 
                "12 13 14 15\n" + 
                "24 25 26 27\n" + 
                "28 29 30 31";           
        
        String set5 = 
                "16 17 18 19\n" + 
                "20 21 22 23\n" + 
                "24 25 26 27\n" + 
                "28 29 30 31";
        
        // Creando objeto Scanner
        Scanner input = new Scanner(System.in);
        
        int dia = 0;
        
        // Mostrar mensaje al usuario Set 1
        System.out.print("¿Tu cumpleaños se encuentra el Set 1\n");
        System.out.print(set1);
        System.out.print("\nIngrese 'S' para SI y 'N' para NO: ");
                
        String s = input.nextLine();
        char answer = s.charAt(0);
        
        if (Character.toUpperCase(answer) == 'S') {
            dia += 1;
        }       
        
        
        // Mostrar mensaje al usuario Set 2
        System.out.print("¿Tu cumpleaños se encuentra el Set 2\n");
        System.out.print(set2);
        System.out.print("\nIngrese 'S' para SI y 'N' para NO: ");
        
        s = input.nextLine();        
        answer = s.charAt(0);        
        
        if (Character.toUpperCase(answer) == 'S') {
            dia += 2;
        }
        
        
        
        // Mostrar mensaje al usuario Set 3
        System.out.print("¿Tu cumpleaños se encuentra el Set 3\n");
        System.out.print(set3);
        System.out.print("\nIngrese 'S' para SI y 'N' para NO: ");
        
        s = input.nextLine();        
        answer = s.charAt(0);        
        
        if (Character.toUpperCase(answer) == 'S') {
            dia += 4;
        }
        
        
        
        // Mostrar mensaje al usuario Set 4
        System.out.print("¿Tu cumpleaños se encuentra el Set 4\n");
        System.out.print(set4);
        System.out.print("\nIngrese 'S' para SI y 'N' para NO: ");
        
        s = input.nextLine();        
        answer = s.charAt(0);        
        
        if (Character.toUpperCase(answer) == 'S') {
            dia += 8;
        }
        
        
        
        // Mostrar mensaje al usuario Set 5
        System.out.print("¿Tu cumpleaños se encuentra el Set 5\n");
        System.out.print(set5);
        System.out.print("\nIngrese 'S' para SI y 'N' para NO: ");
        
        s = input.nextLine();        
        answer = s.charAt(0);        
        
        if (Character.toUpperCase(answer) == 'S') {
            dia += 16;
        }
        
        System.out.println("\n\n¡Tu cumpleaños es el dia " + dia + "!");
        
        
        
        
                
    }
    
}
