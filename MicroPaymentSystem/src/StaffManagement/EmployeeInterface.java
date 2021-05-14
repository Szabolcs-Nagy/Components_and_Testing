package StaffManagement;

import MicropaymentManagementSystem.MicroPayment;

public interface EmployeeInterface {
    
    void receiveMicropayment(MicroPayment microPayment);
    int getMicroPaymentNumber();
}
