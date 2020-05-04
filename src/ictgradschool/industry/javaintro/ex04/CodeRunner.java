package ictgradschool.industry.javaintro.ex04;

/**
 * Programming for Industry - Lab 01
 * Exercise Four - Sorting Numbers
 * 
 * Note: Put your answers in between the "// Answer here //" comments. Do not modify other parts of the class.
 */
public class CodeRunner {
	
	/**
	 * Sorting numbers in order.
	 */
	public void sortNumberByAscending(int number1, int number2, int number3, int number4) {
		int first = 0;
		int second = 0;
		int third = 0;
		int fourth = 0;

		first = Math.min (Math.min (Math.min(number1, number2),number3),number4);
		second = Math.min(Math.max(Math.min (number1, number2),Math.min(number3, number4)),Math.max(Math.min (number1, number3),Math.min(number2, number4)));
		third = Math.max(Math.min(Math.max (number1, number2),Math.max(number3, number4)),Math.min(Math.max (number1, number3),Math.max(number2, number4)));
		fourth = Math.max (Math.max (Math.max(number1, number2),number3),number4);

		System.out.println("The numbers are: " + first + ", " + second + ", " + third + ", " + fourth);
	}

	/**
	 * Don't edit this - but read/use this for testing if you like.
	 */
	public static void main(String[] args) {
		CodeRunner cr = new CodeRunner();
		
		cr.sortNumberByAscending(35, -4, 7, 6); // The numbers are: -4, 6, 7, 35
		cr.sortNumberByAscending(-1, 0, 18, -10); // The numbers are: -10, -1, 0, 18
		cr.sortNumberByAscending(1, 2, 3, 4); // The numbers are: 1, 2, 3, 4
	}

}
