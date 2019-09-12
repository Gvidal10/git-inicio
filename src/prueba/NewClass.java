/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.List;

/**
 *
 * @author Genaro Vidal
 */
public class NewClass {
    
    public static int Devuelve (List<Integer> a){
    int cont=0;
    
    for(int i = 0 ; i < a.size()-1  ; i++ ){
        for( int j = 0 ; j < a.size()-1 ; j++ ){
        
            if(a.get(j) < a.get(j+1)){
                
                int tem=a.get(j+1);
                a.set(j+1, a.get(j));
                a.set(j, tem);
                cont = cont+1;
                }
        
        }
       }
   
    System.out.println(a);
 
    
    return cont;
    }
    
    
    
}
