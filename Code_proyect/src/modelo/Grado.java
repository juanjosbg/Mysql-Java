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
public class Grado {
    
    private int idGrado;
    private String NombreG;
    private int idColegiofk;

    public Grado() {
    }

    public Grado(int idGrado, String NombreG, int idColegiofk) {
        this.idGrado = idGrado;
        this.NombreG = NombreG;
        this.idColegiofk = idColegiofk;
    }

    public Grado(String NombreG, int idColegiofk) {
        this.NombreG = NombreG;
        this.idColegiofk = idColegiofk;
    }

    public Grado(String NombreG) {
        this.NombreG = NombreG;
    }

    public Grado(int idcole) {
        this.idColegiofk = idcole;
    }
    
    

    /**
     * Get the value of idColegiofk
     *
     * @return the value of idColegiofk
     */
    public int getIdColegiofk() {
        return idColegiofk;
    }

    /**
     * Set the value of idColegiofk
     *
     * @param idColegiofk new value of idColegiofk
     */
    public void setIdColegiofk(int idColegiofk) {
        this.idColegiofk = idColegiofk;
    }


    /**
     * Get the value of NombreG
     *
     * @return the value of NombreG
     */
    public String getNombreG() {
        return NombreG;
    }

    /**
     * Set the value of NombreG
     *
     * @param NombreG new value of NombreG
     */
    public void setNombreG(String NombreG) {
        this.NombreG = NombreG;
    }


    /**
     * Get the value of idGrado
     *
     * @return the value of idGrado
     */
    public int getIdGrado() {
        return idGrado;
    }

    /**
     * Set the value of idGrado
     *
     * @param idGrado new value of idGrado
     */
    public void setIdGrado(int idGrado) {
        this.idGrado = idGrado;
    }

    @Override
    public String toString() {
        return "Grado{" + "idGrado=" + idGrado + ", NombreG=" + NombreG + ", idColegiofk=" + idColegiofk + '}';
    }

    public LinkedList<Grado> consultarGrado(String sql) {
        LinkedList<Grado> lg = new LinkedList<>();
        ResultSet rs;
        int idg;
        String nomg;
        int idCole;
        BaseDatos objbd=new BaseDatos();
        if (objbd.crearConexion()) {
            try {
                Statement st = objbd.getConexion().createStatement();
                rs=st.executeQuery(sql);
                while (rs.next()) {                    
                    idg = rs.getInt("idGrado");
                    nomg = rs.getString("NombreG");
                    idCole=rs.getInt("idColegiofk");
                    lg.add(new Grado(idg, nomg,idCole));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Grado.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return lg;
    }
    public LinkedList<Grado> consultarGradocole(String sql) {
        LinkedList<Grado> lg = new LinkedList<>();
        ResultSet rs;
        int idg;
        String nomg;
        int idCole;
        BaseDatos objbd=new BaseDatos();
        if (objbd.crearConexion()) {
            try {
                Statement st = objbd.getConexion().createStatement();
                rs=st.executeQuery(sql);
                while (rs.next()) {                    
                    idg = rs.getInt("idGrado");
                    nomg = rs.getString("NombreG");
                    idCole=rs.getInt("idColegiofk");
                    lg.add(new Grado(idg,nomg,idCole));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Grado.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return lg;
    }

}
