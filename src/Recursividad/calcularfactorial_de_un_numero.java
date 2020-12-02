/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

/**
 *
 * @author JOSE
 */
public class calcularfactorial_de_un_numero {
    
       public  static int factorial(int num){ 
        int res;
        if(num==0)  // caso base: 0! es igual a 1  
            res=1;       
        else           
            res=num*factorial(num-1);// n!= n*(n-1)*(n-2)... un ejemplo 3!=3*2*1  
                                     // también ocurre que n!=n*(n-1)!      
                                     // como ejemplo 4!=4*3!
        
        return(res);    }//se retorna el resultado
   
     
    }  
    
    
   

