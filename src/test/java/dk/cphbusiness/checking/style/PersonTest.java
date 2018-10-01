package dk.cphbusiness.checking.style;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    
    public PersonTest() {
        }
    
    @Test
    public void testPersonConstruction() {
        Person person = new Person(7, "Kurt", "kurt@hansen.dk");
        assertThat(person.name, is("Kurt"));
        }

    }
