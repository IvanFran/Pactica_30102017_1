/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.modelo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *@ISTER
 * @author Expression IVANCHO is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */
public class OperacionesBasicas {
    
    public static void sumaDosNumeros(){
        int x=5;
        int y=3;
        
        JOptionPane.showMessageDialog(null,"La suma de" + x + "+" + y + "es" + (x+y));
        
        }
   
    public static void sumaConParametros(int x,int y){
         
        int z=x+y;
        
       JOptionPane.showMessageDialog(null, "La suma es:" +z);
       
                     
    }
    
    public static int sumaDevuelve(int x, int y) {
        
        return x+y;
        
    }

}
