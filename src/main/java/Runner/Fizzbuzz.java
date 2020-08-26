package Runner;

import static org.junit.Assert.*;

import org.junit.Test;

public class Fizzbuzz {
	
	public String play(int number){
		if (number == 0){
			throw new IllegalArgumentException("number is 0");
		}
		if(number==3)
			return "Fizz";
		if(number ==5)
			return "buzz";
		return String.valueOf(number);
	}

}
