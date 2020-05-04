package ictgradschool.industry.javaintro.ex05;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

/**
 * This code will test your method you write for Exercise Five, and tell you if it's correct.
 *
 * Don't worry too much about how this works at the moment - you'll learn unit testing later on in the course :)
 */
public class TestExerciseFive {

    private CodeRunner cr;

    private PipedInputStream pIn;
    private PipedOutputStream pOut;
    private BufferedReader reader;

    private PrintStream oldOut;

    @Before
    public void setup() throws IOException {
        cr = new CodeRunner();

        oldOut = System.out;

        // Hack so we can read things that you print using System.out.println
        pIn = new PipedInputStream();
        pOut = new PipedOutputStream(pIn);
        System.setOut(new PrintStream(pOut));
        reader = new BufferedReader(new InputStreamReader(pIn));

    }

    @After
    public void tearDown() throws IOException {

        System.setOut(oldOut);
        reader.close();
        pOut.close();

    }

    @Test
    public void testTimeElapsed() throws IOException {

        cr.getTimeElapsed(5, 30, 4, 45); // 11 hours and 15 minutes have passed.
        assertEquals("11 hours and 15 minutes have passed.", reader.readLine());

        cr.getTimeElapsed(3, 30, 7, 15); // 3 hours and 45 minutes have passed.
        assertEquals("3 hours and 45 minutes have passed.", reader.readLine());

        cr.getTimeElapsed(0, 0, 12, 0); // 12 hours and 0 minutes have passed.
        assertEquals("12 hours and 0 minutes have passed.", reader.readLine());

        cr.getTimeElapsed(8, 0, 8, 0); // 0 hours and 0 minutes have passed.
        assertEquals("0 hours and 0 minutes have passed.", reader.readLine());

        cr.getTimeElapsed(5, 30, 5, 29); // 11 hours and 59 minutes have passed.
        assertEquals("11 hours and 59 minutes have passed.", reader.readLine());
    }
}
