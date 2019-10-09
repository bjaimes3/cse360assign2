package cse360assign2;


/**
 * Class method used AddingMachine contains methods getTotal(), add(), subtract(), toString(), and clear()
 */
public class AddingMachine {

	private int total;
	private String chain;


	/**
	 * Cunstructor class for AddingMachine
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		chain = "0";
	}

	/**
	 * method that returns an integer does not take input
	 */
	public int getTotal () {
		return this.total;
	}

	/**
	 * method that take an integer, and adds it to the sum and adds it to toString
	 */
	public void add (int value) {
		this.total += value;
		this.chain +=  " + " + value;

	}

	/**
	 * method that takes an integer, and subtracts it from the sum and adds the integer to toString
	 */
	public void subtract (int value) {
		this.total -= value;
		this.chain += " - " + value;
	}

	/**
	 * method that returns a string that contains that logged entires from user
	 */
	public String toString () {
	    return this.chain;
	}

	/**
	 * clears the string and sets total to 0
	 */
	public void clear() {
		this.chain = "0";
		this.total = 0;
	}
}
