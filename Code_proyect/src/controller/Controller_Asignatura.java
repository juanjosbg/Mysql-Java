/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.LinkedList;
import modelo.BaseDatos;
import modelo.Asignatura;

/**
 *
 * @author CAMILO
 */
public class Controller_Asignatura {

    public boolean insertAsignatura(Asignatura objA) {
        boolean A = false;
        String sql = "Insert into Asignatura(NombreAsignatura)"
                + "value('" + objA.getNombreAsignatura() + "');";

        BaseDatos objbd = new BaseDatos();
        A = objbd.ejecutarSQL(sql);

        return A;
    }

    public LinkedList<Asignatura> insertarAsignatura() {

        LinkedList<Asignatura> la = null;

        String sql = "select * from Asignatura;";
        Asignatura objg = new Asignatura();

        la = objg.consultarAsignatura(sql);

        return la;

    }

}
