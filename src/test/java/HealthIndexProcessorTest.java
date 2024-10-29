import com.HealthIndexProcessor.HealthIndexProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HealthIndexProcessorTest {

    private HealthIndexProcessor processor;

    @BeforeEach
    void setUp() {
        processor = new HealthIndexProcessor();
    }

    @Test
    void testMultipleOf3Only() {
        assertEquals("Cardiologie",
                processor.getMedicalUnit(33),  "L'index 33 doit renvoyer Cardiologie");
    }

    @Test
    void testMultipleOf5Only() {
        assertEquals("Traumatologie",
                processor.getMedicalUnit(55), "L'index 55 doit renvoyer Traumatologie");
    }

    @Test
    void testMultipleOf3And5() {
        assertEquals("Cardiologie, Traumatologie",
                processor.getMedicalUnit(15), "L'index 15 doit renvoyer Cardiologie, Traumatologie");
    }

    @Test
    void testNoServiceRequired() {
        assertEquals("Aucun service requis",
                processor.getMedicalUnit(7), "L'index 7 ne doit renvoyer aucun service");
    }

    @Test
    void testZero() {
        assertEquals("Cardiologie, Traumatologie",
                processor.getMedicalUnit(0), "L'index 0 doit renvoyer Cardiologie, Traumatologie (considéré comme multiple de tous les nombres)");
    }
}
