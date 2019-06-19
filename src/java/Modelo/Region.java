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
public class Region {
    private int idRegion;
    private String descripcion;

    public Region() {
    }
    

    public Region(int idRegion, String descripcion) {
        this.idRegion = idRegion;
        this.descripcion = descripcion;
    }

    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
}
