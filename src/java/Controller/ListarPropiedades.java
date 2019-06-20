/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DaoPropiedad;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author arturoriquelmepino
 */

@Controller
@RequestMapping("/listarPropiedad")
public class ListarPropiedades {
    String path;
    
    @RequestMapping(method = RequestMethod.GET)
    public void login(@RequestParam("lUser") String user, @RequestParam("lPass") String pass){
        DaoPropiedad listaProp = new DaoPropiedad();
        listaProp.listPropiedad();
        
        
    }
    
}
