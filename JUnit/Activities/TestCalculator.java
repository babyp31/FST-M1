package Example;

import org.example.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.Assert.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestCalculator {

    private Calculator Cal;


    @BeforeEach
    public void setup() {

        Cal = new Calculator();


    }

    @BeforeAll
    public static void beforeMessage() {

        System.out.println(" this is executed before  executing all method");

    }


    @Test
    @DisplayName(" Additions should work")
    @Order(3)
    public void tdd() {
        System.out.println(" show add result");


        assertEquals(5, Cal.add(2, 3));
    }


    @Test
    @DisplayName("Multiplication should work")
    @Order(1)
    public void testMul() {

        System.out.println("Show Multiply result");
        assertEquals(8, Cal.mul(2, 4));
        assertNotEquals(9, Cal.mul(3, 4));


    }

    ;

    @Test
    @DisplayName(" Subtractions should work")
    @Order(2)
    public void Testsub() {

        System.out.println(" Result for subtractions :");
        assertEquals(8, Cal.sub(16, 8));
        assertNotEquals("fail",-1, Cal.sub(3, 4));


    }

    ;

    @AfterEach
    public void display() {

        System.out.println("calculations completed");

    }

    @AfterAll
    public static void afterAllMessage() {

        System.out.println(" this message will display after all ");

    }


}
