package Controler;

import Modelo.Clientes;
import Modelo.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/dash.htm")
public class Dashboard {
    @RequestMapping(method = RequestMethod.GET)
public String validarGet(Model model)
{
            Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        Query query = session.createQuery("from Clientes");
        List<Clientes> rt=query.list();
        model.addAttribute("cliente",rt);
        session.getTransaction().commit();
        session.close();
        
        
        
        
         return "dashboard";
}
@RequestMapping(method = RequestMethod.POST)
public String validarPost(Model model)
{

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        Query query = session.createQuery("from Clientes");
        List<Clientes> rt=query.list();
        model.addAttribute("cliente",rt);
        session.getTransaction().commit();
        session.close();
        
        
        
        
         return "dashboard";
    
}
    
}
