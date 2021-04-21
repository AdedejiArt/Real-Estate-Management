package guru.springframework.spring5webapp.domain;

import guru.springframework.spring5webapp.repositories.HousesRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomersTest {

    @Test
    @DisplayName("")
    void getFirstname() {
        Customers customers=new Customers("001","Adedeji","Adio");
        Assertions.assertFalse(customers.getFirstname().equals("Adio"));

    }
    @Test
    @DisplayName("Validated Test  case")
    void validatedgetFirstname(){
        Customers customers=new Customers("001","Adedeji","Adio");
        Assertions.assertTrue(customers.getFirstname().equals("Adio"));


    }
    @Test
    @DisplayName("")
    void containshashcode(){
        Customers customers=new Customers("001","Adedeji","Adio");
        Assertions.assertTrue(customers.getLands().contains(hashCode()));
    }
}