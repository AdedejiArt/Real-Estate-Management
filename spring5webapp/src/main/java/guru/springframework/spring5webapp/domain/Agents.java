package guru.springframework.spring5webapp.domain;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
//Author Adio Adedeji,Wanjiru Wangodu
@Entity

public class Agents {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
//        private  String ID;

        private String Name;

        private String email;
        private String phoneNumber;
        @ManyToMany
        private Set<Lands>land = new HashSet<>();

        public Agents(){

        }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Agents(String Name){
                this.Name=Name;

        }
        public Agents(String Name, String email , String phoneNumber){
            this.Name=Name;
            this.email=email;
            this.phoneNumber=phoneNumber;
        }

    public void setId(Long id) {
        this.id = id;
    }
    //     public Agents(String ID,String Name ){
//                this.ID=ID;
      //          this.Name=Name;



//}


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
             return id;
       }

        public String getName() {
                return Name;
        }

        public Set<Lands> getLand() {
                return land;
        }

 //       public void setID(String ID) {
 //               this.ID = ID;
//        }

        public void setName(String name) {
                Name = name;
        }

        public void setLand(Set<Lands> land) {
                this.land = land;
        }

        @Override
        public String toString() {
                return "Agents{" +
                        "id=" + id +
//                        ", ID='" + ID + '\'' +
                        ", Name='" + Name + '\'' +
                        ", land=" + land + '\'' +
                         ",email=" +email +'\''+
                          ",phoneNumber="+phoneNumber +'\'' +
                        '}';
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                Agents agents = (Agents) o;

                return id != null ? id.equals(agents.id) : agents.id == null;
        }

        @Override
        public int hashCode() {
                return id != null ? id.hashCode() : 0;
        }
}
