package DAO;
import Modelo.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import oracle.jdbc.OracleTypes;




@Controller
@RequestMapping("/loginPersona")
public class DaoPersonaLogin {
    Persona persona;
    Comuna comuna;
    TipoPersona tipoPersona;
    EstadoPersona estadoPersona;
    String path;
    
    
@RequestMapping(method = RequestMethod.GET)

public String login()
{
    return "error";
}
@RequestMapping(method = RequestMethod.POST)
public String login(@RequestParam("cLogin") String cuser, @RequestParam("cPass") String cpass, Model model)
{

      Persona perLogin = new Persona(cuser, cpass);

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
