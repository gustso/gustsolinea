/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dominio;

import java.io.Serializable;

/**
 *
 * @author gustso
 */
public class Circulo implements Serializable{
    private double radio;
    private double sup;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * @return the sup
     */
    public double getSup() {
        return sup;
    }

    /**
     * @param sup the sup to set
     */
    public void setSup(double sup) {
        this.sup = sup;
    }

     
    
}
