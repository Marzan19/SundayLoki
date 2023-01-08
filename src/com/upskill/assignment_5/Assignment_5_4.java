package com.upskill.assignment_5;

public class Assignment_5_4 {

	
	public String decode(String code) {
		String decoded = "";
		int lastCharValue = 'z';
		int alphabetLength = 'z' - 'a' + 1;
		for (char character: code.toCharArray()) {
		    int charNoRotation = character + 5;
		    int charValue = charNoRotation < lastCharValue ? charNoRotation : charNoRotation - alphabetLength;
		    decoded += (char) charValue;}
		return decoded;		

	}
	}
