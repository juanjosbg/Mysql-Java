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
public class Docente {

    private int idDocente;
    private String NombreDocente;
    private String NombreDocente2;
    private String ApellidoDocente;
    private String ApellidoDocente2;
    private String Telefono;
    private String Correo;
    private String FechaNacimiento;
    private int idColegiofk;

    public Docente() {
    }

    public Docente(String NombreDocente, String NombreDocente2, String ApellidoDocente, String ApellidoDocente2, String Telefono, String Correo, String FechaNacimiento, int idColegiofk) {
        this.NombreDocente = NombreDocente;
        this.NombreDocente2 = NombreDocente2;
        this.ApellidoDocente = ApellidoDocente;
        this.ApellidoDocente2 = ApellidoDocente2;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.FechaNacimiento = FechaNacimiento;
        this.idColegiofk = idColegiofk;
    }

    public Docente(int idDocente, String NombreDocente, String NombreDocente2, String ApellidoDocente, String ApellidoDocente2) {
        this.idDocente = idDocente;
        this.NombreDocente = NombreDocente;
        this.NombreDocente2 = NombreDocente2;
        this.ApellidoDocente = ApellidoDocente;
        this.ApellidoDocente2 = ApellidoDocente2;
    }

   public Docente(String NombreDocente, String ApellidoDocente, String ApellidoDocente2, String Telefono, String Correo, String FechaNacimiento, int idColegiofk) {
        this.NombreDocente = NombreDocente;
        this.ApellidoDocente = ApellidoDocente;
        this.ApellidoDocente2 = ApellidoDocente2;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.FechaNacimiento = FechaNacimiento;
        this.idColegiofk = idColegiofk;
    }

   public Docente(String NombreDocente, String ApellidoDocente, String Telefono, String Correo, String FechaNacimiento, int idColegiofk) {
        this.NombreDocente = NombreDocente;
        this.ApellidoDocente = ApellidoDocente;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.FechaNacimiento = FechaNacimiento;
        this.idColegiofk = idColegiofk;
    }

    public Docente(int idDocente, String NombreDocente, String NombreDocente2, String ApellidoDocente, String ApellidoDocente2, String Telefono, String Correo) {
        this.idDocente = idDocente;
        this.NombreDocente = NombreDocente;
        this.NombreDocente2 = NombreDocente2;
        this.ApellidoDocente = ApellidoDocente;
        this.ApellidoDocente2 = ApellidoDocente2;
        this.Telefono = Telefono;
        this.Correo = Correo;
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
     * Get the value of ApellidoDocente2
     *
     * @return the value of ApellidoDocente2
     */
    public String getApellidoDocente2() {
        return ApellidoDocente2;
    }

    /**
     * Set the value of ApellidoDocente2
     *
     * @param ApellidoDocente2 new value of ApellidoDocente2
     */
    public void setApellidoDocente2(String ApellidoDocente2) {
        this.ApellidoDocente2 = ApellidoDocente2;
    }

    /**
     * Get the value of ApellidoDocente
     *
     * @return the value of ApellidoDocente
     */
    public String getApellidoDocente() {
        return ApellidoDocente;
    }

    /**
     * Set the value of ApellidoDocente
     *
     * @param ApellidoDocente new value of ApellidoDocente
     */
    public void setApellidoDocente(String ApellidoDocente) {
        this.ApellidoDocente = ApellidoDocente;
    }

    /**
     * Get the value of NombreDocente2
     *
     * @return the value of NombreDocente2
     */
    public String getNombreDocente2() {
        return NombreDocente2;
    }

    /**
     * Set the value of NombreDocente2
     *
     * @param NombreDocente2 new value of NombreDocente2
     */
    public void setNombreDocente2(String NombreDocente2) {
        this.NombreDocente2 = NombreDocente2;
    }

    /**
     * Get the value of NombreDocente
     *
     * @return the value of NombreDocente
     */
    public String getNombreDocente() {
        return NombreDocente;
    }

    /**
     * Set the value of NombreDocente
     *
     * @param NombreDocente new value of NombreDocente
     */
    public void setNombreDocente(String NombreDocente) {
        this.NombreDocente = NombreDocente;
    }

    /**
     * Get the value of idDocente
     *
     * @return the value of idDocente
     */
    public int getIdDocente() {
        return idDocente;
    }

    /**
     * Set the value of idDocente
     *
     * @param idDocente new value of idDocente
     */
    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    @Override
    public String toString() {
        return "Docente{" + "idDocente=" + idDocente + ", NombreDocente=" + NombreDocente + ", NombreDocente2=" + NombreDocente2 + ", ApellidoDocente=" + ApellidoDocente + ", ApellidoDocente2=" + ApellidoDocente2 + ", Telefono=" + Telefono + ", Correo=" + Correo + ", FechaNacimiento=" + FechaNacimiento + ", idColegiofk=" + idColegiofk + '}';
    }

    public LinkedList<Docente> consultarDocente(String sql) {
        LinkedList<Docente> ld = new LinkedList<>();
        ResultSet rs;
        int idd;
        String nomd;
        String nomd2;
        String aped;
        String aped2;
        String atel;
        String acorre;
        BaseDatos objbd = new BaseDatos();
        if (objbd.crearConexion()) {
            try {
                Statement st = objbd.getConexion().createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    idd = rs.getInt("idDocente");
                    nomd = rs.getString("NombreDocente");
                    nomd2 = rs.getString("NombreDocente2");
                    aped = rs.getString("ApellidoDocente");
                    aped2 = rs.getString("ApellidoDocente2");
                    atel = rs.getString("Telefono");
                    acorre = rs.getString("Correo");
                    ld.add(new Docente(idd, nomd, nomd2, aped, aped2,atel,acorre));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Docente.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return ld;
    }

}
