/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._exa_evaluacion3;

import java.util.Scanner;

/**
 *
 * @author aaro1
 */
public class App {
 private static int SumaCali;
    private static double sumaCali;
   

        
    

    public static void main(String[] args) {
        System.out.println("Hello World!");
    int califa;
    Scanner captu = new Scanner(System.in);
    for(int i = 1; i <= 10; i++){
        System.out.println("Estudiante # " + i);
        System.out.println("ingresar calificacion del estudiante");
        califa = captu.nextInt();
        captu.nextLine();
            
             SumaCali = SumaCali + califa;  
    }
   
    double promedio = sumaCali / 100;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
