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
 * @author Brian Leon
 */
public class consultarasignaturasdexgrados {

    //Asignatura
    private int idAsignatura;
    private String NombreAsignatura;
    //Asignatura por grado
    private int idAPG;
    private String FechaInicioCurso;
    private String FechaFinalizacionCurso;
    private int idGradofk;
    private int idDocentefk;
    private int idAsignaturafk;
    //Grado
    private int idGrado;
    private String NombreG;
    private int idColegiofk;

    //Constructor
    public consultarasignaturasdexgrados(int idAsignatura, String NombreAsignatura, int idAPG, String FechaInicioCurso, String FechaFinalizacionCurso, int idGradofk, int idDocentefk, int idAsignaturafk, int idGrado, String NombreG, int idColegiofk) {
        this.idAsignatura = idAsignatura;
        this.NombreAsignatura = NombreAsignatura;
        this.idAPG = idAPG;
        this.FechaInicioCurso = FechaInicioCurso;
        this.FechaFinalizacionCurso = FechaFinalizacionCurso;
        this.idGradofk = idGradofk;
        this.idDocentefk = idDocentefk;
        this.idAsignaturafk = idAsignaturafk;
        this.idGrado = idGrado;
        this.NombreG = NombreG;
        this.idColegiofk = idColegiofk;
    }

    public consultarasignaturasdexgrados(String NombreAsignatura, int idAPG) {
        this.NombreAsignatura = NombreAsignatura;
        this.idAPG = idAPG;
    }

    public consultarasignaturasdexgrados() {
    }

    //Getters and Setters
    public int getIdAPG() {
        return idAPG;
    }

    public void setIdAPG(int idAPG) {
        this.idAPG = idAPG;
    }

    public String getFechaInicioCurso() {
        return FechaInicioCurso;
    }

    public void setFechaInicioCurso(String FechaInicioCurso) {
        this.FechaInicioCurso = FechaInicioCurso;
    }

    public String getFechaFinalizacionCurso() {
        return FechaFinalizacionCurso;
    }

    public void setFechaFinalizacionCurso(String FechaFinalizacionCurso) {
        this.FechaFinalizacionCurso = FechaFinalizacionCurso;
    }

    public int getIdGradofk() {
        return idGradofk;
    }

    public void setIdGradofk(int idGradofk) {
        this.idGradofk = idGradofk;
    }

    public int getIdDocentefk() {
        return idDocentefk;
    }

    public void setIdDocentefk(int idDocentefk) {
        this.idDocentefk = idDocentefk;
    }

    public int getIdAsignaturafk() {
        return idAsignaturafk;
    }

    public void setIdAsignaturafk(int idAsignaturafk) {
        this.idAsignaturafk = idAsignaturafk;
    }

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public String getNombreAsignatura() {
        return NombreAsignatura;
    }

    public void setNombreAsignatura(String NombreAsignatura) {
        this.NombreAsignatura = NombreAsignatura;
    }

    public int getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(int idGrado) {
        this.idGrado = idGrado;
    }

    public String getNombreG() {
        return NombreG;
    }

    public void setNombreG(String NombreG) {
        this.NombreG = NombreG;
    }

    public int getIdColegiofk() {
        return idColegiofk;
    }

    public void setIdColegiofk(int idColegiofk) {
        this.idColegiofk = idColegiofk;
    }

    @Override
    public String toString() {
        return "consultarasignaturasdexgrados{" + "idAPG=" + idAPG + ", FechaInicioCurso=" + FechaInicioCurso + ", FechaFinalizacionCurso=" + FechaFinalizacionCurso + ", idGradofk=" + idGradofk + ", idDocentefk=" + idDocentefk + ", idAsignaturafk=" + idAsignaturafk + ", idAsignatura=" + idAsignatura + ", NombreAsignatura=" + NombreAsignatura + ", idGrado=" + idGrado + ", NombreG=" + NombreG + ", idColegiofk=" + idColegiofk + '}';
    }

    public LinkedList<consultarasignaturasdexgrados> consultarApgName(int idR) {

        LinkedList<consultarasignaturasdexgrados> ED = null;

        String sql = "SELECT a.NombreAsignatura, ag.idAPG FROM asignatura a, asignatura_por_grado ag,docente d WHERE d.idDocente = ag.idDocentefk AND ag.idAsignaturafk = a.idAsignatura AND d.idDocente = " + idR;
        consultarasignaturasdexgrados objg = new consultarasignaturasdexgrados();

        ED = objg.consulAPG(sql);

        return ED;

    }

    private LinkedList<consultarasignaturasdexgrados> consulAPG(String sql) {
        LinkedList<consultarasignaturasdexgrados> ED = new LinkedList<>();
        ResultSet rs;
        int ide;
        String nomAsig;
        BaseDatos objbd = new BaseDatos();
        if (objbd.crearConexion()) {
            try {
                Statement st = objbd.getConexion().createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {

                    nomAsig = rs.getString("NombreAsignatura");
                    ide = rs.getInt("idAPG");
                    ED.add(new consultarasignaturasdexgrados(nomAsig, ide));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ED;
    }
}
