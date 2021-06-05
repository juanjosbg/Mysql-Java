/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.LinkedList;
import modelo.Asignatura_por_grado;
import modelo.BaseDatos;

/**
 *
 * @author Brian Leon
 */
public class Controller_Asignatura_por_Grado {

    public boolean insertarAsignatura_por_Grado(Asignatura_por_grado objc) {
        boolean E=false;
        String sql="insert into asignatura_por_grado(FechaInicioCurso,FechaFinalizacionCurso,idGradofk,idDocentefk,idAsignaturafk)"
                +"values('"+ objc.getFechaInicioCurso()+"','"+ objc.getFechaFinalizacionCurso()+"', "
                + "'"+objc.getIdGradofk()+"', '"+objc.getIdDocentefk()+"', "
                + objc.getIdAsignaturafk()+");";
        BaseDatos objbd=new BaseDatos();
        E=objbd.ejecutarSQL(sql);
        return E;
    }

    public LinkedList<Asignatura_por_grado> consultarAXG() {
        LinkedList<Asignatura_por_grado> lg = null;
        
        String sql="select * from asignatura_por_grado;";
        Asignatura_por_grado objg = new Asignatura_por_grado();
        
        lg = objg.consultarAXG(sql);
        
        return lg;
    }

}
