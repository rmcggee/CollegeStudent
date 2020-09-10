package model;

public class CollegeStudentCalcLibrary {

	/**
	 * RMcGee - If Student has GPA > 1.75 they are considered in good standing
	 * @param collegeStudent
	 * @return goodStandingIndicator
	 */

	public Boolean isGoodStanding(CollegeStudent collegeStudent) {
		Boolean goodStandingIndicator = false;
		final double lowRangeGoodStandingGPA = 1.75;

		if (collegeStudent.getCurrentGPA() > lowRangeGoodStandingGPA) {
			goodStandingIndicator = true;
		} else {
			goodStandingIndicator = false;
		}

		return goodStandingIndicator;
	}


}
