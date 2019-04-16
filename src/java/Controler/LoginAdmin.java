/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;
import Modelo.Usuarios;
import Modelo.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/loginadmin.htm")
public class LoginAdmin {
@RequestMapping(method = RequestMethod.GET)
public String validarGet()
{
    return "error";
}
@RequestMapping(method = RequestMethod.POST)
public String validarPost(@RequestParam("lUser") String user, @RequestParam("lPass") String pass, Model model)
{
    if (user.trim().isEmpty()) {
        return "error";
    }
    else {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        Query query = session.createQuery("from Usuarios where rut ="+user);
        List<Usuarios> rt=query.list();
        model.addAttribute("usuario",rt);
        session.getTransaction().commit();
        session.close();
        
        String recivedPass = rt.get(0).getPasswd();
        Integer rol = rt.get(0).getRolusuario_1();
        
        String path = "error";
        if (pass.equals(recivedPass)) {
            
            if (rol == 1) {
        } else {
                path = "redirect:/dash.htm";
            }
            if (rol == 2) {
            path = "redirect:/dash.htm";
        }
            
            if (rol == 3) {
            path = "redirect:/dash.htm";
        }
            
        } else{
            path = "error";
        }
        
      return path;
    }
}
}
