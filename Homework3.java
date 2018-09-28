/*
 * Reece Boulware
 */

public class Homework3 {

	private int value1, value2, value3;

	public Homework3(int v1, int v2, int v3) {
		value1 = v1;
		value2 = v2;
		value3 = v3;
	}

	/* Call the static grade method in Homework3, passing this object as the
	 * parameter. Calling a static method looks like calling a method on a
	 * class (e.g. Math.random())
	 */
	public void grade() {
	Homework3.grade(this);

	}

	/* Calculate and return the sum of value1, value2, and value3
	 */
	public int sum() {
		int s = value1 + value2 + value3;
		return s;

	}

	/* Calculate and return the average of value1, value2, and value3
	 * Hint: the average of numbers can be fractional
	 */
	public double average() {
		double a = (value1 + value2 + value3) / 3.0;
		return a;

	}

	/* Calculate and return the difference between the product and sum of
	 * value 1, value2, and value3
	 */
	 public int productSumDifference() {
		 int product = value1 * value2 * value3;
		 int sum = value1 + value2 + value3;
		 int d = product - sum;
		 return d;

	 }

	 /* Calculate and return the sum of the squares of value1, value2, and
	  * value3
	  */
	  public int sumSquares() {
			double square1 = Math.pow(value1, 2);
			double square2 = Math.pow(value2, 2);
			double square3 = Math.pow(value3, 2);
			int sum = (int)square1 + (int)square2 + (int)square3;
			return sum;

	  }

	  /* Tests to verify that your solutions work
	   * Do not submit your homework until this compiles and the words
	   * "All Pass" are printed
	   */
	  public static void main(String[] args) {
		  Homework3 hw3 = new Homework3(5, 10, 15);
		  hw3.grade();
	  }

	  public static void grade(Homework3 hw3) {
		  int exitCode = 0;

		  System.out.println("Pass 1");

		  if (hw3.sum() == 30) {
			  System.out.println("Pass 2");
		  } else {
			  System.out.println("Fail 2");
			  exitCode += 1;
		  }

		  if (hw3.average() == 10.0) {
			  System.out.println("Pass 3");
		  } else {
			  System.out.println("Fail 3");
			  exitCode += 1;
		  }

		  if (hw3.productSumDifference() == 720) {
			  System.out.println("Pass 4");
		  } else {
			  System.out.println("Fail 4");
			  exitCode += 1;
		  }

		  if (hw3.sumSquares() == 350) {
			  System.out.println("Pass 5");
		  } else {
			  System.out.println("Fail 5");
			  exitCode += 1;
		  }

		  if (exitCode == 0) {
			  System.out.println("All Pass");
		  } else {
			  System.out.println("Fail");
		  }

		  System.exit(exitCode);
	  }
}
