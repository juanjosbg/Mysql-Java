/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.LinkedList;
import modelo.BaseDatos;
import modelo.Identidad_genero;

/**
 *
 * @author juanjos
 */
public class Controller_IdentidadGenero {

    public boolean insertGenero(Identidad_genero objc) {
        boolean G=false;
        String sql="insert into identidad_de_genero(nombregenero)"
                + "value('"+objc.getNombregenero()+"');";
        
        BaseDatos objbd=new BaseDatos();
        G=objbd.ejecutarSQL(sql);
        return G;
    }

    public LinkedList<Identidad_genero> ConsultarGenero() {
        LinkedList<Identidad_genero> lg = null;
        
        String sql="select * from identidad_de_genero;";
        Identidad_genero objg = new Identidad_genero();
        
        lg = objg.consultarGenero(sql);
        
        return lg;
    }

    
}
