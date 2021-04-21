package guru.springframework.spring5webapp.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HousesTest {

    @Test
    @DisplayName(" A Test to confirm")
    void getHouseName() {
        Houses houses=new Houses("001","Ajah","Duplex");
        Assertions.assertTrue(houses.getName().equals("Duplex"));

    }
    @Test
    @DisplayName(" A Test to confirm")
    void ValidatedgetHousesName() {
        Houses houses = new Houses("001", "Ajah", "Duplex");
        Assertions.assertFalse(houses.getName().equals("Duplex"));
    }


    @Test
    @DisplayName(" A Test to confirm")
    void getHousesLocation() {
        Houses houses = new Houses("001", "Ajah", "Duplex");
        Assertions.assertTrue(houses.getLocation().equals("Ajah"));
    }
    @Test
    @DisplayName(" A Test to confirm")
    void validatedgetHousesLocation() {
        Houses houses = new Houses("001", "Ajah", "Duplex");
        Assertions.assertFalse(houses.getLocation().equals("Ajah"));
    }

}