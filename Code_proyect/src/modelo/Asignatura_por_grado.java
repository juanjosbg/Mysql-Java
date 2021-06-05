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
public class Asignatura_por_grado {

    private int idAPG;
    private String FechaInicioCurso;
    private String FechaFinalizacionCurso;
    private int idGradofk;
    private int idDocentefk;
    private int idAsignaturafk;

    public Asignatura_por_grado() {
    }

    public Asignatura_por_grado(int idAPG, String FechaInicioCurso, String FechaFinalizacionCurso, int idGradofk, int idDocentefk, int idAsignaturafk) {
        this.idAPG = idAPG;
        this.FechaInicioCurso = FechaInicioCurso;
        this.FechaFinalizacionCurso = FechaFinalizacionCurso;
        this.idGradofk = idGradofk;
        this.idDocentefk = idDocentefk;
        this.idAsignaturafk = idAsignaturafk;
    }

    public Asignatura_por_grado(String FechaInicioCurso, String FechaFinalizacionCurso, int idGradofk, int idDocentefk, int idAsignaturafk) {
        this.FechaInicioCurso = FechaInicioCurso;
        this.FechaFinalizacionCurso = FechaFinalizacionCurso;
        this.idGradofk = idGradofk;
        this.idDocentefk = idDocentefk;
        this.idAsignaturafk = idAsignaturafk;
    }

    public Asignatura_por_grado(int idAPG, String FechaInicioCurso) {
        this.idAPG = idAPG;
        this.FechaInicioCurso = FechaInicioCurso;
    }

    /**
     * Get the value of idAsignaturafk
     *
     * @return the value of idAsignaturafk
     */
    public int getIdAsignaturafk() {
        return idAsignaturafk;
    }

    /**
     * Set the value of idAsignaturafk
     *
     * @param idAsignaturafk new value of idAsignaturafk
     */
    public void setIdAsignaturafk(int idAsignaturafk) {
        this.idAsignaturafk = idAsignaturafk;
    }

    /**
     * Get the value of idDocentefk
     *
     * @return the value of idDocentefk
     */
    public int getIdDocentefk() {
        return idDocentefk;
    }

    /**
     * Set the value of idDocentefk
     *
     * @param idDocentefk new value of idDocentefk
     */
    public void setIdDocentefk(int idDocentefk) {
        this.idDocentefk = idDocentefk;
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
     * Get the value of FechaFinalizacionCurso
     *
     * @return the value of FechaFinalizacionCurso
     */
    public String getFechaFinalizacionCurso() {
        return FechaFinalizacionCurso;
    }

    /**
     * Set the value of FechaFinalizacionCurso
     *
     * @param FechaFinalizacionCurso new value of FechaFinalizacionCurso
     */
    public void setFechaFinalizacionCurso(String FechaFinalizacionCurso) {
        this.FechaFinalizacionCurso = FechaFinalizacionCurso;
    }

    /**
     * Get the value of FechaInicioCurso
     *
     * @return the value of FechaInicioCurso
     */
    public String getFechaInicioCurso() {
        return FechaInicioCurso;
    }

    /**
     * Set the value of FechaInicioCurso
     *
     * @param FechaInicioCurso new value of FechaInicioCurso
     */
    public void setFechaInicioCurso(String FechaInicioCurso) {
        this.FechaInicioCurso = FechaInicioCurso;
    }

    /**
     * Get the value of idAPG
     *
     * @return the value of idAPG
     */
    public int getIdAPG() {
        return idAPG;
    }

    /**
     * Set the value of idAPG
     *
     * @param idAPG new value of idAPG
     */
    public void setIdAPG(int idAPG) {
        this.idAPG = idAPG;
    }

    @Override
    public String toString() {
        return "Asignatura_por_grado{" + "idAPG=" + idAPG + ", FechaInicioCurso=" + FechaInicioCurso + ", FechaFinalizacionCurso=" + FechaFinalizacionCurso + ", idGradofk=" + idGradofk + ", idDocentefk=" + idDocentefk + ", idAsignaturafk=" + idAsignaturafk + '}';
    }

    public LinkedList<Asignatura_por_grado> consultarAXG(String sql) {
        LinkedList<Asignatura_por_grado> lg = new LinkedList<>();
        ResultSet rs;
        int idAXG;
        String fechaI;
        BaseDatos objbd = new BaseDatos();
        if (objbd.crearConexion()) {
            try {
                Statement st = objbd.getConexion().createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    idAXG = rs.getInt("idAPG");
                    fechaI = rs.getString("FechaInicioCurso");

                    lg.add(new Asignatura_por_grado(idAXG, fechaI));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Asignatura_por_grado.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return lg;
    }

    public LinkedList<consultarasignaturasdexgrados> buscarasignaturaxgrado(String sql) {
        LinkedList<consultarasignaturasdexgrados> axg = new LinkedList<>();
        ResultSet rs;
        //Asignatura
        int idAsignatura;
        String NombreAsignatura;
        //Asignatura por grado
        int idAPG;
        String FechaInicioCurso;
        String FechaFinalizacionCurso;
        int idGradofk;
        int idDocentefk;
        int idAsignaturafk;
        //Grado
        int idGrado;
        String NombreG;
        int idColegiofk;

        BaseDatos objbd = new BaseDatos();
        if (objbd.crearConexion()) {
            try {
                Statement st = objbd.getConexion().createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    idAsignatura = rs.getInt("idAsignatura");
                    NombreAsignatura = rs.getString("NombreAsignatura");
                    idAPG = rs.getInt("idAPG");
                    FechaInicioCurso = rs.getString("FechaInicioCurso");
                    FechaFinalizacionCurso = rs.getString("FechaFinalizacionCurso");
                    idGradofk = rs.getInt("idGradofk");
                    idDocentefk = rs.getInt("idDocentefk");
                    idAsignaturafk = rs.getInt("idAsignaturafk");
                    idGrado = rs.getInt("idGrado");
                    NombreG = rs.getString("NombreG");
                    idColegiofk = rs.getInt("idColegiofk");

                    axg.add(new consultarasignaturasdexgrados(idAsignatura, NombreAsignatura, idAPG, FechaInicioCurso, FechaFinalizacionCurso, idGradofk, idDocentefk, idAsignaturafk, idGrado, NombreG, idColegiofk));
                }
            } catch (SQLException ex) {
                Logger.getLogger(consultarasignaturasdexgrados.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return axg;
    }

}
