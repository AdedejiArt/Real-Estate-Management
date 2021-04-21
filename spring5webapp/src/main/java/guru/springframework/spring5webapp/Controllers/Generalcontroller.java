package guru.springframework.spring5webapp.Controllers;
import guru.springframework.spring5webapp.repositories.AgentsRepository;
import guru.springframework.spring5webapp.repositories.CustomersRepository;
// Author:Adio Adedeji Roheem,Wanjiru Wangodu
import guru.springframework.spring5webapp.repositories.LandsRepository;
import guru.springframework.spring5webapp.repositories.HousesRepository;
import guru.springframework.spring5webapp.domain.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Generalcontroller{
    private final AgentsRepository agentsRepository;
    private final CustomersRepository customersRepository;
    private final LandsRepository landsRepository;
    private final HousesRepository housesRepository;


    public Generalcontroller(AgentsRepository agentsRepository,CustomersRepository customersRepository,LandsRepository landsRepository,HousesRepository housesRepository){
        this.agentsRepository=agentsRepository;
        this.customersRepository=customersRepository;
        this.landsRepository=landsRepository;
        this.housesRepository=housesRepository;

    }
    @RequestMapping("/agents")
    public String getAgents(Model model){
        model.addAttribute("agents",agentsRepository.findAll());

        return "index"; }

    @RequestMapping("/customers")
    public String getcustomers(Model model){
        model.addAttribute("customers",customersRepository.findAll());

        return "customs";
    }
    @RequestMapping("/lands")
    public String getlands(Model model){
        model.addAttribute("lands",landsRepository.findAll());
        return "lans"; }

    @RequestMapping("/houses")
    public String gethouses(Model model){
        model.addAttribute("houses",housesRepository.findAll());
        return "hous";
    }

    @RequestMapping("/customs")
    public String  customs() {
        return "customs";
    }
    @RequestMapping("/lans")
    public String  lans() {
        return "lans";
    }
    @RequestMapping("/hous")
    public String hous(){
    return "hous";}
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/Beginning")
    public String Beginning(){
       return "Beginning" ;
    }






}
