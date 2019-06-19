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
public class EstadoPropiedad {
    private int idestadopropiedad;
    private String estado;

    public EstadoPropiedad() {
    }

    public EstadoPropiedad(int idestadopropiedad, String estado) {
        this.idestadopropiedad = idestadopropiedad;
        this.estado = estado;
    }

    public int getIdestadopropiedad() {
        return idestadopropiedad;
    }

    public void setIdestadopropiedad(int idestadopropiedad) {
        this.idestadopropiedad = idestadopropiedad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
