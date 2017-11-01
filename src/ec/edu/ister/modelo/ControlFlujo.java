/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 *@ISTER
 * @author Expression IVANCHO is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */
public class ControlFlujo {
    public static void ifAnidado () {
        
        int a=3;
        if (a>=3) {
            System.out.println("Es mayor");
            
        } else if (a<3) {
            System.out.println("Es menor");
        }
        
        else {
            System.out.println("Es igual");
        }
    }
    
    public static void menu () {
        
        int op= Integer.parseInt(JOptionPane.showInputDialog(null, "OPERACIONE BÁSICAS\n 1)Suma dos números\n 2)Suma con parametros\n 3)Suma devuelve\n 4)Salir\n Escoja una opción"));
        
        switch(op){
            
            case 1:
                OperacionesBasicas.sumaDosNumeros();
                menu();    
            break;
            
            case 2:             
                int m= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número"));
                int n= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese otro número"));
                
                OperacionesBasicas.sumaConParametros(m, n);
                menu();   
            break;
                
            case 3:
                int a= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número"));
                int b= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese otro número"));
                
                JOptionPane.showMessageDialog(null, OperacionesBasicas.sumaDevuelve(a, b));
                
                menu();
            break;
            
            case 4:
                JOptionPane.showMessageDialog(null, "Hasta luego");
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Ingrese una opción valida");
                menu();   
            
        }
       
    } 

}
