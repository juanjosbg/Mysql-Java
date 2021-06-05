/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.LinkedList;
import modelo.BaseDatos;
import modelo.Estudiante;
import static vista.Interfaz_login_estudiante.idEstudianteenSesion;

/**
 *
 * @author juanjos
 */
public class Controller_estudiante {

    public boolean insertEstudiante(Estudiante objc) {
        boolean E = false;
        String sql = "insert into estudiante(NombreEstudiante, NombreEstudiante_2, ApellidoEstudiante, ApellidoEstudiante_2,"
                + " Telefono, Correo, FechaNacimiento, idGenerofk) "
                + "value('" + objc.getNombreEstudiante() + "', '" + objc.getNombreEstudiante_2() + "', "
                + " '" + objc.getStringApellidoEstudiante() + "', '" + objc.getApellidoEstudiante_2() + "', "
                + "'" + objc.getTelefono() + "', '" + objc.getCorreo() + "', '" + objc.getFechaNacimiento() + "', "
                + objc.getIdgenero() + ");";

        BaseDatos objbd = new BaseDatos();
        E = objbd.ejecutarSQL(sql);
        return E;
    }

    public LinkedList<Estudiante> consultarEstudiantes() {
        LinkedList<Estudiante> lE = null;

        String sql = "select * from estudiante;";
        Estudiante objg = new Estudiante();

        lE = objg.consultarEstudiante(sql);

        return lE;
    }

    public boolean updatep(Estudiante objEstudiante) {
        boolean t = false;

        String sql = "{call ModificarEstudiante(?,?,?,?,?,?,?,?,?)}";
        Estudiante objupdate = new Estudiante();
        t = objupdate.updateEstudiante(sql, objEstudiante);
        return t;
    }
    
    public LinkedList<Estudiante> consultarEstudiante(int idEstudianteenSesion) {
        LinkedList<Estudiante> E = null;
        String sql = "select * from estudiante  where idEstudiante = " + idEstudianteenSesion;
       
        Estudiante obje = new Estudiante();
        E = obje.consultarEstudiante(sql);
        return E;

    }
    public LinkedList<Estudiante> consultarEstudianteDeDichoDocente( int idR) {
         LinkedList<Estudiante> ED = null;

        String sql = "select e.idEstudiante, e.NombreEstudiante, e.NombreEstudiante_2, e.ApellidoEstudiante, e.ApellidoEstudiante_2 FROM estudiante e, matricula m, grado g, asignatura_por_grado ag, docente d where e.idEstudiante = m.idEstudiantefk and g.idGrado = m.idGradofk and ag.idGradofk = g.idGrado and ag.idDocentefk = " + idR;
        Estudiante objg = new Estudiante();

        ED = objg.consulED(sql);

        return ED;
    }
}
