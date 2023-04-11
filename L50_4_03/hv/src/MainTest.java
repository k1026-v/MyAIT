import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main m;
    @BeforeEach
    public void unit(){
        m= new Main();
    }

    @Test
    public void nameToNumberOccurence_test_oneStr(){
        assertEquals(1,m.nameToNumberOccurence(Arrays.asList("Bob"),"Bob"));
    }

    @Test
    public void nameToNumberOccurence_test_noName(){
        assertEquals(0,m.nameToNumberOccurence(Arrays.asList("Bob", "Garry", "Ewa", "Bob", "Ewa", "Bob"),"Tim"));
    }

    @Test
    public void nameToNumberOccurence_test_numName(){
        assertEquals(3,m.nameToNumberOccurence(Arrays.asList("Bob", "Garry", "Ewa", "Bob", "Ewa", "Bob"),"Bob"));
    }



}