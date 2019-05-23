/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author gustso
 */
@ManagedBean
@ViewScoped
public class numerosFormBean {
    private Integer numIngresado;
    private ArrayList numeros;
    private Integer resultadoSuma;

    /**
     * Creates a new instance of numerosFormBean
     */
    public numerosFormBean() {
        numeros = new ArrayList();
    }

    public void ingresarNumeros(){        
        getNumeros().add(getNumIngresado());        
    }
    
    public void sumarNum(){
        setResultadoSuma(0);
        for(int i=0;i<getNumeros().size();i++){
            setResultadoSuma((Integer) getNumeros().get(i)+getResultadoSuma());            
        }
    }

    /**
     * @return the numIngresado
     */
    public Integer getNumIngresado() {
        return numIngresado;
    }

    /**
     * @param numIngresado the numIngresado to set
     */
    public void setNumIngresado(Integer numIngresado) {
        this.numIngresado = numIngresado;
    }

    /**
     * @return the numeros
     */
    public ArrayList getNumeros() {
        return numeros;
    }

    /**
     * @param numeros the numeros to set
     */
    public void setNumeros(ArrayList numeros) {
        this.numeros = numeros;
    }

    /**
     * @return the resultadoSuma
     */
    public Integer getResultadoSuma() {
        return resultadoSuma;
    }

    /**
     * @param resultadoSuma the resultadoSuma to set
     */
    public void setResultadoSuma(Integer resultadoSuma) {
        this.resultadoSuma = resultadoSuma;
    }
    
}
