public class Clerk  extends LoanApprover{

    @Override
    public void ApproveLoan(Loan l) {
        if(l.amount <= 5000){
            System.out.println("Loan approved by clerk");
        }else{
            upper.ApproveLoan(l);
        }
    }
    
}
