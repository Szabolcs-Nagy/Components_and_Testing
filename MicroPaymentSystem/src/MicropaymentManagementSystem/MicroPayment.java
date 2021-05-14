package MicropaymentManagementSystem;
//Change
import BeenzManagement.Bonus;
import StaffManagement.Employee;

public class MicroPayment implements MicroPaymentInterface {

    private Employee employee;
    private String productName;
    private Bonus bonus;
    
    public MicroPayment(){
        
    }
    public MicroPayment(Employee employee, String productName, Bonus bonus){
        this.employee = employee;
        this.productName = productName;
        this.bonus = bonus;
        bonus.clearInformation();
    }

    public MicroPayment(String productName, Bonus bonus) {
        this.productName = productName;
        this.bonus = bonus;
    }
    @Override
    public String getProductName() {
        return productName;
    }
    @Override
    public void setProductName(String productName) {
        this.productName = productName;
    }
}
