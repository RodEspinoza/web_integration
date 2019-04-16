package Controler;
import Modelo.Clientes;
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
@RequestMapping("/loginclient.htm")
public class LoginClient {
@RequestMapping(method = RequestMethod.GET)
public String validarGet2()
{
    return "error";
}
@RequestMapping(method = RequestMethod.POST)
public String validarPost2(@RequestParam("cLogin") String cuser, @RequestParam("cPass") String cpass, Model model)
{
    if (cuser.trim().isEmpty()) {
        return "error";
    }
    else {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        Query query2 = session.createQuery("from Clientes where rut ='"+cuser+"'");
        List<Clientes> rt2=query2.list();
        model.addAttribute("cliente",rt2);
        session.getTransaction().commit();
        session.close();
        
        String bdPass = rt2.get(0).getPasswd();
        
        String path;
        if (cpass.equals(bdPass)) {
            path = "redirect:/inicioclientes.htm";
            

            
        } else{
            path = "index";
        }
        
      return path;
    }
}
}
