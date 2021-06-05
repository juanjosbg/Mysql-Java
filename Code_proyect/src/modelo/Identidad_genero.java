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
public class Identidad_genero {
    
    private int idGenero;
    private String nombregenero;

    public Identidad_genero() {
    }

    public Identidad_genero(int idGenero, String nombregenero) {
        this.idGenero = idGenero;
        this.nombregenero = nombregenero;
    }

    public Identidad_genero(String nombregenero) {
        this.nombregenero = nombregenero;
    }
    
    
    
    /**
     * Get the value of nombregenero
     *
     * @return the value of nombregenero
     */
    public String getNombregenero() {
        return nombregenero;
    }

    /**
     * Set the value of nombregenero
     *
     * @param nombregenero new value of nombregenero
     */
    public void setNombregenero(String nombregenero) {
        this.nombregenero = nombregenero;
    }


    /**
     * Get the value of idGenero
     *
     * @return the value of idGenero
     */
    public int getIdGenero() {
        return idGenero;
    }

    /**
     * Set the value of idGenero
     *
     * @param idGenero new value of idGenero
     */
    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    @Override
    public String toString() {
        return "Identidad_genero{" + "idGenero=" + idGenero + ", nombregenero=" + nombregenero + '}';
    }

    public LinkedList<Identidad_genero> consultarGenero(String sql) {
        LinkedList<Identidad_genero> lg= new LinkedList<>();
        ResultSet rs;
        int idg;
        String nomg;
        BaseDatos objbd= new BaseDatos();
        if (objbd.crearConexion()) {
            try {
                Statement st = objbd.getConexion().createStatement();
                rs=st.executeQuery(sql);
                while (rs.next()) {                    
                    idg = rs.getInt("idGenero");
                    nomg = rs.getString("nombregenero");
                    
                    lg.add(new Identidad_genero(idg, nomg));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Identidad_genero.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return lg;
    }

}
