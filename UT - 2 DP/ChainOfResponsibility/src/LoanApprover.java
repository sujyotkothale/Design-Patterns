/**
 * LoanApprover
 */
public abstract class LoanApprover {
    LoanApprover upper;
    public abstract void ApproveLoan(Loan l);
    public void setApprover(LoanApprover l){
        upper = l;
    }
}