public class App {
    public static void main(String[] args) throws Exception {
        LoanApprover manager,clerk,president;
        clerk = new Clerk();
        manager = new Manager();
        president = new President();

        clerk.setApprover(manager);
        manager.setApprover(president);

        clerk.ApproveLoan(new Loan(5000, null));
        clerk.ApproveLoan(new Loan(10000, null));
        clerk.ApproveLoan(new Loan(15000, null));
        clerk.ApproveLoan(new Loan(25000, null));

    }
}
