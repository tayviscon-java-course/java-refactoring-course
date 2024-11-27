package service;

import static org.junit.Assert.assertEquals;

import domain.Person;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;

public class ExtractMethodProblemCodeTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    private final ExtractMethodProblemCode extractMethodProblemCode = new ExtractMethodProblemCode();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void shouldDisplayPersonDataWithBanner() {
        var personData = new Person(
            "Tovkach",
            "Tyomych",
            "Yurievich",
            LocalDate.of(2001, 7, 30)
        );
        extractMethodProblemCode.printOwing(personData);
        assertEquals("""
            [TAYVISCON]
            Фамилия: Tovkach
            Дата рождения: 2001-07-30
            """.split("\\R"),
            outContent.toString().split("\\R")
        );
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

}
