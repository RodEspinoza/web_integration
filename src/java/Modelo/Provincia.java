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
public class Provincia {
    
    private int idprovincia;
    private String descripcion;
    private Region region;

    public Provincia() {
    }

    public Provincia(int idprovincia, String descripcion, Region region) {
        this.idprovincia = idprovincia;
        this.descripcion = descripcion;
        this.region = region;
    }

    public int getIdprovincia() {
        return idprovincia;
    }

    public void setIdprovincia(int idprovincia) {
        this.idprovincia = idprovincia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
    
    
    
}
