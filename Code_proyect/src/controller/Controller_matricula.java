/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import modelo.BaseDatos;
import modelo.Matricula;

/**
 *
 * @author juanjos
 */
public class Controller_matricula {

    public boolean insertMatricula(Matricula objc) {
        boolean d = false;

        String sql = "insert into matricula(idEstudiantefk,idGradofk)"
                + "value('" + objc.getIdEstudiantefk() + "', '" + objc.getIdGradofk() + "');";

        BaseDatos objbd = new BaseDatos();
        d = objbd.ejecutarSQL(sql);
        return d;
    }

}
