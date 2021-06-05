/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juanjos
 */
public class Registro_asistencia {
    
    private int idRA;
    private Timestamp fechaAsistencia;
    private String asistio;
    private String Excusa;
    private int idAPGfk;
    private int idEstudiantefk;

    public Registro_asistencia( String asistio, int idAPGfk, int idEstudiantefk) {
      
        this.asistio = asistio;
        this.idAPGfk = idAPGfk;
        this.idEstudiantefk = idEstudiantefk;
    }

    public Registro_asistencia() {
    }

    public Registro_asistencia(int idRA, Timestamp fechaAsistencia, String asistio, String Excusa, int idAPGfk, int idEstudiantefk) {
        this.idRA = idRA;
        this.fechaAsistencia = fechaAsistencia;
        this.asistio = asistio;
        this.Excusa = Excusa;
        this.idAPGfk = idAPGfk;
        this.idEstudiantefk = idEstudiantefk;
    }

    public Registro_asistencia(Timestamp fechaAsistencia, String asistio, String Excusa, int idAPGfk, int idEstudiantefk) {
        this.fechaAsistencia = fechaAsistencia;
        this.asistio = asistio;
        this.Excusa = Excusa;
        this.idAPGfk = idAPGfk;
        this.idEstudiantefk = idEstudiantefk;
    }

    public Registro_asistencia(String asistio, String Excusa, int idAPGfk, int idEstudiantefk) {
        this.asistio = asistio;
        this.Excusa = Excusa;
        this.idAPGfk = idAPGfk;
        this.idEstudiantefk = idEstudiantefk;
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
     * Get the value of Excusa
     *
     * @return the value of Excusa
     */
    public String getExcusa() {
        return Excusa;
    }

    /**
     * Set the value of Excusa
     *
     * @param Excusa new value of Excusa
     */
    public void setExcusa(String Excusa) {
        this.Excusa = Excusa;
    }


    /**
     * Get the value of asistio
     *
     * @return the value of asistio
     */
    public String getAsistio() {
        return asistio;
    }

    /**
     * Set the value of asistio
     *
     * @param asistio new value of asistio
     */
    public void setAsistio(String asistio) {
        this.asistio = asistio;
    }


    /**
     * Get the value of fechaAsistencia
     *
     * @return the value of fechaAsistencia
     */
    public Timestamp getFechaAsistencia() {
        return fechaAsistencia;
    }

    /**
     * Set the value of fechaAsistencia
     *
     * @param fechaAsistencia new value of fechaAsistencia
     */
    public void setFechaAsistencia(Timestamp fechaAsistencia) {
        this.fechaAsistencia = fechaAsistencia;
    }


    /**
     * Get the value of idRA
     *
     * @return the value of idRA
     */
    public int getIdRA() {
        return idRA;
    }

    /**
     * Set the value of idRA
     *
     * @param idRA new value of idRA
     */
    public void setIdRA(int idRA) {
        this.idRA = idRA;
    }

    @Override
    public String toString() {
        return "Registro_asistencia{" + "idRA=" + idRA + ", fechaAsistencia=" + fechaAsistencia + ", asistio=" + asistio + ", Excusa=" + Excusa + ", idAPGfk=" + idAPGfk + ", idEstudiantefk=" + idEstudiantefk + '}';
    }

    public boolean insertarRegistro_Asistencia(String sql, Registro_asistencia objR) {  // metodo  que es pasada a binario la imagen de la asistencia //
         boolean t = false;
        BaseDatos objbd = new BaseDatos();
        PreparedStatement pst = null;
        File archivoImagen = new File(objR.getExcusa());
        FileInputStream fis = null;
         if (objbd.crearConexion()) {
            try {
                fis = new FileInputStream(archivoImagen);
                pst = objbd.getConexion().prepareStatement(sql);
                pst.setString(1, objR.getAsistio());
                pst.setBinaryStream(2, fis, (int) archivoImagen.length());
                pst.setInt(3, objR.getIdAPGfk());
                pst.setInt(4, objR.getIdEstudiantefk());
                pst.executeUpdate();
                t=true;
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Registro_asistencia.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Registro_asistencia.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return t;

    }


}
