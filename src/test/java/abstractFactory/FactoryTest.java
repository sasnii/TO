package abstractFactory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FactoryTest {
    
    public FactoryTest() {
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
    public void testCreateBread() {
        System.out.println("createBread");
        Factory instance = new FactoryImpl();
        Bread expResult = null;
        Bread result = instance.createBread();
        assertEquals(expResult, result);
    }

    @Test
    public void testCreateButter() {
        System.out.println("createButter");
        Factory instance = new FactoryImpl();
        Butter expResult = null;
        Butter result = instance.createButter();
        assertEquals(expResult, result);
    }

    @Test
    public void testCreateChesse() {
        System.out.println("createChesse");
        Factory instance = new FactoryImpl();
        Chesse expResult = null;
        Chesse result = instance.createChesse();
        assertEquals(expResult, result);
    }

    public class FactoryImpl implements Factory {

        public Bread createBread() {
            return null;
        }

        public Butter createButter() {
            return null;
        }

        public Chesse createChesse() {
            return null;
        }
    }
    
}
