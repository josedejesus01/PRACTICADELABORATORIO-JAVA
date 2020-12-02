/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carcularmetododefibonacci;

/**
 *
 * @author JOSE
 */
public class carcularfibonacci {
     // declaración recursiva del método ﬁbonacci 
    public long ﬁbonacci( long numero ){
        if ( ( numero == 0 ) || ( numero == 1 ) ) // casos base
             return numero;
        else // paso recursivo 
            return ﬁbonacci( numero - 1 ) + ﬁbonacci( numero - 2 );
         } // ﬁn del método ﬁbonacci 
           public void mostrarFibonacci(){
               for ( int contador = 0; contador <= 10; contador++ ) 
                   System.out.printf( "Fibonacci de %d es: %d\n", contador, 
                           ﬁbonacci( contador ) ); 
                } // ﬁn del método mostrarFibonacci 
          } // ﬁn de la clase CalculoFibonacci 



