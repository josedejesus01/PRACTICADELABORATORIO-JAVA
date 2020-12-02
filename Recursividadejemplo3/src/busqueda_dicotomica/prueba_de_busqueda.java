/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda_dicotomica;
import static busqueda_dicotomica.busquedad_dicotomica_en_una_tabla.busca;
import java.util.Scanner;

/**
 *
 * @author JOSE
 */

public class prueba_de_busqueda {
    

    public static void main(String[] args) {   
        
    Scanner Entrada=new Scanner(System.in);
        int datos[];       
        int num;       
        int pos;
        datos = new int[10];
  // para no teclearlos, cargamos datos aleatorios 
   for (int i = 0; i < datos.length; i++) 
        datos[i] = (int) (Math.random()*1000+1);
  System.out.println("Los datos son:");
  for (int i = 0; i < datos.length; i++) 
      System.out.print(datos[i] + "  ");
  System.out.print("\n\nElemento a buscar: ");  
  num =Entrada.nextInt();
  // llamamos a la función buscar   
  pos =busca(datos, num);
  if (pos == -1)
  System.out.println("\n\nNo encontrado");
  else          
      System.out.println("\n\nEncontrado en la posición: " +pos); 
}
}

        
    
