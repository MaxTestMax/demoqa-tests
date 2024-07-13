import org.junit.jupiter.api.*;

public class TestSimpleJUnit {

    int result;

    @BeforeAll
    static void beforeAll() {
        System.out.println("### beforeAll()\n");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("### beforeEach()\n");
        result = getResult();
    }

    @AfterEach
    void afterEach() {
        System.out.println("### afterEach()");
        result = 0;
    }

    @Test
    void firstTest() {
        System.out.println("### firstTest()");
        int result = getResult();
        Assertions.assertTrue(result > 2);
    }

    @Test
    void secondTest() {
        System.out.println("### secondTest()");
        Assertions.assertTrue(result > 2);
    }

    @Test
    void thirdTest() {
        System.out.println("### thirdTest()");
        Assertions.assertTrue(result > 2);
    }

    private int getResult() {
        return 3;
    }

    @AfterAll
    static void afterAll() {
        System.out.println("### beforeAll()");
    }
}