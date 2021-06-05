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
public class Nota {

    private int idNota;
    private String FechaUltimaModificacion;
    private double Nota1;
    private double Nota2;
    private double Nota3;
    private double Notaf;
    private int idEstudiantefk;
    private int idAPGfk;

    public Nota() {
    }

    public Nota(int idNota, String FechaUltimaModificacion, double Nota1, double Nota2, double Nota3, double Notaf, int idEstudiantefk, int idAPGfk) {
        this.idNota = idNota;
        this.FechaUltimaModificacion = FechaUltimaModificacion;
        this.Nota1 = Nota1;
        this.Nota2 = Nota2;
        this.Nota3 = Nota3;
        this.Notaf = Notaf;
        this.idEstudiantefk = idEstudiantefk;
        this.idAPGfk = idAPGfk;
    }

    public Nota(double Nota1, double Nota2, double Nota3, double Notaf, int idEstudiantefk, int idAPGfk) {
        this.Nota1 = Nota1;
        this.Nota2 = Nota2;
        this.Nota3 = Nota3;
        this.Notaf = Notaf;
        this.idEstudiantefk = idEstudiantefk;
        this.idAPGfk = idAPGfk;
    }

    public Nota(double Nota1, double Nota2, double Nota3, double Notaf) {
        this.Nota1 = Nota1;
        this.Nota2 = Nota2;
        this.Nota3 = Nota3;
        this.Notaf = Notaf;
    }

    /**
     * Get the value of idAPGfk
     *
     * @return the value of idAPGfk
     */
    public int getIdAPGfk() {
        return idAPGfk;
    }

    /**
     * Set the value of idAPGfk
     *
     * @param idAPGfk new value of idAPGfk
     */
    public void setIdAPGfk(int idAPGfk) {
        this.idAPGfk = idAPGfk;
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
     * Get the value of Notaf
     *
     * @return the value of Notaf
     */
    public double getNotaf() {
        return Notaf;
    }

    /**
     * Set the value of Notaf
     *
     * @param Notaf new value of Notaf
     */
    public void setNotaf(double Notaf) {
        this.Notaf = Notaf;
    }

    /**
     * Get the value of Nota3
     *
     * @return the value of Nota3
     */
    public double getNota3() {
        return Nota3;
    }

    /**
     * Set the value of Nota3
     *
     * @param Nota3 new value of Nota3
     */
    public void setNota3(double Nota3) {
        this.Nota3 = Nota3;
    }

    /**
     * Get the value of Nota2
     *
     * @return the value of Nota2
     */
    public double getNota2() {
        return Nota2;
    }

    /**
     * Set the value of Nota2
     *
     * @param Nota2 new value of Nota2
     */
    public void setNota2(double Nota2) {
        this.Nota2 = Nota2;
    }

    /**
     * Get the value of Nota1
     *
     * @return the value of Nota1
     */
    public double getNota1() {
        return Nota1;
    }

    /**
     * Set the value of Nota1
     *
     * @param Nota1 new value of Nota1
     */
    public void setNota1(double Nota1) {
        this.Nota1 = Nota1;
    }

    /**
     * Get the value of FechaUltimaModificacion
     *
     * @return the value of FechaUltimaModificacion
     */
    public String getFechaUltimaModificacion() {
        return FechaUltimaModificacion;
    }

    /**
     * Set the value of FechaUltimaModificacion
     *
     * @param FechaUltimaModificacion new value of FechaUltimaModificacion
     */
    public void setFechaUltimaModificacion(String FechaUltimaModificacion) {
        this.FechaUltimaModificacion = FechaUltimaModificacion;
    }

    /**
     * Get the value of idNota
     *
     * @return the value of idNota
     */
    public int getIdNota() {
        return idNota;
    }

    /**
     * Set the value of idNota
     *
     * @param idNota new value of idNota
     */
    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    @Override
    public String toString() {
        return "Nota{" + "idNota=" + idNota + ", FechaUltimaModificacion=" + FechaUltimaModificacion + ", Nota1=" + Nota1 + ", Nota2=" + Nota2 + ", Nota3=" + Nota3 + ", Notaf=" + Notaf + ", idEstudiantefk=" + idEstudiantefk + ", idAPGfk=" + idAPGfk + '}';
    }

    public LinkedList<Nota> BuscarNota(String sql) {
        LinkedList<Nota> emxc = new LinkedList<>();
        ResultSet rs;
        //Estudiante
        double Nota1;
        double Nota2;
        double Nota3;
        double NotaF;
        BaseDatos objbd = new BaseDatos();
        if (objbd.crearConexion()) {
            try {
                Statement st = objbd.getConexion().createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    Nota1 = rs.getDouble("Nota1");
                    Nota2 = rs.getDouble("Nota2");
                    Nota3 = rs.getDouble("Nota3");
                    NotaF = rs.getDouble("Notaf");
                    emxc.add(new Nota(Nota1, Nota2, Nota3, NotaF));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Nota.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return emxc;

    }
}

