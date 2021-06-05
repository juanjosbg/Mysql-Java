/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import modelo.BaseDatos;
import modelo.Nota;

/**
 *
 * @author Brian Leon
 */
public class Controller_Nota {

    public boolean insertNota(Nota objc) {
        boolean E = false;
        String sql = "insert into nota(Nota1,Nota2,Nota3,Notaf,"
                + " idEstudiantefk,idAPGfk) "
                + "value('" + objc.getNota1() + "', '" + objc.getNota2() + "', "
                + " '" + objc.getNota3() + "', '" + objc.getNotaf() + "', "
                + " '" + objc.getIdEstudiantefk() + "', "
                + objc.getIdAPGfk() + ");";

        BaseDatos objbd = new BaseDatos();
        E = objbd.ejecutarSQL(sql);
        return E;
    }

}
