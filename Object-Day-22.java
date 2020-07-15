package usecase;

public class AllUseCasesIn1 {

	/* IS_PRESNET IS CONSTANT VAL */
	public static final int IS_PRESNET = 1;

	/* Employees Wage Rate/Hour */
	public static final int RATE_PER_HOUR = 200;

	/* Employees Wage Rate of part time */
	public static final int PART_TIME = 4;

	/* Employees Hour in a day */
	public static final int FULL_TIME = 8;

	// Month Wage days
	public static final int DAYS_IN_MONTH = 20;

	/* Per Day Sal */
	public static final int PER_DAY_SAL = FULL_TIME * RATE_PER_HOUR;

	public static int day = 20;
	public static int hrs = 100;

	/* Check Is Present_OR_Not */
	public   void checkAttendences() {
		/* using floor for roundOff 0/1 & math.random where we 0 or 1 */
		double randomValue = Math.floor(Math.random() * 10) % 2;

		/* check condition is TRUE go inside loop */
		if (IS_PRESNET == randomValue) {
			System.out.println("Employee ->  Is Present");
		}

		// false the is print Not Present
		else
			System.out.println(" Employee ->  Not Present");

	}

	/* Calculate Employees Wage */
	public   void empWage() {
		/* Calculate total wage per day */
		double salEmp = RATE_PER_HOUR * FULL_TIME;
		System.out.println("Salay -> " + salEmp);
	}

	/* Calculate and Checking Employees Wage */
	public   void empPartFullTime() {
		/* Calculate total wage per day */
		int isPartTime = 1;
		int isFullTime = 2;

		if (isPartTime == 1) {
			int partTimeSal = PART_TIME * RATE_PER_HOUR;
			System.out.println("Part Time Salary -> " + partTimeSal);
		}

		else if (isFullTime == 2) {
			int partTimeSal = FULL_TIME * RATE_PER_HOUR;
			System.out.println("Full Time Salary -> " + partTimeSal);
		}

	}

	// Solving using Switch Case Statement
	public   void switchCaseUC4() {
		int perHourRate = 100;
		/*
		 * Scanner sc = new Scanner(System.in); int partTime = sc.nextInt(); int
		 * fullTime = sc.nextInt();
		 */

		switch (perHourRate) {
		case 1:
			System.out.println(PART_TIME * perHourRate);
			break;

		case 2:
			System.out.println(FULL_TIME * perHourRate);
			break;

		default:
			break;

		}
	}

	// Calculating Wages for a Month
	public   void calMonthWage() {
		int monthlySal = PER_DAY_SAL * DAYS_IN_MONTH;
		System.out.println("Monthly Salary ->" + monthlySal);
	}

	public static void useCase6() {

		if (day == 20 && hrs == 100) {
			int monthlySal = PER_DAY_SAL * DAYS_IN_MONTH;
			System.out.println(" uc 6 ->" + monthlySal);
		}

	}

	public static void main(String[] args) {
		
		AllUseCasesIn1 object = new AllUseCasesIn1();

		/* Here calling Function were Emp Present */
		object.checkAttendences();

		/* Calculate Emp Wage */
		object.empWage();

		/* Calculate Emp Wage According Part or Full Time */
		object.empPartFullTime();

		object.switchCaseUC4();

		object.calMonthWage();

		object.useCase6();
	}

}
A
