package se.lexicon.simon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    /**
     * E.g. on how to test if it throws exception.
     */
    @Test
    public void shouldThrowException(){
        assertThrows(Throwable.class, () -> {
            throw new Throwable(); }
        );
    }

    @BeforeEach
    public void setUp() throws Exception {

    }

    @AfterEach
    void tearDown() {

    }


}
