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
public class Colegio {

    private int idColegio;
    private String NombreColegio;
    private String Telefono;
    private String Telefono2;
    private String Correo;
    private String DireccionColegio;
    private String Comuna;
    private String CodigoBarrio;
    private String Barrio;
    private int comuna;

    public Colegio() {
    }

    public Colegio(int idColegio, String NombreColegio, String Telefono, String Telefono2, String Correo, String DireccionColegio, String Comuna, String CodigoBarrio, String Barrio) {
        this.idColegio = idColegio;
        this.NombreColegio = NombreColegio;
        this.Telefono = Telefono;
        this.Telefono2 = Telefono2;
        this.Correo = Correo;
        this.DireccionColegio = DireccionColegio;
        this.Comuna = Comuna;
        this.CodigoBarrio = CodigoBarrio;
        this.Barrio = Barrio;
    }

    public Colegio(String NombreColegio, String Telefono, String Correo, String DireccionColegio, String Comuna, String CodigoBarrio, String Barrio) {
        this.NombreColegio = NombreColegio;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.DireccionColegio = DireccionColegio;
        this.Comuna = Comuna;
        this.CodigoBarrio = CodigoBarrio;
        this.Barrio = Barrio;
    }

    public Colegio(String NombreColegio, String Telefono, String Telefono2, String Correo, String DireccionColegio, String Comuna, String CodigoBarrio, String Barrio) {
        this.NombreColegio = NombreColegio;
        this.Telefono = Telefono;
        this.Telefono2 = Telefono2;
        this.Correo = Correo;
        this.DireccionColegio = DireccionColegio;
        this.Comuna = Comuna;
        this.CodigoBarrio = CodigoBarrio;
        this.Barrio = Barrio;
    }

    public Colegio(int idColegio, String NombreColegio) {
        this.idColegio = idColegio;
        this.NombreColegio = NombreColegio;
    }

    public Colegio(int idColegio, String nomColegio, String telefono1, String telefono2, String correo, String DireccionCole, int comuna, String codigoBarrio, String nomBarrio) {
        this.idColegio = idColegio;
        this.NombreColegio = nomColegio;
        this.Telefono = telefono1;
        this.Telefono = telefono2;
        this.Correo = correo;
        this.DireccionColegio = DireccionCole;
        this.comuna = comuna;
        this.CodigoBarrio = codigoBarrio;
        this.Barrio = nomBarrio;
    }

    /**
     * Get the value of Barrio
     *
     * @return the value of Barrio
     */
    public String getBarrio() {
        return Barrio;
    }

    /**
     * Set the value of Barrio
     *
     * @param Barrio new value of Barrio
     */
    public void setBarrio(String Barrio) {
        this.Barrio = Barrio;
    }

    /**
     * Get the value of CodigoBarrio
     *
     * @return the value of CodigoBarrio
     */
    public String getCodigoBarrio() {
        return CodigoBarrio;
    }

    /**
     * Set the value of CodigoBarrio
     *
     * @param CodigoBarrio new value of CodigoBarrio
     */
    public void setCodigoBarrio(String CodigoBarrio) {
        this.CodigoBarrio = CodigoBarrio;
    }

    /**
     * Get the value of Comuna
     *
     * @return the value of Comuna
     */
    public String getComuna() {
        return Comuna;
    }

    /**
     * Set the value of Comuna
     *
     * @param Comuna new value of Comuna
     */
    public void setComuna(String Comuna) {
        this.Comuna = Comuna;
    }

    /**
     * Get the value of DireccionColegio
     *
     * @return the value of DireccionColegio
     */
    public String getDireccionColegio() {
        return DireccionColegio;
    }

    /**
     * Set the value of DireccionColegio
     *
     * @param DireccionColegio new value of DireccionColegio
     */
    public void setDireccionColegio(String DireccionColegio) {
        this.DireccionColegio = DireccionColegio;
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
     * Get the value of Telefono2
     *
     * @return the value of Telefono2
     */
    public String getTelefono2() {
        return Telefono2;
    }

    /**
     * Set the value of Telefono2
     *
     * @param Telefono2 new value of Telefono2
     */
    public void setTelefono2(String Telefono2) {
        this.Telefono2 = Telefono2;
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
     * Get the value of NombreColegio
     *
     * @return the value of NombreColegio
     */
    public String getNombreColegio() {
        return NombreColegio;
    }

    /**
     * Set the value of NombreColegio
     *
     * @param NombreColegio new value of NombreColegio
     */
    public void setNombreColegio(String NombreColegio) {
        this.NombreColegio = NombreColegio;
    }

    /**
     * Get the value of idColegio
     *
     * @return the value of idColegio
     */
    public int getIdColegio() {
        return idColegio;
    }

    /**
     * Set the value of idColegio
     *
     * @param idColegio new value of idColegio
     */
    public void setIdColegio(int idColegio) {
        this.idColegio = idColegio;
    }

    @Override
    public String toString() {
        return "Colegio{" + "idColegio=" + idColegio + ", NombreColegio=" + NombreColegio + ", Telefono=" + Telefono + ", Telefono2=" + Telefono2 + ", Correo=" + Correo + ", DireccionColegio=" + DireccionColegio + ", Comuna=" + Comuna + ", CodigoBarrio=" + CodigoBarrio + ", Barrio=" + Barrio + '}';
    }

    public LinkedList<Colegio> consultarColegio(String sql) {
        LinkedList<Colegio> lc = new LinkedList<>();
        ResultSet rs;
        int idc;
        String nomc;
        String telefono;
        String telefono2;
        String Correo;
        String Direccion;
        String Comuna;
        String CodeBarrio;
        String Barrio;
        BaseDatos objbd = new BaseDatos();
        if (objbd.crearConexion()) {
            try {
                Statement st = objbd.getConexion().createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    idc = rs.getInt("idColegio");
                    nomc = rs.getString("NombreColegio");
                    telefono = rs.getString("Telefono");
                    telefono2 = rs.getString("Telefono2");
                    Correo = rs.getString("Correo");
                    Direccion = rs.getString("DireccionColegio");
                    Comuna = rs.getString("Comuna");
                    CodeBarrio = rs.getString("CodigoBarrio");
                    Barrio = rs.getString("Barrio");

                    lc.add(new Colegio(idc, nomc, telefono, telefono2, Correo, Direccion, Comuna, CodeBarrio, Barrio));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Identidad_genero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lc;
    }

    public boolean updateColegio(String sql, Colegio objColegio) {       // StoreProcidus - Edita los items en una base de datos // 
        boolean t = false;
        CallableStatement cst;
        BaseDatos objbd = new BaseDatos();
        if (objbd.crearConexion()) {
            try {
                cst = objbd.getConexion().prepareCall(sql);
                cst.setInt(1, objColegio.getIdColegio());
                cst.setString(2, objColegio.getNombreColegio());
                cst.setString(3, objColegio.getTelefono());
                cst.setString(4, objColegio.getTelefono2());
                cst.setString(5, objColegio.getCorreo());
                cst.setString(6, objColegio.getDireccionColegio());
                cst.setString(7, objColegio.getComuna());
                cst.setString(9, objColegio.getCodigoBarrio());
                cst.setString(8, objColegio.getBarrio());

                if (cst.execute()) {
                    t = true;
                }

            } catch (SQLException ex) {
                Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return t;
    }

}
