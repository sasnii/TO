package abstractFactory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BreadTest {
    
    public BreadTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testProduceBread() {
        System.out.println("produceBread");
        Bread instance = new BreadImpl();
        instance.produceBread();
    }

    public class BreadImpl implements Bread {

        public void produceBread() {
        }
    }
    
}
