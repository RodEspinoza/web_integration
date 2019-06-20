/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Comuna;
import Modelo.Conexion;
import Modelo.Propiedad;
import Modelo.Provincia;
import Modelo.Region;
import Modelo.TipoPropiedad;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author arturoriquelmepino
 */
public class DaoPropiedad {
        Propiedad propiedad;
    TipoPropiedad tipoPropiedad;
    Region region;
    Provincia provincia;
    Comuna comuna;
    
    
    public List<Propiedad> listPropiedad()
{


      Conexion conn = new Conexion();
      Connection acceso = conn.getCnn();
      
      Propiedad prop = new Propiedad();
      List<Propiedad> propList = new ArrayList();
      
        try {
            
            CallableStatement callableStatement = acceso.prepareCall("{CALL PKG_PROPIEDAD.SP_LISTAR_PROPIEDAD(?)}");
            callableStatement.registerOutParameter(1, OracleTypes.CURSOR);
            callableStatement.execute();
            
            ResultSet rs = (ResultSet) callableStatement.getObject(1);

            while (rs.next()) {
                tipoPropiedad.setTipo(rs.getString("TIPO"));
                prop.setDireccion(rs.getString("DIRECCION"));
                prop.setEdificio(rs.getString("EDIFICIO"));
                prop.setNumeracion(rs.getString("NUMERACION"));
                prop.setNumdormitorios(rs.getInt("NUMDORMITORIOS"));
                prop.setNumdormitorios(rs.getInt("NUMBANOS"));
                prop.setMcuadrados(rs.getString("MCUADRADOS"));
                prop.setConjunto(rs.getString("CONJUNTO"));
                prop.setNivelubicacion(rs.getString("NIVELUBICACION"));
                prop.setPatentecomercial(rs.getString("PATENTECOMERCIAL"));
                region.setDescripcion(rs.getNString(11));
                provincia.setDescripcion(rs.getNString(12));
                comuna.setDescripcion(rs.getNString(13));
                
                propList.add(prop);
                
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return propList;
        //return "inicioclientes";
}
    
}
