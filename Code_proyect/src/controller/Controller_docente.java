/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.LinkedList;
import modelo.Asignatura;
import modelo.BaseDatos;
import modelo.Docente;
import static vista.Interfaz_login_Docente.idDocenteenSesion;

/**
 *
 * @author juanjos
 */
public class Controller_docente {

    public boolean insertDocente(Docente objD) {
        boolean d = false;

        String sql = "insert into docente(NombreDocente, NombreDocente2, ApellidoDocente, ApellidoDocente2,"
                + " Telefono, Correo, FechaNacimiento, idColegiofk)"
                + "value('" + objD.getNombreDocente() + "', '" + objD.getNombreDocente2() + "', '" + objD.getApellidoDocente() + "', '" + objD.getApellidoDocente2() + "', "
                + " '" + objD.getTelefono() + "', '" + objD.getCorreo() + "', '" + objD.getFechaNacimiento() + "', "
                + objD.getIdColegiofk() + ");";

        BaseDatos objbd = new BaseDatos();
        d = objbd.ejecutarSQL(sql);
        return d;
    }

    public LinkedList<Docente> consultarDocente() {
        LinkedList<Docente> ld = null;

        String sql = "select * from docente;";
        Docente objdd = new Docente();

        ld = objdd.consultarDocente(sql);

        return ld;
    }
    public LinkedList<Docente> Consultardocente(int idDocenteenSesion) {
      LinkedList<Docente>consuld = null;
      String Sql = "select * from Docente where idDocente =" + idDocenteenSesion;
      
      Docente objD = new Docente();
      consuld = objD.consultarDocente(Sql);
        return consuld;
    }

}
