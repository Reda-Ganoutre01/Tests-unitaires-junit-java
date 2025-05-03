import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void CheckPerson(){
        Person person=new Person("Reda Ganoutre",21,"1 rue Rabat");

        assertAll(
                "Person",
                ()->assertEquals("Reda Ganoutre",person.getName(),"Name should be Reda"),
                ()->assertEquals(21,person.getAge(),"Age should be 21"),
                ()->assertEquals("1 rue Rabat",person.getAdresse(),"Adresse should be Rabat")
        );
    }
}