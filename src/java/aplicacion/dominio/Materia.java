/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dominio;

/**
 *
 * @author ED 4
 */
public class Materia {
    private Integer codigo;
    private String denominacion;
    private String carrera;
    private String añoc;

    public Materia() {
    }

    public Materia(Integer codigo, String denominacion, String carrera, String añoc) {
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.carrera = carrera;
        this.añoc = añoc;
    }

    /**
     * @return the codigo
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the denominacion
     */
    public String getDenominacion() {
        return denominacion;
    }

    /**
     * @param denominacion the denominacion to set
     */
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * @return the añoc
     */
    public String getAñoc() {
        return añoc;
    }

    /**
     * @param añoc the añoc to set
     */
    public void setAñoc(String añoc) {
        this.añoc = añoc;
    }

    @Override
    public boolean equals(Object obj) {
        return(obj instanceof Materia) && (codigo!=null)? codigo.equals(((Materia)obj).codigo):(obj==this);
    }

    @Override
    public int hashCode() {
        return(codigo!=null)? (this.getClass().hashCode()+codigo.hashCode()):super.hashCode();
    }

    @Override
    public String toString() {
        return String.format("%s %s",denominacion,carrera);
    }
    
    
}
