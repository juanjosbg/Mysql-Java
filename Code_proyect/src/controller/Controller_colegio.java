/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.LinkedList;
import modelo.BaseDatos;
import modelo.Colegio;

/**
 *
 * @author juanjos
 */
public class Controller_colegio {

    public boolean insertColegio(Colegio objc) {

        boolean E = false;
        String sql = "Insert into Colegio(NombreColegio,Telefono,Telefono2,Correo, DireccionColegio,Comuna,CodigoBarrio,Barrio)"
                + "value('" + objc.getNombreColegio() + "', '" + objc.getTelefono() + "','" + objc.getTelefono2() + "', '" + objc.getCorreo() + "',"
                + "'" + objc.getDireccionColegio() + "','" + objc.getComuna() + "','" + objc.getCodigoBarrio() + "','" + objc.getBarrio() + "');";

        BaseDatos objbd = new BaseDatos();
        E = objbd.ejecutarSQL(sql);
        return E;
    }

    public LinkedList<Colegio> consultarColegio() {
        LinkedList<Colegio> lg = null;

        String sql = "select * from colegio;";
        Colegio objg = new Colegio();

        lg = objg.consultarColegio(sql);

        return lg;
    }

    public LinkedList<Colegio> ConsultarColegio(int idc) {
        LinkedList<Colegio> C = null;
        String sql = "select * from colegio  where idColegio = " + idc;
        Colegio obje = new Colegio();

        C = obje.consultarColegio(sql);
        return C;
    }

    public boolean updatec(Colegio objColegio) {   
        boolean t = false;

        String sql = "{call ModificarColegio(?,?,?,?,?,?,?,?,?)}";
        Colegio objupdate = new Colegio();
        t = objupdate.updateColegio(sql, objColegio);
        return t;
    }
}
