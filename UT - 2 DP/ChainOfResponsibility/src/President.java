public class President extends LoanApprover{

    @Override
    public void ApproveLoan(Loan l) {
        if(l.amount <= 15000){
            System.out.println("Loan approved by president");
        }else{
            System.out.println("loan cannot be approved");
        }
    }
    
}
