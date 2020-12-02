/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda_dicotomica;

/**
 *
 * @author JOSE
 */
public class busquedad_dicotomica_en_una_tabla {

    public class Main {
    }
    // a la función se le pasa, la tabla, el elemento a buscar, y la primera   
    // y última posición donde buscar.   

    static int busca(int t[], int elem, int primero, int ultimo) {
        int pos;
        if (primero >= ultimo) // caso base: solo hay un elemento donde buscar 
        {
            if (t[primero] == elem) {
                pos = primero;
            } else {
                pos = -1;
            }
        } else {
            int pos1, pos2;
            // llamada recursiva
            //buscamos en la primera mitad de la tabla: 0..mitad
            pos1 = busca(t, elem, primero, (primero + ultimo) / 2);
            // buscamos en la segunda parte de la tabla: mitad+1..ultimo        
            // se pone mitad+1, por que el elemento mitad ya pertenece a la 
            // primera parte... por no repetirlo
            pos2 = busca(t, elem, (primero + ultimo) / 2 + 1, ultimo);
            if (pos1 != -1) // si lo encuentro en la primera parte
            {
                pos = pos1;
            } else {
                pos = pos2;  // en caso contrario debo encontrarlo en la segunda parte
            }            // en caso de no encontrarse pos1 y pos2 serán -1, y se cogerá el valor de pos2 (-1) 
        }
        return (pos);
    }
    // el usuario utilizará esta función por comodidad   
    // solo es necesario pasarle la tabla y el elemento a buscar   
    // devuelve el índice del elemento si lo encuentra o -1 en caso contrario 
    static int busca(int t[], int elem) {
        return (busca(t, elem, 0, t.length - 1));
    }

}
