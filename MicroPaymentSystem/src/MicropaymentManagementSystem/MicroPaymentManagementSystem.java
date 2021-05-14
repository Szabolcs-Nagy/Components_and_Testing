package MicropaymentManagementSystem;

import BeenzManagement.Bonus;
import BeenzManagement.Request;
import StaffManagement.Employee;
import StaffManagement.EmployeeInterface;
import java.util.List;

public class MicroPaymentManagementSystem implements IMicroPaymentManagementSystem {
        
        EmployeeInterface employeeInterface = new Employee();
        MicroPaymentInterface microPayment = new MicroPayment();
        //This class is the invoker of the command pattern; 
        //Initializing commands
        Request redeemCommand, collectCommand, undoCommand;

        @Override
        public void onCollect(Request collectCommand){
            this.collectCommand=collectCommand;
            collectCommand.execute();
            undoCommand=collectCommand;
        }
        @Override
        public void onRedeem(Request redeemCommand){
           this.redeemCommand=redeemCommand;
           redeemCommand.execute();
           undoCommand=redeemCommand;
        }

        @Override
        public void undoRequest(){
             undoCommand.undo();
        }
        
	@Override
	public void allocateBonus(Employee employee) {
		
	}

	@Override
	public List<Bonus> getBonusesPerEmployee(Employee employee) {
		
		return null;
	}

	@Override
	public int bonusCount(Bonus bonus) {
		
		return 0;
	}
	
}
