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
public class Matricula {

    private int idmatricula;
    private String fechaMatricula;
    private int idEstudiantefk;
    private int idGradofk;

    public Matricula() {
    }

    public Matricula(int idmatricula, String fechaMatricula, int idEstudiantefk, int idGradofk) {
        this.idmatricula = idmatricula;
        this.fechaMatricula = fechaMatricula;
        this.idEstudiantefk = idEstudiantefk;
        this.idGradofk = idGradofk;
    }

    public Matricula(String fechaMatricula, int idEstudiantefk, int idGradofk) {
        this.fechaMatricula = fechaMatricula;
        this.idEstudiantefk = idEstudiantefk;
        this.idGradofk = idGradofk;
    }

    public Matricula(int idEstudiantefk, int idGradofk) {
        this.idEstudiantefk = idEstudiantefk;
        this.idGradofk = idGradofk;
    }

    /**
     * Get the value of idGradofk
     *
     * @return the value of idGradofk
     */
    public int getIdGradofk() {
        return idGradofk;
    }

    /**
     * Set the value of idGradofk
     *
     * @param idGradofk new value of idGradofk
     */
    public void setIdGradofk(int idGradofk) {
        this.idGradofk = idGradofk;
    }

    /**
     * Get the value of idEstudiantefk
     *
     * @return the value of idEstudiantefk
     */
    public int getIdEstudiantefk() {
        return idEstudiantefk;
    }

    /**
     * Set the value of idEstudiantefk
     *
     * @param idEstudiantefk new value of idEstudiantefk
     */
    public void setIdEstudiantefk(int idEstudiantefk) {
        this.idEstudiantefk = idEstudiantefk;
    }

    /**
     * Get the value of fechaMatricula
     *
     * @return the value of fechaMatricula
     */
    public String getFechaMatricula() {
        return fechaMatricula;
    }

    /**
     * Set the value of fechaMatricula
     *
     * @param fechaMatricula new value of fechaMatricula
     */
    public void setFechaMatricula(String fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    /**
     * Get the value of idmatricula
     *
     * @return the value of idmatricula
     */
    public int getIdmatricula() {
        return idmatricula;
    }

    /**
     * Set the value of idmatricula
     *
     * @param idmatricula new value of idmatricula
     */
    public void setIdmatricula(int idmatricula) {
        this.idmatricula = idmatricula;
    }

    @Override
    public String toString() {
        return "Matricula{" + "idmatricula=" + idmatricula + ", fechaMatricula=" + fechaMatricula + ", idEstudiantefk=" + idEstudiantefk + ", idGradofk=" + idGradofk + '}';
    }

    public LinkedList<estudiantematriculadoenxcolegio> buscaraestudiantematriculadoenxcolegio(String sql) {
        LinkedList<estudiantematriculadoenxcolegio> emxc = new LinkedList<>();
        ResultSet rs;
        //Estudiante
        String NombreEstudiante;
        String NombreEstudiante_2;
        String ApellidoEstudiante;
        String ApellidoEstudiante_2;
        //Matricula
        String fechaMatricula;
        //Grado
        String NombreG;
        //Colegio
        String NombreColegio;
        BaseDatos objbd = new BaseDatos();
        if (objbd.crearConexion()) {
            try {
                Statement st = objbd.getConexion().createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    NombreEstudiante = rs.getString("NombreEstudiante");
                    NombreEstudiante_2 = rs.getString("NombreEstudiante_2");
                    ApellidoEstudiante = rs.getString("ApellidoEstudiante");
                    ApellidoEstudiante_2 = rs.getString("ApellidoEstudiante_2");
                    fechaMatricula = rs.getString("fechaMatricula");
                    NombreG = rs.getString("NombreG");
                    NombreColegio = rs.getString("NombreColegio");
                    emxc.add(new estudiantematriculadoenxcolegio(NombreEstudiante, NombreEstudiante_2, ApellidoEstudiante, ApellidoEstudiante_2, fechaMatricula, NombreG, NombreColegio));
                }
            } catch (SQLException ex) {
                Logger.getLogger(estudiantematriculadoenxcolegio.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return emxc;
    }
}
