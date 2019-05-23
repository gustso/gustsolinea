/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import aplicacion.dominio.Circulo;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author gustso
 */
@ManagedBean
@ViewScoped
public class CirculoFormBean implements Serializable{
private ArrayList<Circulo> circulos;
private Circulo circulo;
    /**
     * Creates a new instance of CirculoFormBean
     */
    public CirculoFormBean() {
        circulos = new ArrayList();
        circulo = new Circulo();
    }

    public void cargarCirculos(){
        getCirculo().setSup(Math.PI*Math.pow(getCirculo().getRadio(), 2));
        getCirculos().add(getCirculo());
        circulo = new Circulo();
    }
    
    /**
     * @return the circulos
     */    
    public ArrayList<Circulo> getCirculos() {
        return circulos;
    }
    /**
     * @param circulos the circulos to set
     */
    public void setCirculos(ArrayList<Circulo> circulos) {
        this.circulos = circulos;
    }

    /**
     * @return the circulo
     */
    public Circulo getCirculo() {
        return circulo;
    }

    /**
     * @param circulo the circulo to set
     */
    public void setCirculo(Circulo circulo) {
        this.circulo = circulo;
    }
    
}
