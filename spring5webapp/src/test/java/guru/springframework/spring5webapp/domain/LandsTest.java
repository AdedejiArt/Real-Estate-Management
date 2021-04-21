package guru.springframework.spring5webapp.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LandsTest {

    @Test
    @DisplayName("Land Tests")
    void getLandName() {
        Lands lands=new Lands("002","Oyo","LekkiView") ;
        Assertions.assertFalse(lands.getName().equals("ApexViewConsultancy"));
    }

    @Test
    @DisplayName("Land Tests")
    void getLandLocation() {
        Lands lands = new Lands("002", "Oyo", "LekkiView");
        Assertions.assertFalse(lands.getLocation().equals("Ibadan"));

    }
}