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
public class Propiedad {
    private int idpropiedad;
    private String direccion;
    private String edificio;
    private String numeracion;
    private int numdormitorios;
    private int numbanos;
    private String mcuadrados;
    private String conjunto;
    private String nivelubicacion;
    private String patentecomercial;
    private TipoPropiedad tipoPropiedad;
    private EstadoPropiedad estadoPropiedad;
    private Comuna comuna;
    private Persona dueño;

    public Propiedad() {
    }

    public Propiedad(int idpropiedad, String direccion, String edificio, String numeracion, int numdormitorios, int numbanos, String mcuadrados, String conjunto, String nivelubicacion, String patentecomercial, TipoPropiedad tipoPropiedad, EstadoPropiedad estadoPropiedad, Comuna comuna, Persona dueño) {
        this.idpropiedad = idpropiedad;
        this.direccion = direccion;
        this.edificio = edificio;
        this.numeracion = numeracion;
        this.numdormitorios = numdormitorios;
        this.numbanos = numbanos;
        this.mcuadrados = mcuadrados;
        this.conjunto = conjunto;
        this.nivelubicacion = nivelubicacion;
        this.patentecomercial = patentecomercial;
        this.tipoPropiedad = tipoPropiedad;
        this.estadoPropiedad = estadoPropiedad;
        this.comuna = comuna;
        this.dueño = dueño;
    }

    public int getIdpropiedad() {
        return idpropiedad;
    }

    public void setIdpropiedad(int idpropiedad) {
        this.idpropiedad = idpropiedad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public String getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(String numeracion) {
        this.numeracion = numeracion;
    }

    public int getNumdormitorios() {
        return numdormitorios;
    }

    public void setNumdormitorios(int numdormitorios) {
        this.numdormitorios = numdormitorios;
    }

    public int getNumbanos() {
        return numbanos;
    }

    public void setNumbanos(int numbanos) {
        this.numbanos = numbanos;
    }

    public String getMcuadrados() {
        return mcuadrados;
    }

    public void setMcuadrados(String mcuadrados) {
        this.mcuadrados = mcuadrados;
    }

    public String getConjunto() {
        return conjunto;
    }

    public void setConjunto(String conjunto) {
        this.conjunto = conjunto;
    }

    public String getNivelubicacion() {
        return nivelubicacion;
    }

    public void setNivelubicacion(String nivelubicacion) {
        this.nivelubicacion = nivelubicacion;
    }

    public String getPatentecomercial() {
        return patentecomercial;
    }

    public void setPatentecomercial(String patentecomercial) {
        this.patentecomercial = patentecomercial;
    }

    public TipoPropiedad getTipoPropiedad() {
        return tipoPropiedad;
    }

    public void setTipoPropiedad(TipoPropiedad tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }

    public EstadoPropiedad getEstadoPropiedad() {
        return estadoPropiedad;
    }

    public void setEstadoPropiedad(EstadoPropiedad estadoPropiedad) {
        this.estadoPropiedad = estadoPropiedad;
    }

    public Comuna getComuna() {
        return comuna;
    }

    public void setComuna(Comuna comuna) {
        this.comuna = comuna;
    }

    public Persona getDueño() {
        return dueño;
    }

    public void setDueño(Persona dueño) {
        this.dueño = dueño;
    }
    
    
}
