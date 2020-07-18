package usecase;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public interface ICopmuteEmpWage {

	public void addCompanyEmpWage(int NUM_OF_WORK_DAYS, int MAX_HOURS_PER_MONTH, int EMP_RATE_PER_HOURS,
			String COMPANY);

	public void computeEmpWage();

	public int getToatalWage(String company);

}

public class CompanyEmpWage {

	public String COMPANY = "";
	public int EMP_RATE_PER_HOURS = 0;
	public int NUM_OF_WORK_DAYS = 0;
	public int MAX_HOURS_PER_MONTH = 0;
	public int totalEmpWage;

	// constructor stub
	public CompanyEmpWage(int NUM_OF_WORK_DAYS, int MAX_HOURS_PER_MONTH, int EMP_RATE_PER_HOURS, String COMPANY) {
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

public class EmpWageBuilder implements ICopmuteEmpWage {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private int numOfCompany = 0;
	private LinkedList<CompanyEmpWage> companyEmpWageList;
	private Map<String, CompanyEmpWage> companyEmpWageMap;

	public EmpWageBuilder() {
		companyEmpWageList = new LinkedList<CompanyEmpWage>();
		companyEmpWageMap = new HashMap<String, CompanyEmpWage>();
	}

	@Override
	public void addCompanyEmpWage(int NUM_OF_WORK_DAYS, int MAX_HOURS_PER_MONTH, int EMP_RATE_PER_HOURS,
			String COMPANY) {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(NUM_OF_WORK_DAYS, MAX_HOURS_PER_MONTH, EMP_RATE_PER_HOURS,
				COMPANY);
		companyEmpWageList.add(companyEmpWage);
		companyEmpWageMap.put(COMPANY, companyEmpWage);

	}

	@Override
	public void computeEmpWage() {
		for (int i = 0; i < companyEmpWageList.size(); i++) {
			CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}

	}

	public  int computeEmpWage(CompanyEmpWage companyEmpWage) {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		int empCheck = 0;
		while (totalEmpHrs <= companyEmpWage.MAX_HOURS_PER_MONTH && totalWorkingDays <= companyEmpWage.NUM_OF_WORK_DAYS)
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
		return totalEmpHrs * companyEmpWage.EMP_RATE_PER_HOURS;
	}

	@Override
	public int getToatalWage(String company) {

		return companyEmpWageMap.get(company).totalEmpWage;
	}

	public static void main(String[] args) {
		
		ICopmuteEmpWage empWageBuilder = new EmpWageBuilder();
		empWageBuilder.addCompanyEmpWage(10, 20, 2, "Apple");
		empWageBuilder.addCompanyEmpWage(10, 20, 2, "Google");
		empWageBuilder.computeEmpWage();
		

	}
}
