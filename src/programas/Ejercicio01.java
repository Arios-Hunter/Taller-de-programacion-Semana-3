/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;

/**
 *
 * Crear un programa en Java que evalue si por tu edad si eres niño, adolescente o adulto
 */
import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args){
       // Declarando variables
       int edad;
       Scanner lectura=new Scanner(System.in);
       System.out.print("Ingresa tu edad:");
       edad=lectura.nextInt();
       // Proceso de datos
       if (edad<0){
           System.out.println("La edad no puede ser negativo.");
       }else if(edad<11){
        System.out.println("Eres un niño.");   
       }else if(edad<17){
          System.out.println("Eres un adolescente.");
       }else{
           System.out.println("Eres un adulto."); 
       }
       // Salida de datos
     lectura.close();
     
    }
    
}
