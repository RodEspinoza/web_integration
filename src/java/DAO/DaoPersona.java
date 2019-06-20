/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Comuna;
import Modelo.Conexion;
import Modelo.EstadoPersona;
import Modelo.Persona;
import Modelo.TipoPersona;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author arturoriquelmepino
 */
public class DaoPersona {
    Persona persona;
    Comuna comuna;
    TipoPersona tipoPersona;
    EstadoPersona estadoPersona;
    String path;
    
    
    public String login(String user, String password){


      Persona perLogin = new Persona(user, password);

      Conexion conn = new Conexion();
      Connection acceso = conn.getCnn();
      
      
      persona = null;
      
        try {
            
            CallableStatement callableStatement = acceso.prepareCall("{CALL PKG_PERSONA.SP_AUTENTICAR_USUARIO(?,?,?)}");
            callableStatement.setString(1, perLogin.getEmail());
            callableStatement.setString(2, perLogin.getPassword());
            callableStatement.registerOutParameter(3, OracleTypes.CURSOR);
            callableStatement.execute();

            ResultSet rs = (ResultSet) callableStatement.getObject(3);

            while (rs.next()) {
            persona = new Persona();
            persona.setRut(rs.getString("RUT"));
            persona.setNombre(rs.getString("NOMBRE"));
            persona.setAppaterno(rs.getString("APPATERNO"));
            persona.setApmaterno(rs.getString("APMATERNO"));
            //tipoPersona.setIdtipopersona(Integer.parseInt(rs.getString("IDTIPOPERSONA")));
            //estadoPersona.setIdEstado(Integer.parseInt(rs.getString("IDESTADO")));
            //persona.setTipoPersona(tipoPersona);
            //persona.setEstadoPersona(estadoPersona);
            
            /*System.out.println("Rut: " + persona.getRut() + " Nombre: " + persona.getNombre() + " Apellido Paterno: " + persona.getAppaterno() + 
                        " Apellido Materno: " + persona.getApmaterno() + " ID TipoPersona: " + tipoPersona.getIdtipopersona() + " ID Estado Persona: " + 
                    estadoPersona.getIdEstado());*/
            
            }
            
            if (persona.getTipoPersona().equals(1)) {
                path = "redirect:/inicioclientes.htm";
            }
            
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        
        return path;
}
    
}
