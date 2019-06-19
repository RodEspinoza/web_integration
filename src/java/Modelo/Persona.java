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
public class Persona {
    private int idpersona;
    private String rut;
    private String nombre;
    private String appaterno;
    private String apmaterno;
    private String telefono;
    private String direccion;
    private TipoPersona tipoPersona;
    private Comuna comuna;
    private String email;
    private String password;
    private EstadoPersona estadoPersona;

    public Persona() {
    }

    public Persona(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    

    public Persona(int idpersona, String rut, String nombre, String appaterno, String apmaterno, String telefono, String direccion, TipoPersona tipoPersona, Comuna comuna, String email, String password, EstadoPersona estadoPersona) {
        this.idpersona = idpersona;
        this.rut = rut;
        this.nombre = nombre;
        this.appaterno = appaterno;
        this.apmaterno = apmaterno;
        this.telefono = telefono;
        this.direccion = direccion;
        this.tipoPersona = tipoPersona;
        this.comuna = comuna;
        this.email = email;
        this.password = password;
        this.estadoPersona = estadoPersona;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppaterno() {
        return appaterno;
    }

    public void setAppaterno(String appaterno) {
        this.appaterno = appaterno;
    }

    public String getApmaterno() {
        return apmaterno;
    }

    public void setApmaterno(String apmaterno) {
        this.apmaterno = apmaterno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public TipoPersona getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(TipoPersona tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public Comuna getComuna() {
        return comuna;
    }

    public void setComuna(Comuna comuna) {
        this.comuna = comuna;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public EstadoPersona getEstadoPersona() {
        return estadoPersona;
    }

    public void setEstadoPersona(EstadoPersona estadoPersona) {
        this.estadoPersona = estadoPersona;
    }
            
    
}
