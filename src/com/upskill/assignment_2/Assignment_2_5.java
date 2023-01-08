package com.upskill.assignment_2;

public class Assignment_2_5 {

	private static final String MultipicationTable = null;
	private static final String MultiplicationTable = null;

	public static void main(String[] args) {
		myMethod();

	}

	public static void myMethod(){
		for (int row = 1; row<=8;row++){
			for(int col=1; col <=8; col++){
				int MultiplicationTable = row * col;
				
				System.out.print(MultiplicationTable + " ");
			}
			System.out.println("");
		}
	
	}

	
}
