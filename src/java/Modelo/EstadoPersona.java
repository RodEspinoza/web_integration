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
public class EstadoPersona {
    private int idEstado;
    private String estadoPersona;

    public EstadoPersona() {
    }

    public EstadoPersona(int idEstado, String estadoPersona) {
        this.idEstado = idEstado;
        this.estadoPersona = estadoPersona;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getEstadoPersona() {
        return estadoPersona;
    }

    public void setEstadoPersona(String estadoPersona) {
        this.estadoPersona = estadoPersona;
    }
   
}
