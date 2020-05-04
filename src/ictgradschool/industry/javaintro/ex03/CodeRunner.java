package ictgradschool.industry.javaintro.ex03;

/**
 * Programming for Industry - Lab 01
 * Exercise Three - Programming practice
 * 
 * Note: Put your answers in between the "// Answer here //" comments. Do not modify other parts of the class.
 */
public class CodeRunner {

	/**
	 * 1. Convert kilograms to pounds.
	 */
	public void kilogramsToPounds(int kilograms) {
		double pounds = 0.0;
		pounds = kilograms * 2.20462;
		System.out.println(kilograms + " kgs is " + pounds + " pounds");
	}

	/**
	 * 2. Convert Celsius to Fahrenheit.
	 */
	public void convertCelsiusToFahrenheit(double celsius) {
		double farenheit = 0.0;
        farenheit = (double)(32 + 9 * celsius / 5 );
		System.out.println(celsius + " degrees Celsius is " + farenheit + " degrees Fahrenheit");
	}

	/**
	 * 3. Calculate compound interest.
	 */
	public void getCompoundInterestValue(double principal, double rate, int years) {
		int value = 0;
        value = (int) Math.round(principal * Math.pow((1 + rate / 100), years));
		System.out.println("Amount at the end of " + years + " years: $" + value);
	}

	/**
	 * 4. Calculate my BMI.
	 */
	public void getMyBMI(double weight, double height) {
		int myBMI = 0;
		myBMI = (int) Math.round(weight / Math.pow(height,2));
		System.out.println("Your BMI is " + myBMI);
	}

	/**
	 * 5. Calculate the volume of a sphere.
	 */
	public void getSphereVolume(double radius) {
		int volume = 0;
		volume = (int) Math.round(4 * Math.PI * Math.pow(radius, 3)/3);
		System.out.println("Volume is " + volume + " cubic cms.");
	}

	/**
	 * 6. Convert total days into weeks and days.
	 */
	public void convertTotalDaysIntoWeeksAndDays(int days) {
		int weeks = 0;
		int remainingDays = 0;
		weeks = days/7;
		remainingDays = days%7;
		System.out.println("This is " + weeks + " weeks and " + remainingDays + " days.");
	}

	/**
	 * 7. Determine smaller integer.
	 */
	public void findSmallerInteger(int a, int b) {
		int smallerInt = 0;
		smallerInt = (int)Math.min(a,b);
        System.out.println(smallerInt);
	}
	

	/**
	 * Don't edit this - but read/use this for testing if you like.
	 */
	public static void main(String[] args) {
		CodeRunner cr = new CodeRunner();

		// 1. Convert kilograms to pounds.
		cr.kilogramsToPounds(55); // 55 kgs is 121.2541 pounds
		cr.kilogramsToPounds(100); // 100 kgs is 220.462 pounds
		cr.kilogramsToPounds(0); // 0 kgs is 0.0 pounds

		// 2. Convert Celsius to Fahrenheit.
		cr.convertCelsiusToFahrenheit(19.5); // 19.5 degrees Celsius is 67.1 degrees Fahrenheit
		cr.convertCelsiusToFahrenheit(-12.8); // -12.8 degrees Celsius is 8.96 degrees Fahrenheit
		cr.convertCelsiusToFahrenheit(0); // 0.0 degrees Celsius is 32.0 degrees Fahrenheit

		// 3. Calculate compound interest.
		cr.getCompoundInterestValue(2500.75, 5.5, 20); // Amount at the end of 20 years: $7297
		cr.getCompoundInterestValue(100.89, 3.8, 1); // Amount at the end of 1 years: $105
		cr.getCompoundInterestValue(598735, 18.0, 5); // Amount at the end of 5 years: $1369761

		// 4. Calculate my BMI.
		cr.getMyBMI(65.00, 1.91); // Your BMI is 18
		cr.getMyBMI(61.54, 1.64); // Your BMI is 23
		cr.getMyBMI(78.61, 1.42); // Your BMI is 39

		// 5. Calculate the volume of a sphere.
		cr.getSphereVolume(0); // Volume is 0 cubic cms.
		cr.getSphereVolume(2.8); // Volume is 92 cubic cms.
		cr.getSphereVolume(56); // Volume is 735619 cubic cms.

		// 6. Convert total days into weeks and days.
		cr.convertTotalDaysIntoWeeksAndDays(0); // This is 0 weeks and 0 days.
		cr.convertTotalDaysIntoWeeksAndDays(25); // This is 3 weeks and 4 days.
		cr.convertTotalDaysIntoWeeksAndDays(14); // This is 2 weeks and 0 days.
		cr.convertTotalDaysIntoWeeksAndDays(3); // This is 0 weeks and 3 days.

		// 7. Determine smaller integer.
		cr.findSmallerInteger(1, 2); // 1
		cr.findSmallerInteger(-10, -1000); // -1000
		cr.findSmallerInteger(1, 1); // 1
	}

}

