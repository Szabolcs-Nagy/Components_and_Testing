package StaffManagement;

import BeenzManagement.Bonus;
import MicropaymentManagementSystem.MicroPayment;
import java.util.ArrayList;
import java.util.List;

// Employee component
public class Employee implements EmployeeInterface{
	//attributes
	private int id;
	private String name;
        Bonus bonus;
	//one to many link
	private List<MicroPayment> microPayments;
	
	public Employee (){		
	}
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
                
                microPayments = new ArrayList<MicroPayment>();
	}
	@Override
	public void receiveMicropayment(MicroPayment microPayment){
		microPayments.add(microPayment);
	}
        @Override
        public int getMicroPaymentNumber() {
            return microPayments.size();
        }
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<MicroPayment> getMicroPayments() {
            return microPayments;
        }

        public void setBonus(List<MicroPayment> microPayments) {
            this.microPayments = microPayments;
        }
}
