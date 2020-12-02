/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;
import static Recursividad.calcularfactorial_de_un_numero.factorial;
import java.util.Scanner;
/**
 *
 * @author JOSE
 */
public class mainfactorial {
  public static void main(String[] args) {   
        Scanner entrada=new Scanner(System.in);
        int num,resultado;
        System.out.print("Introduzca el numero: ");// se introduce el valor a asignar desde el teclado      
        num=entrada.nextInt();// se lee el numero
        resultado=factorial(num);// se lee el resultado de la factorial
        System.out.println(num+" es igual a "+resultado); 
}
}