/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;

/*
 Crear un programa en Java permita ingresar dos numeros y un tipo 
de operacion aritmetica (+,-,*,/)
Visualizar el resultado de la operacion arimetica

n1=4
n2=2
opa="*"
resultado: 8

 */
import java.util.Scanner;
public class Programa03 {
 public static void main(String[] args){
     double n1,n2,resultado;
     String opa;
     Scanner lectura=new Scanner(System.in);
     // Entrada de datos
     System.out.print("Ingresar numero 1:");
     n1=lectura.nextDouble();
     System.out.print("Ingresar numero 2:");
     n2=lectura.nextDouble();
     System.out.print("Ingresar operacion [+,-,*,/]:");
     opa=lectura.next();
    // Proceso de datos
     if(opa.equals("+")){
         resultado=n1+n2;
     }else if (opa.equals("-")){
         resultado=n1-n2;
      }else if (opa.equals("*")){
         resultado=n1*n2;   
      }else{
         resultado=n1/n2;    
      }    
     // Salida de datos
     System.out.println(resultado);
     }
     
     
 
}
