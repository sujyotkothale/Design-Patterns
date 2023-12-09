public class Manager extends LoanApprover{

    @Override
    public void ApproveLoan(Loan l) {
        if(l.amount <= 10000){
            System.out.println("Loan approved by manager");
        }else{
            upper.ApproveLoan(l);
        }
    }
    
}
