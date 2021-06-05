/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.CallableStatement;
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
public class Estudiante {

    private int idEstudiante;
    private String NombreEstudiante;
    private String NombreEstudiante_2;
    private String stringApellidoEstudiante;
    private String ApellidoEstudiante_2;
    private String Telefono;
    private String Correo;
    private String FechaNacimiento;
    private int idgenero;

    public Estudiante() {
    }

    public Estudiante(String NombreEstudiante, String NombreEstudiante_2, String stringApellidoEstudiante, String ApellidoEstudiante_2, String Telefono, String Correo, String FechaNacimiento, int idgenero) {
        this.NombreEstudiante = NombreEstudiante;
        this.NombreEstudiante_2 = NombreEstudiante_2;
        this.stringApellidoEstudiante = stringApellidoEstudiante;
        this.ApellidoEstudiante_2 = ApellidoEstudiante_2;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.FechaNacimiento = FechaNacimiento;
        this.idgenero = idgenero;
    }

    public Estudiante(int idEstudiante, String NombreEstudiante, String NombreEstudiante_2, String stringApellidoEstudiante, String ApellidoEstudiante_2, String Telefono, String Correo, String FechaNacimiento, int idgenero) {
        this.idEstudiante = idEstudiante;
        this.NombreEstudiante = NombreEstudiante;
        this.NombreEstudiante_2 = NombreEstudiante_2;
        this.stringApellidoEstudiante = stringApellidoEstudiante;
        this.ApellidoEstudiante_2 = ApellidoEstudiante_2;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.FechaNacimiento = FechaNacimiento;
        this.idgenero = idgenero;
    }

    public Estudiante(String NombreEstudiante, String stringApellidoEstudiante, String ApellidoEstudiante_2, String Telefono, String Correo, String FechaNacimiento, int idgenero) {
        this.NombreEstudiante = NombreEstudiante;
        this.stringApellidoEstudiante = stringApellidoEstudiante;
        this.ApellidoEstudiante_2 = ApellidoEstudiante_2;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.FechaNacimiento = FechaNacimiento;
        this.idgenero = idgenero;
    }

    public Estudiante(int idEstudiante, String NombreEstudiante) {
        this.idEstudiante = idEstudiante;
        this.NombreEstudiante = NombreEstudiante;
    }

    public Estudiante(int idEstudiante, String NombreEstudiante, String NombreEstudiante_2, String stringApellidoEstudiante, String ApellidoEstudiante_2) {
        this.idEstudiante = idEstudiante;
        this.NombreEstudiante = NombreEstudiante;
        this.NombreEstudiante_2 = NombreEstudiante_2;
        this.stringApellidoEstudiante = stringApellidoEstudiante;
        this.ApellidoEstudiante_2 = ApellidoEstudiante_2;
    }

    public Estudiante(String NombreEstudiante, String stringApellidoEstudiante, String Telefono, String Correo, String FechaNacimiento, int idgenero) {
        this.NombreEstudiante = NombreEstudiante;
        this.stringApellidoEstudiante = stringApellidoEstudiante;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.FechaNacimiento = FechaNacimiento;
        this.idgenero = idgenero;
    }

    /**
     * Get the value of idgenero
     *
     * @return the value of idgenero
     */
    public int getIdgenero() {
        return idgenero;
    }

    /**
     * Set the value of idgenero
     *
     * @param idgenero new value of idgenero
     */
    public void setIdgenero(int idgenero) {
        this.idgenero = idgenero;
    }

    /**
     * Get the value of FechaNacimiento
     *
     * @return the value of FechaNacimiento
     */
    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    /**
     * Set the value of FechaNacimiento
     *
     * @param FechaNacimiento new value of FechaNacimiento
     */
    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    /**
     * Get the value of Correo
     *
     * @return the value of Correo
     */
    public String getCorreo() {
        return Correo;
    }

    /**
     * Set the value of Correo
     *
     * @param Correo new value of Correo
     */
    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    /**
     * Get the value of Telefono
     *
     * @return the value of Telefono
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * Set the value of Telefono
     *
     * @param Telefono new value of Telefono
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    /**
     * Get the value of ApellidoEstudiante_2
     *
     * @return the value of ApellidoEstudiante_2
     */
    public String getApellidoEstudiante_2() {
        return ApellidoEstudiante_2;
    }

    /**
     * Set the value of ApellidoEstudiante_2
     *
     * @param ApellidoEstudiante_2 new value of ApellidoEstudiante_2
     */
    public void setApellidoEstudiante_2(String ApellidoEstudiante_2) {
        this.ApellidoEstudiante_2 = ApellidoEstudiante_2;
    }

    /**
     * Get the value of stringApellidoEstudiante
     *
     * @return the value of stringApellidoEstudiante
     */
    public String getStringApellidoEstudiante() {
        return stringApellidoEstudiante;
    }

    /**
     * Set the value of stringApellidoEstudiante
     *
     * @param stringApellidoEstudiante new value of stringApellidoEstudiante
     */
    public void setStringApellidoEstudiante(String stringApellidoEstudiante) {
        this.stringApellidoEstudiante = stringApellidoEstudiante;
    }

    /**
     * Get the value of NombreEstudiante_2
     *
     * @return the value of NombreEstudiante_2
     */
    public String getNombreEstudiante_2() {
        return NombreEstudiante_2;
    }

    /**
     * Set the value of NombreEstudiante_2
     *
     * @param NombreEstudiante_2 new value of NombreEstudiante_2
     */
    public void setNombreEstudiante_2(String NombreEstudiante_2) {
        this.NombreEstudiante_2 = NombreEstudiante_2;
    }

    /**
     * Get the value of NombreEstudiante
     *
     * @return the value of NombreEstudiante
     */
    public String getNombreEstudiante() {
        return NombreEstudiante;
    }

    /**
     * Set the value of NombreEstudiante
     *
     * @param NombreEstudiante new value of NombreEstudiante
     */
    public void setNombreEstudiante(String NombreEstudiante) {
        this.NombreEstudiante = NombreEstudiante;
    }

    /**
     * Get the value of idEstudiante
     *
     * @return the value of idEstudiante
     */
    public int getIdEstudiante() {
        return idEstudiante;
    }

    /**
     * Set the value of idEstudiante
     *
     * @param idEstudiante new value of idEstudiante
     */
    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "idEstudiante=" + idEstudiante + ", NombreEstudiante=" + NombreEstudiante + ", NombreEstudiante_2=" + NombreEstudiante_2 + ", stringApellidoEstudiante=" + stringApellidoEstudiante + ", ApellidoEstudiante_2=" + ApellidoEstudiante_2 + ", Telefono=" + Telefono + ", Correo=" + Correo + ", FechaNacimiento=" + FechaNacimiento + '}';
    }

    public boolean updateEstudiante(String sql, Estudiante objEstudiante) {
        boolean t = false;
        CallableStatement cst;
        BaseDatos objbd = new BaseDatos();
        if (objbd.crearConexion()) {
            try {
                cst = objbd.getConexion().prepareCall(sql);
                cst.setInt(1, objEstudiante.getIdEstudiante());
                cst.setString(2, objEstudiante.getNombreEstudiante());
                cst.setString(3, objEstudiante.getNombreEstudiante_2());
                cst.setString(4, objEstudiante.getStringApellidoEstudiante());
                cst.setString(5, objEstudiante.getApellidoEstudiante_2());
                cst.setString(6, objEstudiante.getTelefono());
                cst.setString(7, objEstudiante.getCorreo());
                cst.setString(8, objEstudiante.getFechaNacimiento());
                cst.setInt(9, objEstudiante.getIdgenero());

                if (cst.execute()) {
                    t = true;
                }

            } catch (SQLException ex) {
                Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return t;
    }

    public LinkedList<Estudiante> consultarEstudiante(String sql) {
        LinkedList<Estudiante> lg = new LinkedList<>();
        ResultSet rs;
        int ide;
        String nombre;
        String nombre1;
        String apellido;
        String apellido2;
        String Telefono;
        String Correo;
        String FechaNacimiento;
        int idgenero;

        BaseDatos objbd = new BaseDatos();
        if (objbd.crearConexion()) {
            try {
                Statement st = objbd.getConexion().createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    ide = rs.getInt("idEstudiante");
                    nombre = rs.getString("NombreEstudiante");
                    nombre1 = rs.getString("NombreEstudiante_2");
                    apellido = rs.getString("ApellidoEstudiante");
                    apellido2 = rs.getString("ApellidoEstudiante_2");
                    Telefono = rs.getString("Telefono");
                    Correo = rs.getString("Correo");
                    FechaNacimiento = rs.getString("FechaNacimiento");
                    idgenero = rs.getInt("idGenerofk");
                    lg.add(new Estudiante(ide, nombre, nombre1, apellido, apellido2, Telefono, Correo, FechaNacimiento, idgenero));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return lg;
    }

    public LinkedList<Estudiante> consulED(String sql) {
        LinkedList<Estudiante> ED = new LinkedList<>();
        ResultSet rs;
        int ide;
        String nombre;
        String nombre1;
        String apellido;
        String apellido2;
        BaseDatos objbd = new BaseDatos();
        if (objbd.crearConexion()) {
            try {
                Statement st = objbd.getConexion().createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    ide = rs.getInt("idEstudiante");
                    nombre = rs.getString("NombreEstudiante");
                    nombre1 = rs.getString("NombreEstudiante_2");
                    apellido = rs.getString("ApellidoEstudiante");
                    apellido2 = rs.getString("ApellidoEstudiante_2");
                    ED.add(new Estudiante(ide, nombre, nombre1, apellido, apellido2));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ED;
    }
}
