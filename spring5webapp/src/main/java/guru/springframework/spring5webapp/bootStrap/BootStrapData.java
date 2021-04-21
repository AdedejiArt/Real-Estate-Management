package guru.springframework.spring5webapp.bootStrap;
//Author Adio Adedeji Roheem,Wanjiru Wangodu
import guru.springframework.spring5webapp.domain.Agents;
import guru.springframework.spring5webapp.domain.Customers;
import guru.springframework.spring5webapp.domain.Houses;
import guru.springframework.spring5webapp.domain.Lands;
import guru.springframework.spring5webapp.repositories.AgentsRepository;
import guru.springframework.spring5webapp.repositories.CustomersRepository;
import guru.springframework.spring5webapp.repositories.HousesRepository;
import guru.springframework.spring5webapp.repositories.LandsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final HousesRepository housesRepository;
    private final CustomersRepository customersRepository;
    private final AgentsRepository agentsRepository;
    private final LandsRepository landsRepository;


    public BootStrapData (HousesRepository housesRepository,CustomersRepository customersRepository,AgentsRepository agentsRepository,LandsRepository landsRepository){
     this.housesRepository=housesRepository;
     this.agentsRepository=agentsRepository;
     this.customersRepository=customersRepository;
     this.landsRepository=landsRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Houses Duplex=new Houses("001","Lagos","ValleyView");
        Agents Apexview=new Agents("ApexView Consultancy","a.roheem@alustudent.com","+234578");
        Agents Ojuelegba=new Agents("RAL Clans","adioadedeji5@gmail.com","+2348086412852");
        Agents Suleyman=new Agents("Executor","djspinall@music.com","255780901");
        Customers Adio=new Customers("Adio","Adedeji");
        Lands Ajah=new Lands("001","Ajah","RoyalViewLands");
        Houses Bungalow= new Houses("002","Lagos","Oxlade");
        Houses Detach=new Houses("003","London","Majesty homes");
        Houses popo=new Houses("004","America","Adron homes");
        Houses Iceprince=new Houses("005","Uyo","Revolutions");
        Houses bonez=new Houses("006","Ogbomosho","T pumpy");
        Customers Zagadat=new Customers("Timpire","Sylvia");
        Customers Questions=new Customers("Winners","Question");
        Agents A=new Agents("Lambo","Lambo@gmail.com","+080912345");
        Agents B=new Agents("Jiggy","Jiggy@gmail.com","+12457889");
        Agents C=new Agents("Bad Commando","BadCommando@gmail.com","+2245122");
        Agents D=new Agents("Blaqjerzee","Blaqjerzee@gmail.com","+1278943");
        Agents F=new Agents("Eazi","Eazi@gmail.com","+563821112");
        Lands Balo=new Lands("002","Balo","LakesView");
        Lands Osapa=new Lands("003","Osapa","EkoAtlantic");
        Lands Lafia=new Lands("004","Lafia","Ibadan");
        Lands Nairobi=new Lands("005","Nairobi","BusinessView");
        Lands Shaye=new Lands("006","Shaye","Revolutions");
        Lands Akobo=new Lands("007","Akobo","Alahji");
        Lands Mafia=new Lands("008","Mafia","Ogbomosho");
        Lands Onyeka=new Lands("009","Onyeka","peace");
        Customers Meyene=new Customers("Abasi","Meyene");
        Customers Tope=new Customers("Onanuga","Tope");
        Customers Oluchi=new Customers("Oluchi","Joy");
        Customers Wanjiru=new Customers("Wanjiru","Wangodu");
        Customers Taiwo=new Customers("Gbadamosi","Taiwo");
        Customers Kehinde=new Customers("Gbadamosi","Kehinde");
        Customers Deolu=new Customers("Adeolu","Jamiu");
        Customers Derin=new Customers("Aderinsola","Moyosore");
        Customers Olakira=new Customers("Olakira","Maserati");
        Customers David=new Customers("Adeleke","David");

        

         Adio.getHouses().add(Duplex);
         Adio.getLands().add(Ajah);

         housesRepository.save(Duplex);
         housesRepository.save(Detach);
         housesRepository.save(popo);
         housesRepository.save(Iceprince);
         housesRepository.save(bonez);
         agentsRepository.save(Apexview);
         agentsRepository.save(Ojuelegba);
         agentsRepository.save(Suleyman);
         customersRepository.save(Adio);
         housesRepository.save(Bungalow);
         landsRepository.save(Ajah);
         customersRepository.save(Questions);
         customersRepository.save(Zagadat);
         agentsRepository.save(A);
         agentsRepository.save(B);
         agentsRepository.save(C);
         agentsRepository.save(D);
         agentsRepository.save(F);
         landsRepository.save(Balo);
        landsRepository.save(Osapa);
        landsRepository.save(Lafia);
        landsRepository.save(Nairobi);
        landsRepository.save(Shaye);
        landsRepository.save(Akobo);
        landsRepository.save(Mafia);
        landsRepository.save(Onyeka);
        customersRepository.save(Meyene);
        customersRepository.save(Oluchi);
        customersRepository.save(Olakira);
        customersRepository.save(David);
        customersRepository.save(Taiwo);
        customersRepository.save(Kehinde);
        customersRepository.save(Derin);
        customersRepository.save(Deolu);
        customersRepository.save(Wanjiru);
        customersRepository.save(Tope);



         System.out.println("The number of houses"+" "+housesRepository.count());
         System.out.println("The number of agents"+" "+agentsRepository.count());
         System.out.println("The number of lands"+" "+landsRepository.count());
         System.out.println("The number of customers"+""+customersRepository.count());



    }
}
