package MicropaymentManagementSystem;



import BeenzManagement.Bonus;
import BeenzManagement.Request;
import StaffManagement.Employee;
import java.util.List;

public interface IMicroPaymentManagementSystem {
	
	// Constraints:
	// Each Employee can only receive bonus for the information they are using or contributing;
	// Each Bonus can only be received for opened document or contributed information;
	
    	List<Bonus> getBonusesPerEmployee(Employee employee);

	int bonusCount(Bonus bonus);	
	
	void allocateBonus(Employee employee);
	        
        void onRedeem(Request redeemCommand);
        
	void onCollect(Request collectCommand);
        
        void undoRequest();
}
