/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.BaseDatos;
import modelo.Registro_asistencia;

/**
 *
 * @author Brian Leon
 */
public class Controller_Registro_Asistencia {

    public boolean insertarRegistro_Asistencia(Registro_asistencia objR) {             
        boolean d = false;
        String sql = "insert into registro_asistencia(asistio,Excusa,idAPGfk,idEstudiantefk) value(?,?,?,?);";
        Registro_asistencia objRA = new Registro_asistencia();
        d = objRA.insertarRegistro_Asistencia(sql, objR);
        return d;
    }

}
