package ictgradschool.industry.javaintro.ex03;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

/**
 * This code will test each of your methods you write for Exercise Three, and tell you if they're correct.
 *
 * Don't worry too much about how this works at the moment - you'll learn unit testing later on in the course :)
 */
public class TestExerciseThree {

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
    public void testKilogramsToPounds() throws IOException {

        cr.kilogramsToPounds(55); // 55 kgs is 121.2541 pounds
        assertEquals("55 kgs is 121.2541 pounds", reader.readLine());

        cr.kilogramsToPounds(100); // 100 kgs is 220.462 pounds
        assertEquals("100 kgs is 220.462 pounds", reader.readLine());

        cr.kilogramsToPounds(0); // 0 kgs is 0.0 pounds
        assertEquals("0 kgs is 0.0 pounds", reader.readLine());

    }

    @Test
    public void testCelsiusToFahrenheit() throws IOException {

        cr.convertCelsiusToFahrenheit(19.5); // 19.5 degrees Celsius is 67.1 degrees Fahrenheit
        assertEquals("19.5 degrees Celsius is 67.1 degrees Fahrenheit", reader.readLine());

        cr.convertCelsiusToFahrenheit(-12.8); // -12.8 degrees Celsius is 8.96 degrees Fahrenheit
        assertEquals("-12.8 degrees Celsius is 8.96 degrees Fahrenheit", reader.readLine());

        cr.convertCelsiusToFahrenheit(0); // 0.0 degrees Celsius is 32.0 degrees Fahrenheit
        assertEquals("0.0 degrees Celsius is 32.0 degrees Fahrenheit", reader.readLine());
    }

    @Test
    public void testCompoundInterestValue() throws IOException {

        cr.getCompoundInterestValue(2500.75, 5.5, 20); // Amount at the end of 20 years: $7297
        assertEquals("Amount at the end of 20 years: $7297", reader.readLine());

        cr.getCompoundInterestValue(100.89, 3.8, 1); // Amount at the end of 1 years: $105
        assertEquals("Amount at the end of 1 years: $105", reader.readLine());

        cr.getCompoundInterestValue(598735, 18.0, 5); // Amount at the end of 5 years: $1369761
        assertEquals("Amount at the end of 5 years: $1369761", reader.readLine());

    }

    @Test
    public void testBMI() throws IOException {

        cr.getMyBMI(65.00, 1.91); // Your BMI is 18
        assertEquals("Your BMI is 18", reader.readLine());

        cr.getMyBMI(61.54, 1.64); // Your BMI is 23
        assertEquals("Your BMI is 23", reader.readLine());

        cr.getMyBMI(78.61, 1.42); // Your BMI is 39
        assertEquals("Your BMI is 39", reader.readLine());

    }

    @Test
    public void testSphereVolume() throws IOException {

        cr.getSphereVolume(0); // Volume is 0 cubic cms.
        assertEquals("Volume is 0 cubic cms.", reader.readLine());

        cr.getSphereVolume(2.8); // Volume is 92 cubic cms.
        assertEquals("Volume is 92 cubic cms.", reader.readLine());

        cr.getSphereVolume(56); // Volume is 735619 cubic cms.
        assertEquals("Volume is 735619 cubic cms.", reader.readLine());

    }

    @Test
    public void testDaysToWeeksAndDays() throws IOException {

        cr.convertTotalDaysIntoWeeksAndDays(0); // This is 0 weeks and 0 days.
        assertEquals("This is 0 weeks and 0 days.", reader.readLine());

        cr.convertTotalDaysIntoWeeksAndDays(25); // This is 3 weeks and 4 days.
        assertEquals("This is 3 weeks and 4 days.", reader.readLine());

        cr.convertTotalDaysIntoWeeksAndDays(14); // This is 2 weeks and 0 days.
        assertEquals("This is 2 weeks and 0 days.", reader.readLine());

        cr.convertTotalDaysIntoWeeksAndDays(3); // This is 0 weeks and 3 days.
        assertEquals("This is 0 weeks and 3 days.", reader.readLine());

    }

    @Test
    public void testFindSmallerInteger() throws IOException {

        cr.findSmallerInteger(1, 2); // 1
        assertEquals("1", reader.readLine());

        cr.findSmallerInteger(-10, -1000); // -1000
        assertEquals("-1000", reader.readLine());

        cr.findSmallerInteger(1, 1); // 1
        assertEquals("1", reader.readLine());


    }

}
