package guru.springframework.spring5webapp.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgentsTest {

    @Test
    @DisplayName(" A Test to confirm")
    void getName() {
        Agents agents=new Agents("ApexViewConsultancy");
         Assertions.assertFalse(agents.equals("ApexViewConsultancy"));
    }


    @Test
    @DisplayName("A Test to confirm")
    void validatedgetname(){
        Agents agents=new Agents("ApexViewConsultancy");
        Assertions.assertTrue(agents.equals("ApexViewConsultancy"));
    }


}

