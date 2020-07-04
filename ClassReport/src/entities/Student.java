package entities;

public class Student {
	public String name;
	public double note1;
	public double note2;
	public double note3;
	
	//function to return final note 
	public double finalGrade() {
		return note1+note2+note3;
	}
	
	//function to print if student pass or failed
	public void result() {
		if(finalGrade() >= 60 ) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
		}
	}
		
	//function to return the missing point to be approved
	public double missingPoints() {
		if (finalGrade() < 60.0) {
		return 60.0 - finalGrade();
		}
		else {
		return 0.0;
		}
	}
}
