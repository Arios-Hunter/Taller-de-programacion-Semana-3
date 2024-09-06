/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;

/*
 Crear un programa en Java que evalue si el numero ingresado es positivo, negativo o cero
 */
import java.util.Scanner;
public class Programa04 {
    public static void main(String[] args){
        // Declarando variables
        int numero;
        Scanner lectura=new Scanner(System.in);
        System.out.print("Ingrese un numero:");
        numero=lectura.nextInt();
        // Proceso de datos
        if(numero>0){
            System.out.println("El numero es positivo.");
        }else if(numero<0){
            System.out.println("El numero es negativo.");
        }else{
            System.out.print("El numero es 0.");
        }
       // Salida de datos
       lectura.close();
    }
    
}
