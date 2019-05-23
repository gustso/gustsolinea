/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos;

import aplicacion.dominio.Alumno;
import java.util.ArrayList;

/**
 *
 * @author ED 4
 */
public class ListaAlumnos {
    private ArrayList<Alumno> listaAlumnos;

    public ListaAlumnos() {
        listaAlumnos=new ArrayList();
    }

    public ListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }
    
    public void modificarAlumno(Alumno unAlumno){
        for(Alumno a: listaAlumnos){
        if(a.getDni().equals(unAlumno.getDni())){
                getListaAlumnos().set(listaAlumnos.indexOf(a), unAlumno);
                break;
            }
        }
        }
    
    
    public void eliminarAlumno(Alumno unAlumno){
        for(Alumno a: listaAlumnos){
            if(a.getDni().equals(unAlumno.getDni())){   
                listaAlumnos.remove(listaAlumnos.indexOf(a));
                break;
            }
        }
    }
    
    /**
     * @return the listaAlumnos
     */
    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    /**
     * @param listaAlumnos the listaAlumnos to set
     */
    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }
    
    
}
