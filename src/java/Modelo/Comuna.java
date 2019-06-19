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
public class Comuna {
    private int idcomuna;
    private String descripcion;
    private Provincia provincia;

    public Comuna() {
    }

    public Comuna(int idcomuna, String descripcion, Provincia provincia) {
        this.idcomuna = idcomuna;
        this.descripcion = descripcion;
        this.provincia = provincia;
    }

    public int getIdcomuna() {
        return idcomuna;
    }

    public void setIdcomuna(int idcomuna) {
        this.idcomuna = idcomuna;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    
    
    
}
