/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;

/*
 Crear un programa en Java que permita ingresar las tres notas de un alumno
 Visualizar el promedio y su condicion
 >=12 Aprobado
 <12 Desaprobado
  */
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args){
        // Declara variables
        double nt1,nt2,nt3,promedio;
        String alumno,condicion;
        Scanner lectura=new Scanner(System.in);
        // Entrada de datos
        System.out.print("Ingresar nombre del alumno:");
        alumno=lectura.next();
        System.out.print("Ingresar nota 1:");
        nt1=lectura.nextInt();
        System.out.print("Ingresar nota 2:");
        nt2=lectura.nextInt();
        System.out.print("Ingresar nota 3:");
        nt3=lectura.nextInt();
        // Proceso de datos
        promedio=(nt1+nt2+nt3)/3;
        if(promedio>=12){
            condicion="Aprobado";
        }else{
            condicion="Desaprobado";
        }
        // Salida de datos
        System.out.println("El promedio es:"+promedio);
        System.out.println("La condicion es:"+condicion);
    } 
    
}
