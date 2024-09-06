/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;

/**
 *
 * Crear un programa en Java que evalue si tienes la edad para emitir voto
 */
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args){
       // Declarando variables
       int edad;
       Scanner lectura=new Scanner(System.in);
       System.out.print("Ingresa tu edad:");
       edad=lectura.nextInt();
       // Proceso de datos
       if(edad>=18){
       System.out.println("Eres elegible para votar.");
       }else{
           System.out.println("No eres elegible para votar aun.");
       }
       // Salida de datos
       lectura.close();
       }
    
}
