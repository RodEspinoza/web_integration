/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author arturoriquelmepino
 */
public class TipoPersona {
    private int idtipopersona;
    private String descripcion;

    public TipoPersona() {
    }

    public TipoPersona(int idtipopersona, String descripcion) {
        this.idtipopersona = idtipopersona;
        this.descripcion = descripcion;
    }

    public int getIdtipopersona() {
        return idtipopersona;
    }

    public void setIdtipopersona(int idtipopersona) {
        this.idtipopersona = idtipopersona;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
