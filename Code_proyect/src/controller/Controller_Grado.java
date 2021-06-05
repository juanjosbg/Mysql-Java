/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.LinkedList;
import modelo.BaseDatos;
import modelo.Grado;

/**
 *
 * @author Brian Leon
 */
public class Controller_Grado {

    public boolean insertarGrado(Grado objg) {
        boolean A = false;
        String sql = "Insert into grado(NombreG, idColegiofk)"
                + "value('" + objg.getNombreG() + "', '" + objg.getIdColegiofk() + "');";

        BaseDatos objbd = new BaseDatos();
        A = objbd.ejecutarSQL(sql);

        return A;
    }

    public LinkedList<Grado> insertandoGrado() {
        LinkedList<Grado> lg = null;
        
        String sql="select * from grado;";
        Grado objg = new Grado();
        
        lg= objg.consultarGrado(sql);
        
        return lg;
    }
    

 
    public LinkedList<Grado> consultarGrado(int idcole) {
        LinkedList<Grado> lg = null;
        
        String sql="select  g.idGrado, g.NombreG, g.idColegiofk from grado g where g.idColegiofk =" + idcole;
        Grado objg = new Grado();
        
        lg= objg.consultarGradocole(sql);
        
        return lg;
    }

}
