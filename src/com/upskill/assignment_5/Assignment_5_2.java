package com.upskill.assignment_5;

public class Assignment_5_2 {
	public String fizzBuzz(Integer i) {
		String result = "";
		if (i % 3 == 0) {
		    result += "Fizz";
		}
		if (i % 5 == 0) {
		    result += "Buzz";
		}
		if (result.equals("")) {
		    result = i.toString();
		}
		return result;
		}

}
