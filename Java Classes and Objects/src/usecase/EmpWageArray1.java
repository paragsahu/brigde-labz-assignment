package usecase;

public class EmpWageArray {

	public String COMPANY = "";
	public int EMP_RATE_PER_HOURS = 0;
	public int NUM_OF_WORK_DAYS = 0;
	public int MAX_HOURS_PER_MONTH = 0;
	public int totalEmpWage;

	// constructor stub
	public EmpWageArray(int NUM_OF_WORK_DAYS, int MAX_HOURS_PER_MONTH, int EMP_RATE_PER_HOURS, String COMPANY) {
		this.COMPANY = COMPANY;
		this.EMP_RATE_PER_HOURS = EMP_RATE_PER_HOURS;
		this.MAX_HOURS_PER_MONTH = MAX_HOURS_PER_MONTH;
		this.NUM_OF_WORK_DAYS = NUM_OF_WORK_DAYS;
		totalEmpWage = 0;

	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	/* method stub */
	@Override
	public String toString() {
		return "Toatal Emp Wage for com " + COMPANY + " total wage for Emp ->" + totalEmpWage;
	}
}

public class EmpWageArray1 {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private int numOfCompany = 0;
	private EmpWageArray1[] EmpWageArray;

	public EmpWageArray1() {
		// TODO Auto-generated constructor stub
		EmpWageArray = new EmpWageArray1[5];
	}

	private void addCompanyEmpWage(String COMPANY, int EMP_RATE_PER_HOURS, int NUM_OF_WORK_DAYS,
			int MAX_HOURS_PER_MONTH) {
		EmpWageArray[numOfCompany] = new EmpWageArray(MAX_HOURS_PER_MONTH, MAX_HOURS_PER_MONTH, MAX_HOURS_PER_MONTH,
				COMPANY);
		numOfCompany++;
	}

	private void countEmpWage() {
		for (int i = 0; i < numOfCompany; i++) {
			EmpWageArray[i].setTotalEmpWage(this.countEmpWage(EmpWageArray[i]));
			System.out.println(EmpWageArray[i]);

		}

	}

	private int countEmpWage(EmpWageArray1 empWage) {
		// TODO Auto-generated method stub
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		int empCheck;
		while (totalEmpHrs <= empWage.MAX_HOURS_PER_MONTH && totalWorkingDays <= empWage.NUM_OF_WORK_DAYS)
			empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck) {

		case IS_PART_TIME:
			empHrs = 8;
			break;

		case IS_FULL_TIME:
			empHrs = 4;
			break;

		default:
			empHrs = 0;
		}
		totalEmpHrs += empHrs;
		System.out.println("day -> " + totalWorkingDays + "hrs " + empHrs);
		return totalEmpHrs * empWage.EMP_RATE_PER_HOURS;
	}
	
	public static void main(String[] args) {
		
		EmpWageArray1 obj1 = new EmpWageArray1();
        obj1.addCompanyEmpWage("Apple", 20, 2, 10);
       obj1.addCompanyEmpWage("Google", 20, 2, 10);
	}

}

