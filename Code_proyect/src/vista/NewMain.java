/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.BaseDatos;

/**
 *
 * @author juanjos
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BaseDatos objb=new BaseDatos();
        
        if(objb.crearConexion()){
            System.out.println("se conecto");
        }else{
            System.out.println("no se conecto");
        }
    }
    
}
