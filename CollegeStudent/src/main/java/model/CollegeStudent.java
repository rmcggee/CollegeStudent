package model;

public class CollegeStudent {

	// Ruth McGee
	private String fullName;
	private int age;
	private double currentGPA;

	// constructor
	public CollegeStudent (String inputName) {
		this.fullName = inputName;
	}

	//getters and setters
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public double getCurrentGPA() {
		return currentGPA;
	}
	public void setCurrentGPA(double currentGPA) {
		this.currentGPA = currentGPA;
	}

}
