/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juanjos
 */
public class Asignatura {

    private int idAsignatura;
    private String NombreAsignatura;

    public Asignatura() {
    }

    public Asignatura(int idAsignatura, String NombreAsignatura) {
        this.idAsignatura = idAsignatura;
        this.NombreAsignatura = NombreAsignatura;
    }

    public Asignatura(String NombreAsignatura) {
        this.NombreAsignatura = NombreAsignatura;
    }

    /**
     * Get the value of NombreAsignatura
     *
     * @return the value of NombreAsignatura
     */
    public String getNombreAsignatura() {
        return NombreAsignatura;
    }

    /**
     * Set the value of NombreAsignatura
     *
     * @param NombreAsignatura new value of NombreAsignatura
     */
    public void setNombreAsignatura(String NombreAsignatura) {
        this.NombreAsignatura = NombreAsignatura;
    }

    /**
     * Get the value of idAsignatura
     *
     * @return the value of idAsignatura
     */
    public int getIdAsignatura() {
        return idAsignatura;
    }

    /**
     * Set the value of idAsignatura
     *
     * @param idAsignatura new value of idAsignatura
     */
    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "idAsignatura=" + idAsignatura + ", NombreAsignatura=" + NombreAsignatura + '}';
    }

    public LinkedList<Asignatura> consultarAsignatura(String sql) {
        LinkedList<Asignatura> la = new LinkedList<>();
        ResultSet rs;
        int ida;
        String noma;
        BaseDatos objbd = new BaseDatos();
        if (objbd.crearConexion()) {
            try {
                Statement st = objbd.getConexion().createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    ida = rs.getInt("idAsignatura");
                    noma = rs.getString("NombreAsignatura");
                    la.add(new Asignatura(ida, noma));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Asignatura.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return la;
    }

    public LinkedList<Asignatura> BuscarnombreAsignatura(String sql2) {
        LinkedList<Asignatura> emxc = new LinkedList<>();
        ResultSet rs;
        //Asignatura
        String nombreAsignatura;
        BaseDatos objbd = new BaseDatos();
        if (objbd.crearConexion()) {
            try {
                Statement st = objbd.getConexion().createStatement();
                rs = st.executeQuery(sql2);
                while (rs.next()) {
                    nombreAsignatura = rs.getString("NombreAsignatura");
                    emxc.add(new Asignatura(nombreAsignatura));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Asignatura.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return emxc;

    }
}

