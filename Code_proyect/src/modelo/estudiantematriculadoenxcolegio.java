/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Brian Leon
 */
public class estudiantematriculadoenxcolegio {

    //Estudiante
    private String NombreEstudiante;
    private String NombreEstudiante_2;
    private String ApellidoEstudiante;
    private String ApellidoEstudiante_2;
    //Matricula
    private String fechaMatricula;
    //Grado
    private String NombreG;
    //Colegio
    private String NombreColegio;
    //Constructor

    public estudiantematriculadoenxcolegio(String NombreEstudiante, String NombreEstudiante_2, String ApellidoEstudiante, String ApellidoEstudiante_2, String fechaMatricula, String NombreG, String NombreColegio) {
        this.NombreEstudiante = NombreEstudiante;
        this.NombreEstudiante_2 = NombreEstudiante_2;
        this.ApellidoEstudiante = ApellidoEstudiante;
        this.ApellidoEstudiante_2 = ApellidoEstudiante_2;
        this.fechaMatricula = fechaMatricula;
        this.NombreG = NombreG;
        this.NombreColegio = NombreColegio;
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
     * Get the value of ApellidoEstudiante
     *
     * @return the value of ApellidoEstudiante
     */
    public String getApellidoEstudiante() {
        return ApellidoEstudiante;
    }

    /**
     * Set the value of ApellidoEstudiante
     *
     * @param ApellidoEstudiante new value of ApellidoEstudiante
     */
    public void setApellidoEstudiante(String ApellidoEstudiante) {
        this.ApellidoEstudiante = ApellidoEstudiante;
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

    @Override
    public String toString() {
        return "estudiantematriculadoenxcolegio{" + "NombreEstudiante=" + NombreEstudiante + ", NombreEstudiante_2=" + NombreEstudiante_2 + ", ApellidoEstudiante=" + ApellidoEstudiante + ", ApellidoEstudiante_2=" + ApellidoEstudiante_2 + ", fechaMatricula=" + fechaMatricula + ", NombreG=" + NombreG + ", NombreColegio=" + NombreColegio + '}';
    }

}
