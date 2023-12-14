package Day02;

public  class EmployeeMain {
	public static void main(String[] args) {
		Loans loan = new Loans();
		Employee ee1 = new PermanentEmployee(01, "venkat",424000 );
		Employee ee2 = new TemporaryEmployee(02, "basha"
				+ "", 30,1200 );
		double loanOfPermanentE = loan.calculateLoanAmount(ee1);
		double loanOfTemproryE =  loan.calculateLoanAmount(ee2);
		System.out.println("Temporary Employee  Loan: "+loanOfTemproryE);
		System.out.println("Permanent Employee  Loan: "+loanOfPermanentE);

	}
	
}
