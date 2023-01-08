package com.upskill.assignment_5;

public class Assignment_5_1 {
	
	
	public Integer maximum(Integer[] list) {

		int maximum = list[0];
		for (int i : list) {
		    if (i > maximum) {
		        maximum = i;
		    }
		}
		return maximum;
		}


}
