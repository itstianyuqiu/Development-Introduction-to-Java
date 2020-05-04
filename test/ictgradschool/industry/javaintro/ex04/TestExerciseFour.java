package ictgradschool.industry.javaintro.ex04;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

/**
 * This code will test your method you write for Exercise Four, and tell you if it's correct.
 *
 * Don't worry too much about how this works at the moment - you'll learn unit testing later on in the course :)
 */
public class TestExerciseFour {

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
    public void testSortNumberAscending() throws IOException {

        cr.sortNumberByAscending(35, -4, 7, 6); // The numbers are: -4, 6, 7, 35
        assertEquals("The numbers are: -4, 6, 7, 35", reader.readLine());

        cr.sortNumberByAscending(-1, 0, 18, -10); // The numbers are: -10, -1, 0, 18
        assertEquals("The numbers are: -10, -1, 0, 18", reader.readLine());

        cr.sortNumberByAscending(1, 2, 3, 4); // The numbers are: 1, 2, 3, 4
        assertEquals("The numbers are: 1, 2, 3, 4", reader.readLine());

    }
}
